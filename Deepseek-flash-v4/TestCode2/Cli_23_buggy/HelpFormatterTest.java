package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter out;
    private PrintWriter pw;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        out = new StringWriter();
        pw = new PrintWriter(out);
    }

    @Test
    public void testDefaults() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(1, formatter.getLeftPadding());
        assertEquals(3, formatter.getDescPadding());
        assertEquals("usage: ", formatter.getSyntaxPrefix());
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(2);
        assertEquals(2, formatter.getLeftPadding());

        formatter.setDescPadding(4);
        assertEquals(4, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("file");
        assertEquals("file", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorNull() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(formatter.getOptionComparator() != custom);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpWithNullCommandLine() {
        formatter.printHelp(pw, 80, null, null, new Options(), 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpWithEmptyCommandLine() {
        formatter.printHelp(pw, 80, "", null, new Options(), 1, 3, null, false);
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter() {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", true, "alpha description"));

        formatter.printHelp(pw, 120, "cmd", "header", options, 1, 3, "footer", true);
        pw.flush();

        String result = out.toString();
        assertTrue(result.contains("usage: cmd"));
        assertTrue(result.contains("header"));
        assertTrue(result.contains("footer"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
    }

    @Test
    public void testPrintHelpWithNullHeaderAndFooter() {
        formatter.printHelp(pw, 80, "cmd", null, new Options(), 1, 3, null, false);
        pw.flush();

        assertFalse(out.toString().contains("null"));
    }

    @Test
    public void testPrintUsage() {
        Options options = new Options();
        options.addOption("a", false, "desc");

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String result = out.toString();
        assertTrue(result.startsWith("usage: app "));
        assertTrue(result.contains("-a"));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha description");
        opt.setArgName("file");
        options.addOption(opt);

        formatter.printOptions(pw, 120, options, 1, 3);
        pw.flush();

        String result = out.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("<file>"));
        assertTrue(result.contains("alpha description"));
    }

    @Test
    public void testRenderOptionsWithLongOnlyAndGroup() {
        Options options = new Options();

        Option alpha = new Option("a", "alpha", true, "alpha desc");
        alpha.setArgName("arg");
        options.addOption(alpha);

        Option longOnly = new Option(null, "beta", false, "beta desc");
        Option gamma = new Option("c", "gamma", false, "gamma desc");

        OptionGroup group = new OptionGroup();
        group.addOption(longOnly);
        group.addOption(gamma);
        group.setRequired(false);
        options.addOptionGroup(group);

        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 120, options, 1, 3);

        assertSame(sb, result);

        String text = sb.toString();
        assertTrue(text.contains("--beta"));
        assertTrue(text.contains("--gamma"));
        assertTrue(text.contains("alpha desc"));
        assertTrue(text.contains("["));
        assertTrue(text.contains("|"));
        assertTrue(text.contains("]"));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("     ", formatter.createPadding(5));
        assertEquals(10, formatter.createPadding(10).length());
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc"));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("abc", formatter.rtrim("abc\t\n"));
    }

    @Test
    public void testFindWrapPos() {
        assertEquals(6, formatter.findWrapPos("hello\nworld", 10, 0));
        assertEquals(6, formatter.findWrapPos("hello\tworld", 10, 0));
        assertEquals(-1, formatter.findWrapPos("hello", 5, 0));
        assertEquals(5, formatter.findWrapPos("hello world", 5, 0));
        assertEquals(5, formatter.findWrapPos("hello world", 4, 0));
    }

    @Test
    public void testRenderWrappedTextNoWrap() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 0, "short");
        assertEquals("short", sb.toString());
    }

    @Test
    public void testRenderWrappedTextWraps() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 0, "12345 67890");

        String expected = "12345" + formatter.getNewLine() + "67890";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testRenderWrappedTextTooLongThrows() {
        StringBuffer sb = new StringBuffer();
        try {
            formatter.renderWrappedText(sb, 10, 0, "12345 67890 12345");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Text too long"));
        }
    }

    @Test
    public void testPrintWrapped() {
        formatter.printWrapped(pw, 10, 0, "12345 67890");
        pw.flush();

        assertTrue(out.toString().contains(formatter.getNewLine()));
    }
}