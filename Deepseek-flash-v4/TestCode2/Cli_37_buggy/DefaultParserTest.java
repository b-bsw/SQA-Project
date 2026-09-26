package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

public class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    private Options options(Option... options) {
        Options result = new Options();
        for (Option option : options) {
            result.addOption(option);
        }
        return result;
    }

    private Option flag(String opt) {
        return new Option(opt, false, "flag " + opt);
    }

    @Test
    public void testParseNoArguments() throws Exception {
        CommandLine cl = parser.parse(new Options(), new String[0]);

        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testShortOptionNoArg() throws Exception {
        Options options = options(flag("a"));

        CommandLine cl = parser.parse(options, new String[] {"-a"});

        assertTrue(cl.hasOption("a"));
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testShortOptionAttachedValue() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        CommandLine cl = parser.parse(options, new String[] {"-fout.txt"});

        assertTrue(cl.hasOption("f"));
        assertEquals("out.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testShortOptionSeparateValue() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        CommandLine cl = parser.parse(options, new String[] {"-f", "out.txt"});

        assertEquals("out.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testShortOptionEqualsValue() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        CommandLine cl = parser.parse(options, new String[] {"-f=out.txt"});

        assertEquals("out.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testLongOptionNoArg() throws Exception {
        Options options = options(new Option("v", "verbose", false, "verbose"));

        CommandLine cl = parser.parse(options, new String[] {"--verbose"});

        assertTrue(cl.hasOption("v"));
    }

    @Test
    public void testLongOptionPartialUniqueMatch() throws Exception {
        Options options = options(new Option("v", "verbose", false, "verbose"));

        CommandLine cl = parser.parse(options, new String[] {"--verb"});

        assertTrue(cl.hasOption("v"));
    }

    @Test
    public void testLongOptionSeparateValue() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        CommandLine cl = parser.parse(options, new String[] {"--file", "out.txt"});

        assertEquals("out.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testLongOptionEqualsValue() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        CommandLine cl = parser.parse(options, new String[] {"--file=out.txt"});

        assertEquals("out.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testConcatenatedShortOptions() throws Exception {
        Options options = options(flag("a"), flag("b"));

        CommandLine cl = parser.parse(options, new String[] {"-ab"});

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testConcatenatedShortOptionsWithValue() throws Exception {
        Option a = flag("a");
        Option b = new Option("b", "bravo", true, "bravo");
        Options options = options(a, b);

        CommandLine cl = parser.parse(options, new String[] {"-ab", "value"});

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testDoubleDashStopsOptionParsing() throws Exception {
        Options options = options(flag("a"), flag("b"));

        CommandLine cl = parser.parse(options, new String[] {"-a", "--", "-b"});

        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("-b", cl.getArgs()[0]);
    }

    @Test
    public void testNormalNonOptionArgumentDoesNotStopParsing() throws Exception {
        Options options = options(flag("a"));

        CommandLine cl = parser.parse(options, new String[] {"foo", "-a"});

        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("foo", cl.getArgs()[0]);
    }

    @Test
    public void testStopAtNonOptionStopsParsing() throws Exception {
        Options options = options(flag("a"));

        CommandLine cl = parser.parse(options, new String[] {"foo", "-a"}, true);

        assertFalse(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("foo", cl.getArgs()[0]);
        assertEquals("-a", cl.getArgs()[1]);
    }

    @Test
    public void testNegativeNumberIsTreatedAsValue() throws Exception {
        Options options = options(new Option("n", "num", true, "number"));

        CommandLine cl = parser.parse(options, new String[] {"-n", "-1"});

        assertEquals("-1", cl.getOptionValue("n"));
    }

    @Test
    public void testJavaPropertyStyleOption() throws Exception {
        Option d = new Option("D", "property", true, "property");
        d.setArgs(2);
        d.setValueSeparator('=');
        Options options = options(d);

        CommandLine cl = parser.parse(options, new String[] {"-Dkey=value"});

        assertTrue(cl.hasOption("D"));
        assertEquals(2, cl.getOptionValues("D").length);
        assertEquals("key", cl.getOptionValues("D")[0]);
        assertEquals("value", cl.getOptionValues("D")[1]);
    }

    @Test
    public void testPropertiesLoadOption() throws Exception {
        Options options = options(flag("a"));
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testOptionGroupSelection() throws Exception {
        Option a = flag("a");
        Option b = flag("b");

        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);

        Options options = new Options();
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[] {"-a"});

        assertTrue(cl.hasOption("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentThrows() throws Exception {
        Options options = options(new Option("f", "file", true, "file"));

        parser.parse(options, new String[] {"-f"});
    }

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOptionThrows() throws Exception {
        Option required = flag("a");
        required.setRequired(true);
        Options options = options(required);

        parser.parse(options, new String[0]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownShortOptionThrows() throws Exception {
        parser.parse(options(flag("a")), new String[] {"-z"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownLongOptionThrows() throws Exception {
        parser.parse(options(flag("a")), new String[] {"--unknown"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousOptionThrows() throws Exception {
        Options options = options(
                new Option("a", "foo", false, "foo"),
                new Option("b", "foobar", false, "foobar")
        );

        parser.parse(options, new String[] {"--fo"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownPropertyThrows() throws Exception {
        Options options = options(flag("a"));
        Properties props = new Properties();
        props.setProperty("unknown", "true");

        parser.parse(options, new String[0], props, false);
    }
}