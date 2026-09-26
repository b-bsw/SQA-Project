package org.apache.commons.cli2.commandline;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set<String> prefixes = new HashSet<String>(Arrays.asList("-", "--"));
        Option root = option("root", prefixes, Collections.<String>emptySet(), null);
        List<String> args = new ArrayList<String>(Arrays.asList("a", "b c"));
        commandLine = new WriteableCommandLineImpl(root, args);
    }

    @Test
    public void testConstructorAndNormalisedList() {
        assertNotNull(commandLine.getOptions());
        assertTrue(commandLine.getOptions().isEmpty());
        assertTrue(commandLine.getOptionTriggers().isEmpty());
        assertEquals(Arrays.asList("a", "b c"), commandLine.getNormalised());

        try {
            commandLine.getNormalised().add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }

        assertEquals("a \"b c\"", commandLine.toString());
    }

    @Test
    public void testAddOptionAndLookup() {
        Option opt = option("--opt", Collections.<String>emptySet(),
                new HashSet<String>(Arrays.asList("-o")), null);

        assertFalse(commandLine.hasOption(opt));

        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption(opt));
        assertSame(opt, commandLine.getOption("--opt"));
        assertSame(opt, commandLine.getOption("-o"));
        assertNull(commandLine.getOption("--unknown"));

        assertTrue(commandLine.getOptionTriggers().contains("--opt"));
        assertTrue(commandLine.getOptionTriggers().contains("-o"));

        try {
            commandLine.getOptionTriggers().add("--new");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testAddOptionAddsParent() {
        Option parent = option("--parent", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);
        Option child = option("--child", Collections.<String>emptySet(),
                Collections.<String>emptySet(), parent);

        commandLine.addOption(child);

        assertTrue(commandLine.hasOption(child));
        assertTrue(commandLine.hasOption(parent));
        assertSame(child, commandLine.getOption("--child"));
        assertSame(parent, commandLine.getOption("--parent"));
    }

    @Test
    public void testAddValueAndGetValues() {
        Option opt = option("--opt", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        assertTrue(commandLine.getUndefaultedValues(opt).isEmpty());
        assertTrue(commandLine.getValues(opt, null).isEmpty());

        commandLine.addValue(opt, "v1");
        commandLine.addValue(opt, "v2");

        assertEquals(Arrays.asList("v1", "v2"), commandLine.getUndefaultedValues(opt));
        assertEquals(Arrays.asList("v1", "v2"), commandLine.getValues(opt, null));
    }

    @Test
    public void testAddValueArgumentAddsOption() {
        Argument arg = argument("--arg", Collections.<String>emptySet(),
                new HashSet<String>(Arrays.asList("-a")), null);

        assertFalse(commandLine.hasOption(arg));

        commandLine.addValue(arg, "value");

        assertTrue(commandLine.hasOption(arg));
        assertEquals(Collections.singletonList("value"), commandLine.getValues(arg, null));
    }

    @Test
    public void testGetValuesAppliesDefaults() {
        Option opt = option("--opt", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        commandLine.setDefaultValues(opt, Arrays.asList("d1", "d2"));
        assertEquals(Arrays.asList("d1", "d2"), commandLine.getValues(opt, null));

        commandLine.addValue(opt, "v");
        assertEquals(Arrays.asList("v", "d2"),
                commandLine.getValues(opt, Arrays.asList("d1", "d2")));
        assertEquals(Arrays.asList("v", "d2", "d3"),
                commandLine.getValues(opt, Arrays.asList("d1", "d2", "d3")));
    }

    @Test
    public void testSetDefaultValuesNullRemoves() {
        Option opt = option("--opt", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        commandLine.setDefaultValues(opt, Collections.singletonList("d"));
        assertFalse(commandLine.getValues(opt, null).isEmpty());

        commandLine.setDefaultValues(opt, null);
        assertTrue(commandLine.getValues(opt, null).isEmpty());
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        Option opt = option("--flag", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        assertNull(commandLine.getSwitch(opt, null));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        commandLine.addSwitch(opt, true);

        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.FALSE));
        assertTrue(commandLine.hasOption(opt));
    }

    @Test
    public void testAddSwitchDuplicateThrows() {
        Option opt = option("--flag", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        commandLine.addSwitch(opt, true);

        try {
            commandLine.addSwitch(opt, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertNotNull(expected.getMessage());
        }

        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitchUsesDefaultSwitches() {
        Option opt = option("--flag", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        Option opt2 = option("--flag2", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);

        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt2, Boolean.FALSE));

        commandLine.setDefaultSwitch(opt2, Boolean.TRUE);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt2, Boolean.FALSE));

        commandLine.setDefaultSwitch(opt, null);
        assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("-a"));
        assertTrue(commandLine.looksLikeOption("--a"));
        assertFalse(commandLine.looksLikeOption("a"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test(expected = NullPointerException.class)
    public void testLooksLikeOptionNull() {
        commandLine.looksLikeOption(null);
    }

    @Test
    public void testLooksLikeOptionWithEmptyPrefixes() {
        Option root = option("root", Collections.<String>emptySet(),
                Collections.<String>emptySet(), null);
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(root, new ArrayList<String>());

        assertFalse(cl.looksLikeOption("anything"));
        assertFalse(cl.looksLikeOption(null));
    }

    @Test
    public void testPropertyMethods() {
        PropertyOption option = new PropertyOption();

        assertEquals("fallback", commandLine.getProperty(option, "missing", "fallback"));

        commandLine.addProperty(option, "name", "value");
        commandLine.addProperty(option, "name", "updated");

        assertEquals("updated", commandLine.getProperty(option, "name", "fallback"));
        assertEquals("fallback", commandLine.getProperty(option, "other", "fallback"));

        Set<String> props = commandLine.getProperties(option);
        assertNotNull(props);
        assertEquals(1, props.size());
        assertTrue(props.contains("name"));

        try {
            props.remove("name");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testAddAndGetPropertyByString() {
        commandLine.addProperty("name", "value");

        assertEquals("value", commandLine.getProperty("name"));
        assertEquals("fallback", commandLine.getProperty("missing"));
        assertTrue(commandLine.getProperties().contains("name"));
    }

    @Test
    public void testGetPropertiesEmpty() {
        assertTrue(commandLine.getProperties().isEmpty());
        assertTrue(commandLine.getProperties(new PropertyOption()).isEmpty());
    }

    private Option option(final String preferredName,
                          final Set<String> prefixes,
                          final Set<String> triggers,
                          final Option parent) {
        return (Option) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Option.class},
                new OptionHandler(preferredName, prefixes, triggers, parent));
    }

    private Argument argument(final String preferredName,
                              final Set<String> prefixes,
                              final Set<String> triggers,
                              final Option parent) {
        return (Argument) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Argument.class},
                new OptionHandler(preferredName, prefixes, triggers, parent));
    }

    private static class OptionHandler implements InvocationHandler {

        private final String preferredName;
        private final Set<String> prefixes;
        private final Set<String> triggers;
        private final Option parent;

        OptionHandler(final String preferredName,
                      final Set<String> prefixes,
                      final Set<String> triggers,
                      final Option parent) {
            this.preferredName = preferredName;
            this.prefixes = prefixes;
            this.triggers = triggers;
            this.parent = parent;
        }

        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) {
            if (method.getDeclaringClass() == Object.class) {
                if ("equals".equals(method.getName())) {
                    return proxy == args[0];
                }
                if ("hashCode".equals(method.getName())) {
                    return System.identityHashCode(proxy);
                }
                if ("toString".equals(method.getName())) {
                    return "Option[" + preferredName + "]";
                }
            }

            final String methodName = method.getName();
            if ("getPreferredName".equals(methodName)) {
                return preferredName;
            }
            if ("getPrefixes".equals(methodName)) {
                return prefixes;
            }
            if ("getTriggers".equals(methodName)) {
                return triggers;
            }
            if ("getParent".equals(methodName)) {
                return parent;
            }

            return defaultValue(method.getReturnType());
        }

        private Object defaultValue(final Class<?> type) {
            if (!type.isPrimitive()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (type == Integer.TYPE) {
                return 0;
            }
            if (type == Long.TYPE) {
                return 0L;
            }
            if (type == Double.TYPE) {
                return 0d;
            }
            if (type == Float.TYPE) {
                return 0f;
            }
            if (type == Short.TYPE) {
                return (short) 0;
            }
            if (type == Byte.TYPE) {
                return (byte) 0;
            }
            if (type == Character.TYPE) {
                return (char) 0;
            }
            return null;
        }
    }
}