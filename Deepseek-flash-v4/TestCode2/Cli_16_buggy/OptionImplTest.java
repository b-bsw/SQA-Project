package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class OptionImplTest {

    private static Set<String> setOf(String... values) {
        return new HashSet<String>(Arrays.asList(values));
    }

    private static TestOption option(String name,
                                     String description,
                                     Set<String> prefixes,
                                     Set<String> triggers) {
        return new TestOption(name, description, prefixes, triggers);
    }

    // ---------------------------------------------------------------------
    // canProcess tests
    // ---------------------------------------------------------------------

    @Test
    public void testCanProcessWithMatchingPrefix() {
        TestOption option = option(
                "-D",
                "define a property",
                setOf("-D"),
                setOf("-D"));

        assertTrue(option.canProcess(null, "-Dvalue"));
        assertTrue(option.canProcess(null, "-D"));
    }

    @Test
    public void testCanProcessWithoutMatchingPrefix() {
        TestOption option = option(
                "-D",
                "define a property",
                setOf("-D"),
                setOf("-D"));

        assertFalse(option.canProcess(null, "value"));
        assertFalse(option.canProcess(null, "-X"));
    }

    @Test
    public void testCanProcessWithNullArgument() {
        TestOption option = option(
                "-D",
                "define a property",
                setOf("-D"),
                setOf("-D"));

        assertFalse(option.canProcess(null, (String) null));
    }

    // ---------------------------------------------------------------------
    // equals / hashCode tests
    // ---------------------------------------------------------------------

    @Test
    public void testEqualsWithSameValues() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));
        TestOption b = option("-D", "desc", setOf("-D"), setOf("-D"));

        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testEqualsWithSameObject() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));

        assertTrue(a.equals(a));
    }

    @Test
    public void testEqualsWithNull() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));

        assertFalse(a.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));

        assertFalse(a.equals("not-an-option"));
    }

    @Test
    public void testEqualsWithDifferentName() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));
        TestOption b = option("-E", "desc", setOf("-D"), setOf("-D"));

        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsWithDifferentPrefixes() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));
        TestOption b = option("-D", "desc", setOf("-E"), setOf("-D"));

        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsWithDifferentTriggers() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));
        TestOption b = option("-D", "desc", setOf("-D"), setOf("-E"));

        assertFalse(a.equals(b));
    }

    @Test
    public void testHashCodeIsConsistentWithEquals() {
        TestOption a = option("-D", "desc", setOf("-D"), setOf("-D"));
        TestOption b = option("-D", "desc", setOf("-D"), setOf("-D"));

        assertEquals(a.hashCode(), b.hashCode());
        assertEquals(a.hashCode(), a.hashCode());
    }

    // ---------------------------------------------------------------------
    // Minimal concrete OptionImpl used by the tests
    // ---------------------------------------------------------------------

    private static class TestOption extends OptionImpl {
        private final String name;
        private final String description;
        private final Set<String> prefixes;
        private final Set<String> triggers;

        TestOption(String name,
                   String description,
                   Set<String> prefixes,
                   Set<String> triggers) {
            this.name = name;
            this.description = description;
            this.prefixes = new HashSet<String>(prefixes);
            this.triggers = new HashSet<String>(triggers);
        }

        @Override
        public String getPreferredName() {
            return name;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        @SuppressWarnings("rawtypes")
        public Set getPrefixes() {
            return prefixes;
        }

        @Override
        @SuppressWarnings("rawtypes")
        public Set getTriggers() {
            return triggers;
        }
    }
}