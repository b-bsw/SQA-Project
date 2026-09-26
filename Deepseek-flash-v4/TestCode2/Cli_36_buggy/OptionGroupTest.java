package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionGroupTest {

    private OptionGroup group;
    private Option optionA;
    private Option optionB;

    @Before
    public void setUp() {
        group = new OptionGroup();
        optionA = new Option("a", "a", false, "descA");
        optionB = new Option("b", "b", false, "descB");
    }

    @Test
    public void testAddOptionReturnsThisAndStores() {
        assertSame(group, group.addOption(optionA));
        group.addOption(optionB);
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(optionA));
        assertTrue(group.getOptions().contains(optionB));
        assertTrue(group.getNames().contains("a"));
        assertTrue(group.getNames().contains("b"));
    }

    @Test
    public void testEmptyGroup() {
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getNames().isEmpty());
        assertFalse(group.isRequired());
        assertNull(group.getSelected());
        assertEquals("[]", group.toString());
    }

    @Test
    public void testSetSelectedNormalAndSameOption() {
        group.setSelected(optionA);
        assertEquals("a", group.getSelected());
        group.setSelected(new Option("a", "a", false, "descA2"));
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedNullResets() {
        group.setSelected(optionA);
        group.setSelected(null);
        assertNull(group.getSelected());
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelectedDifferentOptionThrows() throws AlreadySelectedException {
        group.setSelected(optionA);
        group.setSelected(optionB);
    }

    @Test
    public void testSetRequired() {
        assertFalse(group.isRequired());
        group.setRequired(true);
        assertTrue(group.isRequired());
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testToStringSingleOption() {
        group.addOption(optionA);
        assertEquals("[-a descA]", group.toString());
    }

    @Test
    public void testToStringOptionWithoutDescription() {
        group.addOption(new Option("c", "c", false, null));
        assertEquals("[-c]", group.toString());
    }

    @Test
    public void testToStringLongOptOnly() {
        group.addOption(new FakeOption(null, "long1", null, "key1"));
        assertEquals("[--long1]", group.toString());
    }

    @Test
    public void testToStringLongOptWithDescription() {
        group.addOption(new FakeOption(null, "long2", "desc2", "key2"));
        assertEquals("[--long2 desc2]", group.toString());
    }

    @Test
    public void testToStringMultipleOptions() {
        group.addOption(optionA);
        group.addOption(optionB);
        String result = group.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains("-a descA"));
        assertTrue(result.contains("-b descB"));
        assertTrue(result.contains(", "));
    }

    private static class FakeOption extends Option {
        private final String opt;
        private final String longOpt;
        private final String description;
        private final String key;

        FakeOption(String opt, String longOpt, String description, String key) {
            super("x", "x", false, null);
            this.opt = opt;
            this.longOpt = longOpt;
            this.description = description;
            this.key = key;
        }

        @Override
        public String getOpt() {
            return opt;
        }

        @Override
        public String getLongOpt() {
            return longOpt;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public String getKey() {
            return key;
        }
    }
}