package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import static org.junit.Assert.*;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter writer;
    private PrintWriter pw;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        writer = new StringWriter();
        pw = new PrintWriter(writer);
    }

    @After
    public void tearDown() {
        pw.close();
    }

    @Test
    public void testDefaultValues() {
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
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("/+");
        formatter.setArgName("file");
        formatter.setNewLine("\n");

        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("/+", formatter.getLongOptPrefix());
        assertEquals("file", formatter.getArgName());
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testSetOptionComparatorNullResultsInDefault() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertNotSame(custom, formatter.getOptionComparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsNullCmdLineSyntax() {
        formatter.printHelp(pw, 80, null, "", new Options(), 1, 3, "", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsEmptyCmdLineSyntax() {
        formatter.printHelp(pw, 80, "", "", new Options(), 1, 3, "", false);
    }

    @Test
    public void testPrintHelpWithSimpleOption() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        opt.setArgName("file");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "cmd", "header", options, 2, 4, "footer", false);
        pw.flush();
        String out = writer.toString();

        assertTrue(out.contains("usage: cmd"));
        assertTrue(out.contains("header"));
        assertTrue(out.contains("footer"));
        assertTrue(out.contains("-a,--alpha <file>"));
        assertTrue(out.contains("alpha option"));
    }

    @Test
    public void testPrintHelpWithBlankHeaderAndFooter() {
        Options options = new Options();
        formatter.printHelp(pw, 80, "cmd", "   ", options, 1, 3, "   ", false);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: cmd"));
        assertFalse(out.contains("   "));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        options.addOption("a", false, "alpha desc");
        options.addOption("b", "beta", true, "beta desc");

        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();
        String out = writer.toString();

        assertTrue(out.contains("-a"));
        assertTrue(out.contains("--beta"));
        assertTrue(out.contains("beta desc"));
    }

    @Test
    public void testPrintUsage() {
        formatter.printUsage(pw, 80, "prog -x");
        pw.flush();
        assertEquals("usage: prog -x", writer.toString());
    }

    @Test
    public void testPrintWrappedWithShortText() {
        formatter.printWrapped(pw, 40, "short text");
        pw.flush();
        assertEquals("short text", writer.toString());
    }

    @Test
    public void testPrintWrappedWrapsLongText() {
        formatter.printWrapped(pw, 10, "one two three four five");
        pw.flush();
        String out = writer.toString();
        assertTrue(out.contains("\n"));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("  ", formatter.createPadding(2));
        assertEquals(5, formatter.createPadding(5).length());
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("abc", formatter.rtrim("abc \n\t"));
        assertEquals("", formatter.rtrim("   "));
    }

    @Test
    public void testFindWrapPosNewline() {
        String text = "abc\ndef";
        assertEquals(4, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosTab() {
        String text = "abc\tdef";
        assertEquals(4, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosRestFits() {
        assertEquals(-1, formatter.findWrapPos("abcdef", 10, 0));
    }

    @Test
    public void testFindWrapPosBackwardToSpace() {
        assertEquals(3, formatter.findWrapPos("abc def", 4, 0));
    }

    @Test
    public void testRenderOptionsWithOptionGroup() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha desc");

        OptionGroup group = new OptionGroup();
        group.addOption(new Option("b", "beta", false, "beta desc"));
        group.addOption(new Option("c", "gamma", false, "gamma desc"));
        options.addOptionGroup(group);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);
        String result = sb.toString();

        assertTrue(result.contains("-a"));
        assertTrue(result.contains("[-b | -c]"));
    }

    @Test
    public void testRenderWrappedTextDoesNotAlterShortText() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 40, 4, "short");
        assertEquals("short", sb.toString());
    }

    @Test
    public void testRenderWrappedTextWrapsLongLine() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 4, "one two three four");
        assertTrue(sb.toString().contains("\n"));
    }

    @Test
    public void testPrintHelpAutoUsageDoesNotThrow() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");

        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, true);
        pw.flush();

        String out = writer.toString();
        assertNotNull(out);
        assertTrue(out.contains("usage: cmd"));
    }
}