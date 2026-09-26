package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import org.junit.Test;

public class HelpFormatterTest {

    private HelpFormatter newFormatter() {
        return new HelpFormatter();
    }

    private Options sampleOptions() {
        Option foo = new Option("f", "foo", false, "foo option");
        Option bar = new Option("b", "bar", true, "bar option");
        bar.setArgName("file");

        Options options = new Options();
        options.addOption(foo);
        options.addOption(bar);
        return options;
    }

    private String renderOptions(HelpFormatter formatter, Options options) {
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        return sb.toString();
    }

    @Test
    public void testDefaults() {
        HelpFormatter formatter = newFormatter();

        assertEquals(74, formatter.getWidth());
        assertEquals(1, formatter.getLeftPadding());
        assertEquals(3, formatter.getDescPadding());
        assertEquals("usage: ", formatter.getSyntaxPrefix());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        HelpFormatter formatter = newFormatter();

        formatter.setWidth(80);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("--");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("value");
        formatter.setNewLine("\r\n");

        assertEquals(80, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("value", formatter.getArgName());
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testSetOptionComparatorToNullResetsToDefault() {
        HelpFormatter formatter = newFormatter();
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetCustomOptionComparator() {
        HelpFormatter formatter = newFormatter();

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        formatter.setOptionComparator(comparator);
        assertSame(comparator, formatter.getOptionComparator());
    }

    @Test
    public void testPrintUsage() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printUsage(writer, 80, "cmd");

        writer.flush();
        assertTrue(out.toString().contains("usage: cmd"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printHelp(
                writer,
                80,
                "app",
                "HEADER",
                sampleOptions(),
                1,
                3,
                "FOOTER",
                false);

        writer.flush();
        String result = out.toString();

        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("HEADER"));
        assertTrue(result.contains("FOOTER"));
        assertTrue(result.contains("--foo"));
        assertTrue(result.contains("--bar"));
    }

    @Test
    public void testPrintHelpWithNullHeaderAndFooter() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printHelp(
                writer,
                80,
                "app",
                null,
                sampleOptions(),
                1,
                3,
                null,
                true);

        writer.flush();
        assertTrue(out.toString().contains("usage: app"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsNullSyntax() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printHelp(
                writer,
                80,
                null,
                null,
                sampleOptions(),
                1,
                3,
                null,
                false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsEmptySyntax() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printHelp(
                writer,
                80,
                "",
                null,
                sampleOptions(),
                1,
                3,
                null,
                false);
    }

    @Test
    public void testPrintOptions() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printOptions(writer, 80, sampleOptions(), 1, 3);

        writer.flush();
        String result = out.toString();

        assertTrue(result.contains("--foo"));
        assertTrue(result.contains("--bar"));
    }

    @Test
    public void testPrintWrapped() {
        HelpFormatter formatter = newFormatter();
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        formatter.printWrapped(writer, 80, "hello world");

        writer.flush();
        assertTrue(out.toString().startsWith("hello world"));
    }

    @Test
    public void testRenderOptionsContainsShortAndLongOptions() {
        HelpFormatter formatter = newFormatter();
        String result = renderOptions(formatter, sampleOptions());

        assertTrue(result.contains("--foo"));
        assertTrue(result.contains("--bar"));
    }

    @Test
    public void testRenderOptionsWithOptionGroup() {
        HelpFormatter formatter = newFormatter();
        Options options = new Options();

        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "alpha option"));
        group.addOption(new Option("b", "beta", false, "beta option"));
        options.addOptionGroup(group);

        String result = renderOptions(formatter, options);

        assertTrue(result.contains("["));
        assertTrue(result.contains(" | "));
        assertTrue(result.contains("]"));
    }

    @Test
    public void testRenderOptionsUsesLongOptionSeparator() {
        HelpFormatter formatter = newFormatter();
        formatter.setLongOptSeparator("=");

        Option verbose = new Option(null, "verbose", true, "verbose mode");
        verbose.setArgName("level");

        Options options = new Options();
        options.addOption(verbose);

        String result = renderOptions(formatter, options);

        assertTrue(result.contains("--verbose"));
        assertTrue(result.contains("="));
        assertTrue(result.contains("<level>"));
    }

    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = newFormatter();

        assertEquals("   ", formatter.createPadding(3));
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        HelpFormatter formatter = newFormatter();

        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc"));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("abc", formatter.rtrim("abc\t\n"));
    }

    @Test
    public void testRenderWrappedText() {
        HelpFormatter formatter = newFormatter();
        StringBuffer sb = new StringBuffer();

        StringBuffer result = formatter.renderWrappedText(sb, 10, 0, "aa bb cc");

        assertSame(sb, result);
        assertTrue(result.toString().contains("aa"));
        assertTrue(result.toString().contains("bb"));
        assertTrue(result.toString().contains("cc"));
    }

    @Test
    public void testFindWrapPosWithNewline() {
        HelpFormatter formatter = newFormatter();

        assertEquals(6, formatter.findWrapPos("hello\nworld", 5, 0));
    }

    @Test
    public void testFindWrapPosWithTab() {
        HelpFormatter formatter = newFormatter();

        assertEquals(2, formatter.findWrapPos("a\tb", 2, 0));
    }

    @Test
    public void testFindWrapPosWhenTextFits() {
        HelpFormatter formatter = newFormatter();

        assertEquals(-1, formatter.findWrapPos("short", 20, 0));
    }

    @Test
    public void testFindWrapPosBackwardToSpace() {
        HelpFormatter formatter = newFormatter();

        assertEquals(5, formatter.findWrapPos("hello world foo", 7, 0));
    }

    @Test
    public void testFindWrapPosForwardToSpaceWhenNoSpaceInWindow() {
        HelpFormatter formatter = newFormatter();

        assertEquals(13, formatter.findWrapPos("abcdefghijklm nop", 5, 0));
    }
}