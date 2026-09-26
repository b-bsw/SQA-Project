package org.apache.commons.cli2.commandline;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl commandLine;
    private Option root;
    private Set<String> prefixes;

    @Before
    public void setUp() {
        prefixes = new HashSet<>(Arrays.asList("-", "/"));
        root = newOption("root", new HashSet<>(Collections.singletonList("root")));
        commandLine = new WriteableCommandLineImpl(root, new ArrayList<>(Arrays.asList("a", "b c")));
    }

    private static Set<String> set(String... values) {
        return new HashSet<>(Arrays.asList(values));
    }

    @SuppressWarnings("unchecked")
    private static Option newOption(String preferredName, Set<String> triggers) {
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class<?>[]{Option.class},
                new StubOption(preferredName, triggers, Collections.emptySet()));
    }

    @SuppressWarnings("unchecked")
    private static Option newArgument(String preferredName, Set<String> triggers) {
        return (Option) Proxy.newProxyInstance(
                Argument.class.getClassLoader(),
                new Class<?>[]{Option.class, Argument.class},
                new StubOption(preferredName, triggers, Collections.emptySet()));
    }

    private static class StubOption implements InvocationHandler {
        private final String preferredName;
        private final Set<String> triggers;
        private final Set<String> prefixes;

        StubOption(String preferredName, Set<String> triggers, Set<String> prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers;
            this.prefixes = prefixes;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            if (method.getDeclaringClass() == Object.class) {
                if ("equals".equals(method.getName())) {
                    return proxy == args[0];
                }
                if ("hashCode".equals(method.getName())) {
                    return System.identityHashCode(proxy);
                }
                if ("toString".equals(method.getName())) {
                    return preferredName;
                }
            }

            String name = method.getName();
            if ("getPreferredName".equals(name)) {
                return preferredName;
            }
            if ("getTriggers".equals(name)) {
                return triggers;
            }
            if ("getPrefixes".equals(name)) {
                return prefixes;
            }

            Class<?> type = method.getReturnType();
            if (!type.isPrimitive()) {
                return null;
            }
            if (type == boolean.class) {
                return false;
            }
            if (type == char.class) {
                return '\0';
            }
            if (type == byte.class) {
                return (byte) 0;
            }
            if (type == short.class) {
                return (short) 0;
            }
            if (type == int.class) {
                return 0;
            }
            if (type == long.class) {
                return 0L;
            }
            if (type == float.class) {
                return 0.0f;
            }
            if (type == double.class) {
                return 0.0d;
            }
            return null;
        }
    }

    @Test
    public void testAddOptionAndLookup() {
        Option opt = newOption("--opt", set("--opt", "-o"));

        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption(opt));
        assertSame(opt, commandLine.getOption("--opt"));
        assertSame(opt, commandLine.getOption("-o"));
        assertNull(commandLine.getOption("unknown"));
        assertTrue(commandLine.getOptions().contains(opt));
        assertTrue(commandLine.getOptionTriggers().contains("--opt"));
        assertTrue(commandLine.getOptionTriggers().contains("-o"));
    }

    @Test
    public void testAddValueForNonArgumentDoesNotAddOption() {
        Option opt = newOption("--val", set("--val"));

        commandLine.addValue(opt, "one");

        assertEquals(Arrays.asList("one"), commandLine.getUndefaultedValues(opt));
        assertEquals(Arrays.asList("one"), commandLine.getValues(opt, null));
        assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void testAddValueForArgumentAddsOption() {
        Option arg = newArgument("--arg", set("--arg"));

        commandLine.addValue(arg, "one");

        assertTrue(commandLine.hasOption(arg));
        assertEquals(Arrays.asList("one"), commandLine.getUndefaultedValues(arg));
    }

    @Test
    public void testAddSwitchAndReadIt() {
        Option opt = newOption("--verbose", set("--verbose"));

        assertFalse(commandLine.getSwitch(opt, false));

        commandLine.addSwitch(opt, true);

        assertTrue(commandLine.getSwitch(opt, false));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchRejectsDuplicate() {
        Option opt = newOption("--verbose", set("--verbose"));
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetValuesUsesCommandLineBeforeDefaults() {
        Option opt = newOption("--num", set("--num"));

        commandLine.setDefaultValues(opt, Arrays.asList("d1", "d2"));
        commandLine.addValue(opt, "actual");

        assertEquals(Arrays.asList("actual"), commandLine.getValues(opt, Arrays.asList("default")));
    }

    @Test
    public void testGetValuesUsesDefaultsWhenNoValuePresent() {
        Option opt = newOption("--num", set("--num"));

        commandLine.setDefaultValues(opt, Arrays.asList("d1", "d2"));

        assertEquals(Arrays.asList("d1", "d2"), commandLine.getValues(opt, null));
    }

    @Test
    public void testGetUndefaultedValuesOnlyReturnsCommandLineValues() {
        Option opt = newOption("--x", set("--x"));

        assertTrue(commandLine.getUndefaultedValues(opt).isEmpty());

        commandLine.addValue(opt, "v");

        assertEquals(Collections.singletonList("v"), commandLine.getUndefaultedValues(opt));
    }

    @Test
    public void testLooksLikeOptionChecksConfiguredPrefixes() {
        assertTrue(commandLine.looksLikeOption("-x"));
        assertTrue(commandLine.looksLikeOption("/x"));
        assertFalse(commandLine.looksLikeOption("x"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testToStringQuotesArgumentsWithSpaces() {
        commandLine = new WriteableCommandLineImpl(root, Arrays.asList("a", "b c"));
        assertEquals("a \"b c\"", commandLine.toString());
    }

    @Test
    public void testGetNormalisedReturnsUnmodifiableView() {
        List<String> args = new ArrayList<>(Collections.singletonList("one"));
        commandLine = new WriteableCommandLineImpl(root, args);

        assertNotSame(args, commandLine.getNormalised());
        assertTrue(commandLine.getNormalised().contains("one"));

        try {
            commandLine.getNormalised().add("two");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testAddAndReadOptionProperty() {
        Option opt = newOption("--D", set("--D"));

        assertNull(commandLine.getProperty(opt, "key"));

        commandLine.addProperty(opt, "key", "value");

        assertEquals("value", commandLine.getProperty(opt, "key"));
        assertNull(commandLine.getProperty(opt, "missing"));
    }

    @Test
    public void testGetPropertiesForOption() {
        Option opt = newOption("--P", set("--P"));

        assertTrue(commandLine.getProperties(opt).isEmpty());

        commandLine.addProperty(opt, "a", "1");
        commandLine.addProperty(opt, "b", "2");

        Set<?> props = commandLine.getProperties(opt);
        assertEquals(2, props.size());
        assertTrue(props.contains("a"));
        assertTrue(props.contains("b"));

        try {
            props.add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testDefaultStringPropertyIsReadable() {
        commandLine.addProperty("name", "value");

        assertEquals("value", commandLine.getProperty("name"));
        assertTrue(commandLine.getProperties().contains("name"));
    }
}