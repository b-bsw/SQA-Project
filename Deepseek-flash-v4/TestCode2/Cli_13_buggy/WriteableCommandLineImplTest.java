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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    @Test
    public void testConstructorAndNormalisation() {
        List<String> args = Arrays.asList("a", "b c", "d");
        WriteableCommandLineImpl cmd = createCommandLine(args);

        assertEquals(args, cmd.getNormalised());
        assertEquals("a \"b c\" d", cmd.toString());
    }

    @Test
    public void testToStringEmptyAndSingle() {
        WriteableCommandLineImpl empty = createCommandLine(Collections.<String>emptyList());
        assertEquals("", empty.toString());

        WriteableCommandLineImpl single = createCommandLine(Collections.singletonList("arg"));
        assertEquals("arg", single.toString());
    }

    @Test
    public void testAddOptionAndLookup() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("foo", new String[]{"-f", "--foo"}, new String[]{"-"});

        assertFalse(cmd.hasOption(option));

        cmd.addOption(option);

        assertTrue(cmd.hasOption(option));
        assertSame(option, cmd.getOption("foo"));
        assertSame(option, cmd.getOption("-f"));
        assertSame(option, cmd.getOption("--foo"));
        assertNull(cmd.getOption("-x"));

        assertTrue(cmd.getOptions().contains(option));
        assertTrue(cmd.getOptionTriggers().contains("foo"));
        assertTrue(cmd.getOptionTriggers().contains("-f"));
        assertTrue(cmd.getOptionTriggers().contains("--foo"));
    }

    @Test
    public void testAddOptionWithNoTriggers() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("bare", new String[]{}, new String[]{"-"});

        cmd.addOption(option);

        assertSame(option, cmd.getOption("bare"));
        assertEquals(1, cmd.getOptionTriggers().size());
    }

    @Test
    public void testAddValueForArgumentAddsOption() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Argument argument = createArgument("file", new String[]{"-f"}, new String[]{"-"});

        cmd.addValue(argument, "a.txt");

        assertTrue(cmd.hasOption(argument));
        assertEquals(Collections.singletonList("a.txt"), cmd.getValues(argument, null));
    }

    @Test
    public void testAddValueNonArgumentDoesNotAddOption() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.addValue(option, "value");

        assertFalse(cmd.hasOption(option));
        assertEquals(Collections.singletonList("value"), cmd.getValues(option, null));
    }

    @Test
    public void testGetValuesUsesCommandLineValues() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.setDefaultValues(option, Arrays.asList("optionDefault"));
        cmd.addValue(option, "value1");
        cmd.addValue(option, "value2");

        assertEquals(
                Arrays.asList("value1", "value2"),
                cmd.getValues(option, Arrays.asList("methodDefault")));
    }

    @Test
    public void testGetValuesPrecedenceAndEmpty() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.setDefaultValues(option, Arrays.asList("optionDefault"));

        assertEquals(
                Arrays.asList("methodDefault"),
                cmd.getValues(option, Arrays.asList("methodDefault")));

        assertEquals(
                Arrays.asList("optionDefault"),
                cmd.getValues(option, null));

        Option emptyOption = createOption("empty", new String[]{"-e"}, new String[]{"-"});
        assertEquals(Collections.EMPTY_LIST, cmd.getValues(emptyOption, null));
        assertEquals(Collections.EMPTY_LIST, cmd.getValues(emptyOption, Collections.emptyList()));
    }

    @Test
    public void testSetDefaultValuesNullRemoves() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.setDefaultValues(option, Arrays.asList("d"));
        assertEquals(Arrays.asList("d"), cmd.getValues(option, null));

        cmd.setDefaultValues(option, null);
        assertEquals(Collections.EMPTY_LIST, cmd.getValues(option, null));
    }

    @Test
    public void testAddSwitchAndPrecedence() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option enabled = createOption("enabled", new String[]{"-e"}, new String[]{"-"});

        cmd.addSwitch(enabled, true);
        cmd.setDefaultSwitch(enabled, Boolean.FALSE);

        assertEquals(Boolean.TRUE, cmd.getSwitch(enabled, Boolean.FALSE));
        assertTrue(cmd.hasOption(enabled));

        Option disabled = createOption("disabled", new String[]{"-d"}, new String[]{"-"});
        cmd.addSwitch(disabled, false);

        assertEquals(Boolean.FALSE, cmd.getSwitch(disabled, Boolean.TRUE));
    }

    @Test
    public void testGetSwitchUsesMethodDefaultBeforeOptionDefault() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.setDefaultSwitch(option, Boolean.TRUE);

        assertEquals(Boolean.FALSE, cmd.getSwitch(option, Boolean.FALSE));
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, null));
    }

    @Test
    public void testSetDefaultSwitchNullRemoves() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, null));

        cmd.setDefaultSwitch(option, null);
        assertNull(cmd.getSwitch(option, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchRejectsDuplicate() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());
        Option option = createOption("opt", new String[]{"-o"}, new String[]{"-"});

        cmd.addSwitch(option, true);
        cmd.addSwitch(option, false);
    }

    @Test
    public void testProperties() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());

        cmd.addProperty("user", "alice");

        assertEquals("alice", cmd.getProperty("user"));
        assertNull(cmd.getProperty("missing"));
        assertTrue(cmd.getProperties().contains("user"));
    }

    @Test
    public void testLooksLikeOption() {
        WriteableCommandLineImpl cmd = createCommandLine(Collections.<String>emptyList());

        assertTrue(cmd.looksLikeOption("--foo"));
        assertTrue(cmd.looksLikeOption("-f"));
        assertFalse(cmd.looksLikeOption("foo"));
        assertFalse(cmd.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOptionUsesAllPrefixes() {
        Option root = createOption("root", new String[]{"--root"}, new String[]{"--", "-"});
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, Collections.<String>emptyList());

        assertTrue(cmd.looksLikeOption("--foo"));
        assertTrue(cmd.looksLikeOption("-f"));
        assertFalse(cmd.looksLikeOption("foo"));
    }

    @Test
    public void testLooksLikeOptionNoPrefixes() {
        Option root = createOption("root", new String[]{"--root"}, new String[]{});
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, Collections.<String>emptyList());

        assertFalse(cmd.looksLikeOption("--foo"));
        assertFalse(cmd.looksLikeOption("-f"));
        assertFalse(cmd.looksLikeOption(""));
    }

    private WriteableCommandLineImpl createCommandLine(List<String> arguments) {
        Option root = createOption("root", new String[]{"--root"}, new String[]{"-"});
        return new WriteableCommandLineImpl(root, arguments);
    }

    private Option createOption(String preferredName, String[] triggers, String[] prefixes) {
        return (Option) createProxy(preferredName, triggers, prefixes, false);
    }

    private Argument createArgument(String preferredName, String[] triggers, String[] prefixes) {
        return (Argument) createProxy(preferredName, triggers, prefixes, true);
    }

    private Object createProxy(
            final String preferredName,
            final String[] triggers,
            final String[] prefixes,
            final boolean argument) {

        final Class<?>[] interfaces = argument
                ? new Class<?>[]{Option.class, Argument.class}
                : new Class<?>[]{Option.class};

        return Proxy.newProxyInstance(
                WriteableCommandLineImplTest.class.getClassLoader(),
                interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        String name = method.getName();

                        if ("equals".equals(name)) {
                            Object other = args[0];
                            return this == other;
                        }
                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }
                        if ("toString".equals(name)) {
                            return "Option[" + preferredName + "]";
                        }
                        if ("getPreferredName".equals(name)) {
                            return preferredName;
                        }
                        if ("getTriggers".equals(name)) {
                            return new LinkedHashSet<String>(Arrays.asList(triggers));
                        }
                        if ("getPrefixes".equals(name)) {
                            return new LinkedHashSet<String>(Arrays.asList(prefixes));
                        }

                        Class<?> returnType = method.getReturnType();
                        if (returnType == boolean.class) {
                            return Boolean.FALSE;
                        }
                        if (returnType == int.class) {
                            return Integer.valueOf(0);
                        }
                        if (returnType == long.class) {
                            return Long.valueOf(0L);
                        }
                        if (returnType == Set.class) {
                            return new LinkedHashSet<Object>();
                        }
                        if (returnType == List.class) {
                            return new ArrayList<Object>();
                        }

                        return null;
                    }
                });
    }
}