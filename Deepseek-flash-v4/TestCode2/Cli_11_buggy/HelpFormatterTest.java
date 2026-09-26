package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testDefaults() {
        assertEquals(74, formatter.getWidth());
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
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setNewLine("\n");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("//");
        formatter.setArgName("file");

        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("\n", formatter.getNewLine());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("//", formatter.getLongOptPrefix());
        assertEquals("file", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparator() {
        Comparator reverse = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(reverse);
        assertSame(reverse, formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullUsesDefault() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsNullCmdLineSyntax() {
        formatter.printHelp(pw, 80, null, null, new Options(), 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpRejectsEmptyCmdLineSyntax() {
        formatter.printHelp(pw, 80, "", null, new Options(), 1, 3, null, false);
    }

    @Test
    public void testPrintHelpWithNullHeaderAndFooter() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha desc");

        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, false);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: cmd"));
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("Alpha desc"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha desc");

        Option beta = new Option("b", "beta", true, "Beta desc");
        beta.setArgName("file");
        options.addOption(beta);

        formatter.printHelp(pw, 80, "cmd", "HEADER", options, 1, 3, "FOOTER", false);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: cmd"));
        assertTrue(out.contains("HEADER"));
        assertTrue(out.contains("FOOTER"));
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("--beta"));
        assertTrue(out.contains("Beta desc"));
    }

    @Test
    public void testPrintHelpAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha desc");

        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, true);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: cmd"));
        assertTrue(out.contains("-a"));
    }

    @Test
    public void testPrintUsageWithOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha desc");

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: app"));
        assertTrue(out.contains("-a"));
    }

    @Test
    public void testPrintUsageRequiredOptionHasNoBrackets() {
        Option required = new Option("r", "required", false, "Required desc");
        required.setRequired(true);

        Options options = new Options();
        options.addOption(required);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("-r"));
        assertFalse(out.contains("[-r"));
    }

    @Test
    public void testPrintUsageWithOptionGroup() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Alpha desc"));
        group.addOption(new Option("b", "beta", false, "Beta desc"));

        Options options = new Options();
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("usage: app"));
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("-b"));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha desc");

        Option noDesc = new Option("n", "no-desc", false, null);
        options.addOption(noDesc);

        formatter.printOptions(pw, 60, options, 1, 3);
        pw.flush();

        String out = writer.toString();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("Alpha desc"));
        assertTrue(out.contains("-n"));
        assertTrue(out.contains("--no-desc"));
    }

    @Test
    public void testRenderOptionsEmpty() {
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 40, new Options(), 1, 3);
        assertEquals("", sb.toString());
    }

    @Test
    public void testPrintWrappedNoWrap() {
        formatter.printWrapped(pw, 80, 0, "hello");
        pw.flush();
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testPrintWrappedWrapText() {
        formatter.printWrapped(pw, 7, 2, "a b c d e");
        pw.flush();

        String expected = "a b c d" + formatter.getNewLine() + "  e";
        assertEquals(expected, writer.toString());
    }

    @Test
    public void testRenderWrappedTextWithNewline() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 0, "hello\nworld");

        String expected = "hello" + formatter.getNewLine() + "world";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testFindWrapPos() {
        assertEquals(-1, formatter.findWrapPos("hello", 10, 0));
        assertEquals(5, formatter.findWrapPos("hello world", 6, 0));
        assertEquals(-1, formatter.findWrapPos("hello world", 11, 0));
        assertEquals(6, formatter.findWrapPos("hello\nworld", 20, 0));
        assertEquals(6, formatter.findWrapPos("hello\tworld", 20, 0));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("", formatter.rtrim("   "));
        assertEquals("abc", formatter.rtrim("abc"));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("abc", formatter.rtrim("abc\n\t "));
    }
}