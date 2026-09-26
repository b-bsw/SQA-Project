package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter sw;
    private PrintWriter pw;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);
    }

    @Test
    public void testDefaultValues() {
        assertEquals(74, formatter.getWidth());
        assertEquals(1, formatter.getLeftPadding());
        assertEquals(3, formatter.getDescPadding());
        assertEquals("usage: ", formatter.getSyntaxPrefix());
        assertEquals("\n", formatter.getNewLine());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals(" ", formatter.getLongOptSeparator());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage:");
        formatter.setNewLine("\r\n");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("--");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("file");

        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage:", formatter.getSyntaxPrefix());
        assertEquals("\r\n", formatter.getNewLine());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("file", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorNullUsesDefault() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        formatter.setOptionComparator(new java.util.Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        assertEquals(0, formatter.getOptionComparator().compare("a", "b"));
    }

    @Test
    public void testPrintHelpBasic() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        options.addOption(opt);
        formatter.setWidth(40);
        formatter.printHelp(pw, 40, "cmd", "header", options, 1, 3, "footer");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("alpha"));
    }

    @Test
    public void testPrintHelpAutoUsage() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        options.addOption(opt);
        formatter.printHelp("cmd", options, true);
        pw.flush();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullCmdLineSyntax() {
        Options options = new Options();
        formatter.printHelp(pw, 40, null, "header", options, 1, 3, "footer");
        pw.flush();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptyCmdLineSyntax() {
        Options options = new Options();
        formatter.printHelp(pw, 40, "", "header", options, 1, 3, "footer");
        pw.flush();
    }

    @Test
    public void testPrintUsage() {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha opt"));
        options.addOption(new Option("b", "beta", true, "beta opt"));
        formatter.setWidth(50);
        formatter.printUsage(pw, 50, "app", options);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("--beta"));
    }

    @Test
    public void testPrintWrappedNoWrap() {
        formatter.printWrapped(pw, 40, "short text");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("short text"));
    }

    @Test
    public void testPrintWrappedWithWrapping() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append("word ");
        }
        formatter.printWrapped(pw, 20, 2, sb.toString().trim());
        pw.flush();
        String output = sw.toString();
        assertTrue(output.length() > 0);
        String[] lines = output.split("\n");
        assertTrue(lines.length > 1);
    }

    @Test
    public void testRenderWrappedTextWithWidthLessThanNextLineTabStop() {
        StringBuffer sb = new StringBuffer();
        String text = "one two three four five";
        StringBuffer result = formatter.renderWrappedText(sb, 10, 15, text);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFindWrapPos() {
        assertEquals(-1, formatter.findWrapPos("short", 10, 0));
        assertEquals(3, formatter.findWrapPos("one two", 5, 0));
        assertEquals(4, formatter.findWrapPos("one\ntwo", 10, 0));
        assertEquals(4, formatter.findWrapPos("one\ttwo", 10, 0));
        assertEquals(3, formatter.findWrapPos("one two", 3, 0));
        assertEquals(-1, formatter.findWrapPos("one two", 11, 0));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testRtrim() {
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("", formatter.rtrim("   "));
        assertEquals("abc", formatter.rtrim("abc"));
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRenderOptions() {
        Options options = new Options();
        Option a = new Option("a", "alpha", true, "alpha option");
        a.setArgName("argName");
        options.addOption(a);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 40, options, 1, 3);
        assertNotNull(result);
        assertTrue(result.toString().contains("-a"));
        assertTrue(result.toString().contains("--alpha"));
        assertTrue(result.toString().contains("argName"));
    }

    @Test
    public void testRenderOptionsWithGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "alpha"));
        group.addOption(new Option("b", "beta", false, "beta"));
        options.addOptionGroup(group);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 40, options, 1, 3);
        assertNotNull(result);
        String output = result.toString();
        assertTrue(output.contains("["));
        assertTrue(output.contains("|"));
        assertTrue(output.contains("]"));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        options.addOption(new Option("x", "xyz", false, "xray"));
        formatter.printOptions(pw, 50, options, 1, 3);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("-x"));
        assertTrue(output.contains("xray"));
    }

    @Test
    public void testPrintWrappedWithNullText() {
        formatter.printWrapped(pw, 40, null);
        pw.flush();
    }

    @Test
    public void testPrintHelpWithHeaderAndFooterTrims() {
        Options options = new Options();
        options.addOption(new Option("h", "help", false, "help"));
        formatter.printHelp(pw, 60, "cmd", " header ", options, " footer ");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelpWithoutAutoUsageOnInvalidOptions() {
        Options options = new Options();
        options.addOption(new Option("o", "option", false, "options"));
        formatter.printHelp(pw, 50, "cmd", null, options, null);
        pw.flush();
        String output = sw.toString();
        assertFalse(output.contains("Usage:"));
    }

    @Test
    public void testOptionComparatorCompare() {
        HelpFormatter formatter2 = new HelpFormatter();
        Option a = new Option("a", null, false, "a");
        Option b = new Option("B", null, false, "B");
        assertTrue(formatter2.getOptionComparator().compare(a, b) < 0);
    }

    @Test
    public void testPrintUsageWithNullArgName() {
        Options options = new Options();
        Option opt = new Option("c", false, "opt without arg");
        options.addOption(opt);
        formatter.printUsage(pw, 50, "cmd", options);
        pw.flush();
    }

    @Test
    public void testPrintUsageWithOptionWithoutLongOpt() {
        Options options = new Options();
        options.addOption(new Option("d", false, "single dash"));
        formatter.printUsage(pw, 50, "cmd", options);
        pw.flush();
    }

    @Test
    public void testPrintUsageWithOptionGroupNotProcessed() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", false, "a"));
        group.addOption(new Option("b", false, "b"));
        options.addOptionGroup(group);
        formatter.printUsage(pw, 60, "cmd", options);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("["));
    }
}