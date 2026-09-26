package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl cmd;
    private Option root;

    @Before
    public void setUp() {
        Set<String> prefixes = new HashSet<String>(Arrays.asList("-", "--"));
        root = createOption("root", Collections.<String>emptySet(), prefixes, false);
        cmd = new WriteableCommandLineImpl(root, new ArrayList<Object>(Arrays.asList("-a", "-b")));
    }

    @Test
    public void testConstructorStoresNormalisedAndRootNotAdded() {
        List<String> arguments = Arrays.asList("-x", "hello world");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, arguments);

        assertEquals(arguments, line.getNormalised());
        assertFalse(line.hasOption(root));
        assertTrue(line.getOptions().isEmpty());
    }

    @Test
    public void testAddOptionMapsPreferredNameAndTriggers() {
        Set<String> triggers = new HashSet<String>(Arrays.asList("-o", "--option"));
        Option option = createOption("--opt", triggers, Collections.<String>emptySet(), false);

        cmd.addOption(option);

        assertTrue(cmd.hasOption(option));
        assertSame(option, cmd.getOption("--opt"));
        assertSame(option, cmd.getOption("-o"));
        assertSame(option, cmd.getOption("--option"));
        assertNull(cmd.getOption("--missing"));
        assertEquals(1, cmd.getOptions().size());
        assertTrue(cmd.getOptionTriggers().contains("--opt"));
        assertTrue(cmd.getOptionTriggers().contains("-o"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionsIsUnmodifiable() {
        cmd.getOptions().add(root);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionTriggersIsUnmodifiable() {
        cmd.getOptionTriggers().add("--new");
    }

    @Test
    public void testAddValueWithArgumentOptionAddsOption() {
        Option argument = createOption("arg", Collections.<String>emptySet(), Collections.<String>emptySet(), true);

        cmd.addValue(argument, "value");

        assertTrue(cmd.hasOption(argument));
        assertSame(argument, cmd.getOption("arg"));
        assertEquals(Collections.singletonList("value"), cmd.getValues(argument, null));
    }

    @Test
    public void testAddValueWithNonArgumentOptionDoesNotAddOption() {
        Option option = createOption("--value", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.addValue(option, "value");

        assertFalse(cmd.hasOption(option));
        assertNull(cmd.getOption("--value"));
        assertEquals(Collections.singletonList("value"), cmd.getUndefaultedValues(option));
    }

    @Test
    public void testGetValuesReturnsEmptyListWhenNoValuesOrDefaults() {
        Option option = createOption("--missing", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        assertTrue(cmd.getValues(option, null).isEmpty());
        assertTrue(cmd.getUndefaultedValues(option).isEmpty());
    }

    @Test
    public void testGetValuesUsesDefaultValuesWhenNoExplicitValues() {
        Option option = createOption("--default", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultValues(option, Arrays.asList("d1", "d2"));

        assertEquals(Arrays.asList("d1", "d2"), cmd.getValues(option, null));
        assertTrue(cmd.getUndefaultedValues(option).isEmpty());
    }

    @Test
    public void testGetValuesDoesNotAddDefaultsWhenExplicitValuesAreLonger() {
        Option option = createOption("--value", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.addValue(option, "a");
        cmd.addValue(option, "b");
        cmd.setDefaultValues(option, Arrays.asList("x"));

        assertEquals(Arrays.asList("a", "b"), cmd.getValues(option, null));
    }

    @Test
    public void testGetValuesAugmentsWithDefaultValuesWhenAppropriate() {
        Option option = createOption("--value", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.addValue(option, "a");
        cmd.addValue(option, "b");
        cmd.setDefaultValues(option, Arrays.asList("x", "y", "z"));

        assertEquals(Arrays.asList("a", "b", "z"), cmd.getValues(option, null));
    }

    @Test
    public void testGetValuesWithNonEmptyCallerDefaultsOverridesFieldDefaults() {
        Option option = createOption("--value", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultValues(option, Collections.singletonList("field"));

        assertEquals(Collections.singletonList("caller"), cmd.getValues(option, Collections.singletonList("caller")));
    }

    @Test
    public void testGetValuesWithEmptyCallerDefaultsUsesFieldDefaults() {
        Option option = createOption("--value", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultValues(option, Collections.singletonList("field"));

        assertEquals(Collections.singletonList("field"), cmd.getValues(option, Collections.emptyList()));
    }

    @Test
    public void testSetDefaultValuesWithNullClears() {
        Option option = createOption("--option", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultValues(option, Collections.singletonList("value"));
        assertFalse(cmd.getValues(option, null).isEmpty());

        cmd.setDefaultValues(option, null);

        assertTrue(cmd.getValues(option, null).isEmpty());
    }

    @Test
    public void testGetUndefaultedValuesDoesNotIncludeDefaults() {
        Option option = createOption("--option", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultValues(option, Collections.singletonList("default"));

        assertTrue(cmd.getUndefaultedValues(option).isEmpty());

        cmd.addValue(option, "explicit");

        assertEquals(Collections.singletonList("explicit"), cmd.getUndefaultedValues(option));
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        Option option = createOption("--switch", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.addSwitch(option, true);

        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test
    public void testAddSwitchRejectsDuplicateSwitch() {
        Option option = createOption("--switch", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.addSwitch(option, true);

        try {
            cmd.addSwitch(option, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testGetSwitchUsesDefaultSwitchWhenNoExplicitSwitch() {
        Option option = createOption("--switch", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultSwitch(option, Boolean.TRUE);

        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test
    public void testSetDefaultSwitchWithNullClears() {
        Option option = createOption("--switch", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        cmd.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, null));

        cmd.setDefaultSwitch(option, null);

        assertNull(cmd.getSwitch(option, null));
    }

    @Test
    public void testPropertyMapWithOptionInstance() {
        Option option = createOption("--property", Collections.<String>emptySet(), Collections.<String>emptySet(), false);

        assertNull(cmd.getProperty(option, "name", null));
        assertEquals("default", cmd.getProperty(option, "name", "default"));

        cmd.addProperty(option, "name", "value");
        cmd.addProperty(option, "name", "override");
        cmd.addProperty(option, "other", "o");

        assertEquals("override", cmd.getProperty(option, "name", "default"));
        assertEquals("o", cmd.getProperty(option, "other", null));

        Set<?> properties = cmd.getProperties(option);
        assertEquals(2, properties.size());
        assertTrue(properties.contains("name"));
        assertTrue(properties.contains("other"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetPropertiesForOptionIsUnmodifiable() {
        Option option = createOption("--property", Collections.<String>emptySet(), Collections.<String>emptySet(), false);
        cmd.getProperties(option).add("new");
    }

    @Test
    public void testStringPropertyMapMethods() {
        cmd.addProperty("name", "value");

        assertEquals("value", cmd.getProperty("name"));
        assertTrue(cmd.getProperties().contains("name"));
    }

    @Test
    public void testDefaultPropertiesStartEmpty() {
        assertTrue(cmd.getProperties().isEmpty());
    }

    @Test
    public void testToStringQuotesArgumentsWithSpaces() {
        List<String> arguments = Arrays.asList("one", "two words", "three");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, arguments);

        assertEquals("one \"two words\" three", line.toString());
    }

    @Test
    public void testToStringWithEmptyArguments() {
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, Collections.emptyList());

        assertEquals("", line.toString());
    }

    @Test
    public void testPropertyOptionCanBeUsedByStringMethods() {
        cmd.addProperty("name", "value");

        assertEquals("value", cmd.getProperty("name"));
        assertEquals(Collections.singleton("name"), cmd.getProperties());
    }

    private Option createOption(final String preferredName,
                                final Set<String> triggers,
                                final Set<String> prefixes,
                                final boolean argumentAware) {
        final Class<?>[] interfaces;
        if (argumentAware) {
            interfaces = new Class<?>[]{Option.class, Argument.class};
        } else {
            interfaces = new Class<?>[]{Option.class};
        }

        final InvocationHandler handler = new InvocationHandler() {
            public Object invoke(final Object proxy, final Method method, final Object[] args) {
                final String name = method.getName();

                if ("getPreferredName".equals(name)) {
                    return preferredName;
                }
                if ("getTriggers".equals(name)) {
                    return triggers;
                }
                if ("getPrefixes".equals(name)) {
                    return prefixes;
                }
                if ("toString".equals(name)) {
                    return preferredName;
                }
                if ("hashCode".equals(name)) {
                    return Integer.valueOf(System.identityHashCode(proxy));
                }
                if ("equals".equals(name)) {
                    return Boolean.valueOf(proxy == args[0]);
                }

                final Class<?> returnType = method.getReturnType();
                if (returnType.equals(Boolean.TYPE) || returnType.equals(Boolean.class)) {
                    return Boolean.FALSE;
                }
                if (returnType.equals(Integer.TYPE) || returnType.equals(Integer.class)) {
                    return Integer.valueOf(0);
                }
                if (returnType.equals(Set.class)) {
                    return Collections.emptySet();
                }
                if (returnType.equals(List.class)) {
                    return Collections.emptyList();
                }
                return null;
            }
        };

        return (Option) Proxy.newProxyInstance(
                WriteableCommandLineImplTest.class.getClassLoader(),
                interfaces,
                handler);
    }
}