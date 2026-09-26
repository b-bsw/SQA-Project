package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CommandLineTest {

    private CommandLine commandLine;

    @Before
    public void setUp() {
        commandLine = new CommandLine();
    }

    private Option option(String key, String longOpt, String[] values) {
        return new TestOption(key, longOpt, values, String.class,
                key == null ? longOpt.hashCode() : key.hashCode());
    }

    @Test
    public void testEmptyCommandLine() {
        assertFalse(commandLine.hasOption("a"));
        assertFalse(commandLine.hasOption('a'));
        assertNull(commandLine.getOptionValue("a"));
        assertNull(commandLine.getOptionValue('a'));
        assertNull(commandLine.getOptionValues("a"));
        assertNull(commandLine.getOptionValues('a'));
        assertNull(commandLine.getOptionObject("a"));
        assertNull(commandLine.getOptionObject('a'));

        assertEquals("dflt", commandLine.getOptionValue("a", "dflt"));
        assertEquals("dflt", commandLine.getOptionValue('a', "dflt"));

        assertEquals(0, commandLine.getArgs().length);
        assertEquals(0, commandLine.getArgList().size());
        assertEquals(0, commandLine.getOptions().length);
        assertFalse(commandLine.iterator().hasNext());
    }

    @Test
    public void testAddArg() {
        commandLine.addArg("left1");
        commandLine.addArg("left2");

        assertArrayEquals(new String[]{"left1", "left2"}, commandLine.getArgs());
        assertEquals(Arrays.asList("left1", "left2"), commandLine.getArgList());
    }

    @Test
    public void testAddOptionAndRetrieveByShortAndLongName() {
        Option opt = option("a", "alpha", new String[]{"v1", "v2"});
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption("a"));
        assertTrue(commandLine.hasOption('a'));
        assertFalse(commandLine.hasOption("alpha"));
        assertFalse(commandLine.hasOption("-a"));

        assertEquals("v1", commandLine.getOptionValue("a"));
        assertEquals("v1", commandLine.getOptionValue('a'));
        assertEquals("v1", commandLine.getOptionValue("alpha"));
        assertEquals("v1", commandLine.getOptionValue("-alpha"));
        assertEquals("v1", commandLine.getOptionValue("--alpha"));

        assertArrayEquals(new String[]{"v1", "v2"}, commandLine.getOptionValues("a"));
        assertArrayEquals(new String[]{"v1", "v2"}, commandLine.getOptionValues('a'));
        assertArrayEquals(new String[]{"v1", "v2"}, commandLine.getOptionValues("-alpha"));

        assertEquals("v1", commandLine.getOptionValue("a", "dflt"));
        assertEquals("v1", commandLine.getOptionValue('a', "dflt"));
        assertEquals("dflt", commandLine.getOptionValue("missing", "dflt"));
        assertEquals("dflt", commandLine.getOptionValue('x', "dflt"));

        assertEquals(1, commandLine.getOptions().length);
        assertSame(opt, commandLine.getOptions()[0]);

        Iterator iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertSame(opt, iterator.next());
        assertFalse(iterator.hasNext());

        assertEquals("v1", commandLine.getOptionObject("a"));
        assertEquals("v1", commandLine.getOptionObject('a'));
        assertNull(commandLine.getOptionObject("alpha"));
    }

    @Test
    public void testLongOptionWithoutShortKey() {
        Option opt = option(null, "longonly", new String[]{"lv"});
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption("longonly"));
        assertFalse(commandLine.hasOption("placeholder"));
        assertArrayEquals(new String[]{"lv"}, commandLine.getOptionValues("longonly"));
        assertArrayEquals(new String[]{"lv"}, commandLine.getOptionValues("-longonly"));
        assertNull(commandLine.getOptionValues("missing"));
        assertSame(opt, commandLine.getOptions()[0]);
    }

    @Test
    public void testOptionWithoutValues() {
        Option opt = option("n", "noval", null);
        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption("n"));
        assertNull(commandLine.getOptionValues("n"));
        assertNull(commandLine.getOptionValues("noval"));
        assertNull(commandLine.getOptionValue("n"));
        assertNull(commandLine.getOptionObject("n"));
    }

    @Test
    public void testMultipleOptionsAndIterator() {
        Option a = option("a", "alpha", new String[]{"A"});
        Option b = option("b", "beta", new String[]{"B"});

        commandLine.addOption(a);
        commandLine.addOption(b);

        Option[] opts = commandLine.getOptions();
        assertEquals(2, opts.length);
        assertTrue(Arrays.asList(opts).contains(a));
        assertTrue(Arrays.asList(opts).contains(b));

        assertEquals("A", commandLine.getOptionValue("beta"));
        assertEquals("B", commandLine.getOptionValue("-b"));
        assertNull(commandLine.getOptionValue("gamma"));

        List<Option> list = new ArrayList<Option>();
        Iterator iterator = commandLine.iterator();
        while (iterator.hasNext()) {
            list.add((Option) iterator.next());
        }

        assertEquals(2, list.size());
        assertTrue(list.contains(a));
        assertTrue(list.contains(b));
    }

    @Test
    public void testGetOptionObjectWithValueType() {
        commandLine.addOption(option("c", "count", new String[]{"123"}));

        assertEquals("123", commandLine.getOptionObject("c"));
        assertEquals("123", commandLine.getOptionObject('c'));
    }

    @Test
    public void testNullAndEmptyInputs() {
        assertFalse(commandLine.hasOption((String) null));
        assertNull(commandLine.getOptionValue((String) null));
        assertNull(commandLine.getOptionValues((String) null));
        assertNull(commandLine.getOptionObject((String) null));

        assertFalse(commandLine.hasOption(""));
        assertNull(commandLine.getOptionValue(""));
        assertNull(commandLine.getOptionValues(""));
        assertNull(commandLine.getOptionObject(""));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullOptionThrowsNullPointerException() {
        commandLine.addOption(null);
    }

    private static class TestOption extends Option {
        private final String key;
        private final String longOpt;
        private final String[] values;
        private final Object type;
        private final int hash;

        TestOption(String key, String longOpt, String[] values, Object type, int hash) {
            super(key == null ? "placeholder" : key,
                    longOpt == null ? "placeholder-long" : longOpt,
                    values != null,
                    "desc");
            this.key = key;
            this.longOpt = longOpt;
            this.values = values;
            this.type = type;
            this.hash = hash;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getLongOpt() {
            return longOpt;
        }

        @Override
        public String[] getValues() {
            return values;
        }

        @Override
        public Object getType() {
            return type;
        }

        @Override
        public int hashCode() {
            return hash;
        }
    }
}