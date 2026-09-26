package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class OptionsTest {

    @Test
    public void testDefaultState() {
        Options options = new Options();
        assertNotNull(options.getOptions());
        assertTrue(options.getOptions().isEmpty());
        assertTrue(options.getRequiredOptions().isEmpty());
        assertNull(options.getOption("a"));
        assertFalse(options.hasOption("a"));
        assertFalse(options.hasLongOption("a"));
        assertFalse(options.hasShortOption("a"));
        assertEquals(0, options.getMatchingOptions("a").size());
    }

    @Test
    public void testAddOptionWithLongNameAndRetrieval() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "Alpha option");

        assertSame(options, options.addOption(opt));

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasLongOption("alpha"));
        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasLongOption("a"));

        assertSame(opt, options.getOption("a"));
        assertSame(opt, options.getOption("-a"));
        assertSame(opt, options.getOption("--a"));
        assertSame(opt, options.getOption("-alpha"));
        assertSame(opt, options.getOption("--alpha"));
    }

    @Test
    public void testAddOptionOverloads() {
        Options options = new Options();

        assertSame(options, options.addOption("s", "desc"));
        assertTrue(options.hasOption("s"));

        assertSame(options, options.addOption("t", true, "desc"));
        assertTrue(options.hasOption("t"));

        assertSame(options, options.addOption("u", "longu", false, "desc"));
        assertTrue(options.hasOption("u"));
        assertTrue(options.hasOption("longu"));
    }

    @Test
    public void testGetOptionStripsHyphensAndReturnsNullForMissing() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "A");

        assertNotNull(options.getOption("-a"));
        assertNotNull(options.getOption("--a"));
        assertNotNull(options.getOption("-alpha"));
        assertNotNull(options.getOption("--alpha"));
        assertNull(options.getOption("missing"));
    }

    @Test
    public void testHasLongAndShortOptionStripHyphens() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "A");

        assertTrue(options.hasShortOption("-a"));
        assertTrue(options.hasShortOption("--a"));
        assertTrue(options.hasLongOption("-alpha"));
        assertTrue(options.hasLongOption("--alpha"));

        assertFalse(options.hasShortOption("--alpha"));
        assertFalse(options.hasLongOption("--a"));
    }

    @Test
    public void testGetMatchingOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "A");
        options.addOption("b", "alphabet", false, "B");
        options.addOption("c", "beta", false, "C");

        assertEquals(Arrays.asList("alpha"), options.getMatchingOptions("alpha"));
        assertEquals(Arrays.asList("alpha", "alphabet"), options.getMatchingOptions("al"));
        assertEquals(Arrays.asList("alpha", "alphabet"), options.getMatchingOptions("--al"));
        assertEquals(3, options.getMatchingOptions("").size());
        assertTrue(options.getMatchingOptions("zz").isEmpty());
    }

    @Test
    public void testRequiredOptionAddedToList() {
        Options options = new Options();
        Option opt = new Option("r", "required", false, "Required");
        opt.setRequired(true);

        options.addOption(opt);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));

        try {
            required.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetOptionsReturnsUnmodifiableCollection() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "A");

        Collection<Option> opts = options.getOptions();
        assertEquals(1, opts.size());

        try {
            opts.add(new Option("x", "x", false, "X"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddOptionGroupRequired() {
        Option optA = new Option("a", "alpha", false, "A");
        Option optB = new Option("b", "beta", false, "B");
        optA.setRequired(true);
        optB.setRequired(true);

        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);

        Options options = new Options().addOptionGroup(group);

        assertTrue(options.getRequiredOptions().contains(group));
        assertFalse(optA.isRequired());
        assertFalse(optB.isRequired());

        assertSame(group, options.getOptionGroup(optA));
        assertSame(group, options.getOptionGroup(optB));
        assertNull(options.getOptionGroup(new Option("x", "x", false, "X")));

        assertEquals(2, options.getOptions().size());
    }

    @Test
    public void testAddOptionGroupNotRequired() {
        Option opt = new Option("g", "group", false, "G");
        opt.setRequired(true);

        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(opt);

        Options options = new Options().addOptionGroup(group);

        assertTrue(options.getRequiredOptions().isEmpty());
        assertFalse(opt.isRequired());
    }

    @Test
    public void testNullAndEmptyInputs() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "A");

        assertFalse(options.hasOption(null));
        assertFalse(options.hasLongOption(null));
        assertFalse(options.hasShortOption(null));
        assertNull(options.getOption(null));
        assertTrue(options.hasOption(""));
        assertFalse(options.hasOption("none"));
    }

    @Test
    public void testToStringContainsSections() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha");

        String text = options.toString();

        assertTrue(text.contains("[ Options: [ short "));
        assertTrue(text.contains("] [ long "));
        assertTrue(text.contains("alpha"));
    }
}