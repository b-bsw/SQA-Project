package org.apache.commons.cli2.option;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupImplTest {

    private static final ClassLoader LOADER = GroupImplTest.class.getClassLoader();

    private static GroupImpl groupWithOptions(int min, int max, Option... options) {
        List<Option> list = new ArrayList<Option>();
        for (Option option : options) {
            list.add(option);
        }
        return new GroupImpl(null, list, "group", "desc", min, max, false);
    }

    private static Option option(String trigger, String prefix, boolean canProcess) {
        return option("opt", trigger, prefix, canProcess, false);
    }

    private static Option option(String id, String trigger, String prefix,
                                 boolean canProcess, boolean required) {
        OptionHandler handler = new OptionHandler();
        handler.preferredName = id;
        handler.triggers.add(trigger);
        if (prefix != null) {
            handler.prefixes.add(prefix);
        }
        handler.canProcess = canProcess;
        handler.required = required;
        return (Option) Proxy.newProxyInstance(LOADER, new Class[]{Option.class}, handler);
    }

    private static Argument argument(boolean canProcess) {
        ArgumentHandler handler = new ArgumentHandler();
        handler.canProcess = canProcess;
        return (Argument) Proxy.newProxyInstance(LOADER, new Class[]{Argument.class}, handler);
    }

    private static WriteableCommandLine commandLine(boolean looksLikeOption) {
        CommandLineHandler handler = new CommandLineHandler();
        handler.looksLikeOption = looksLikeOption;
        return (WriteableCommandLine) Proxy.newProxyInstance(
                LOADER, new Class[]{WriteableCommandLine.class}, handler);
    }

    private static WriteableCommandLine commandLineWithPresent(boolean looksLikeOption,
                                                               Option... present) {
        CommandLineHandler handler = new CommandLineHandler();
        handler.looksLikeOption = looksLikeOption;
        for (Option option : present) {
            handler.present.add(option);
        }
        return (WriteableCommandLine) Proxy.newProxyInstance(
                LOADER, new Class[]{WriteableCommandLine.class}, handler);
    }

    private static OptionHandler handlerOf(Option option) {
        return (OptionHandler) Proxy.getInvocationHandler(option);
    }

    private static ArgumentHandler handlerOf(Argument argument) {
        return (ArgumentHandler) Proxy.getInvocationHandler(argument);
    }

    @Test
    public void testConstructorSeparatesAnonymousArgumentsAndStoresProperties() {
        Option option = option("a", "-", true);
        Argument argument = argument(true);

        List<Option> options = new ArrayList<Option>();
        options.add(argument);
        options.add(option);

        GroupImpl group = new GroupImpl(null, options, "name", "description", 2, 4, false);

        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(option));

        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(argument));

        assertEquals("name", group.getName());
        assertEquals("description", group.getDescription());
        assertEquals(2, group.getMinimum());
        assertEquals(4, group.getMaximum());
        assertTrue(group.getTriggers().contains("a"));
        assertTrue(group.getPrefixes().contains("-"));
    }

    @Test
    public void testIsRequiredWhenMinimumIsGreaterThanZero() {
        GroupImpl group = groupWithOptions(1, 1, option("a", "-", true));
        assertTrue(group.isRequired());
    }

    @Test
    public void testCanProcessNullReturnsFalse() {
        GroupImpl group = groupWithOptions(0, 1, option("a", "-", true));
        assertFalse(group.canProcess(null, null));
    }

    @Test
    public void testCanProcessExactTriggerIgnoresOptionCanProcessValue() {
        Option option = option("a", "-", false);
        GroupImpl group = groupWithOptions(0, 1, option);

        assertTrue(group.canProcess(commandLine(false), "a"));
    }

    @Test
    public void testCanProcessWithTailOptionWhenNotLikelyOption() {
        Option option = option("a", "-", true);
        GroupImpl group = groupWithOptions(0, 1, option);

        assertTrue(group.canProcess(commandLine(false), "x"));
    }

    @Test
    public void testCanProcessLooksLikeOptionWithoutAnonymousRejects() {
        Option option = option("a", "-", true);
        GroupImpl group = groupWithOptions(0, 1, option);

        assertFalse(group.canProcess(commandLine(true), "x"));
    }

    @Test
    public void testCanProcessUsesAnonymousArgument() {
        Option option = option("a", "-", false);
        Argument argument = argument(true);
        GroupImpl group = groupWithOptions(0, 1, option, argument);

        assertTrue(group.canProcess(commandLine(true), "x"));
    }

    @Test
    public void testCanProcessReturnsFalseWhenNothingMatches() {
        GroupImpl group = groupWithOptions(0, 1, option("a", "-", false), argument(false));
        assertFalse(group.canProcess(commandLine(true), "x"));
    }

    @Test
    public void testProcessExactTriggerDelegatesToOption() {
        Option option = option("id", "a", "-", true, false);
        GroupImpl group = groupWithOptions(0, 1, option);

        List<String> arguments = new ArrayList<String>();
        arguments.add("a");

        group.process(commandLine(false), arguments.listIterator());

        assertEquals(1, handlerOf(option).processCount);
    }

    @Test
    public void testProcessUnknownArgumentDelegatesToTailOption() {
        Option option = option("id", "a", "-", true, false);
        GroupImpl group = groupWithOptions(0, 1, option);

        List<String> arguments = new ArrayList<String>();
        arguments.add("x");

        group.process(commandLine(false), arguments.listIterator());

        assertEquals(1, handlerOf(option).processCount);
    }

    @Test
    public void testProcessUnknownArgumentUsesAnonymousArgument() {
        Option option = option("a", "-", false);
        Argument argument = argument(true);
        GroupImpl group = groupWithOptions(0, 1, option, argument);

        List<String> values = new ArrayList<String>();
        values.add("x");

        group.process(commandLine(false), values.listIterator());

        assertEquals(1, handlerOf(argument).processCount);
    }

    @Test(expected = OptionException.class)
    public void testProcessUnknownArgumentThrowsWhenNoAnonymous() {
        GroupImpl group = groupWithOptions(0, 0);

        List<String> values = new ArrayList<String>();
        values.add("x");

        group.process(commandLine(false), values.listIterator());
    }

    @Test
    public void testProcessStopsWhenSameArgumentRepeated() {
        Option option = option("a", "-", true);
        GroupImpl group = groupWithOptions(0, 1, option);

        List<String> values = Arrays.asList("a", "a");

        group.process(commandLine(false), values.listIterator());

        assertEquals(1, handlerOf(option).processCount);
    }

    @Test
    public void testValidatePassesWhenWithinLimits() {
        Option option = option("id", "a", "-", true, true);
        GroupImpl group = groupWithOptions(1, 2, option);

        group.validate(commandLineWithPresent(false, option));
    }

    @Test
    public void testValidateTooManyThrows() {
        Option a = option("a", "a", "-", true, false);
        Option b = option("b", "b", "-", true, false);
        GroupImpl group = groupWithOptions(1, 1, a, b);

        try {
            group.validate(commandLineWithPresent(false, a, b));
            fail("Expected OptionException for too many arguments");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateTooFewThrows() {
        Option a = option("a", "a", "-", true, false);
        GroupImpl group = groupWithOptions(2, 3, a);

        try {
            group.validate(commandLineWithPresent(false));
            fail("Expected OptionException for too few arguments");
        } catch (OptionException e) {
            // expected
        }
    }

    private static final class OptionHandler implements InvocationHandler {
        private final Set<String> triggers = new HashSet<String>();
        private final Set<String> prefixes = new HashSet<String>();
        private String preferredName = "opt";
        private boolean canProcess = true;
        private boolean required;
        private int processCount;
        private int validateCount;
        private int defaultsCount;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("getTriggers".equals(name)) {
                return triggers;
            }
            if ("getPrefixes".equals(name)) {
                return prefixes;
            }
            if ("getPreferredName".equals(name)) {
                return preferredName;
            }
            if ("getDescription".equals(name)) {
                return "description";
            }
            if ("canProcess".equals(name)) {
                return canProcess;
            }
            if ("process".equals(name)) {
                processCount++;
                return null;
            }
            if ("validate".equals(name)) {
                validateCount++;
                return null;
            }
            if ("defaults".equals(name)) {
                defaultsCount++;
                return null;
            }
            if ("isRequired".equals(name)) {
                return required;
            }
            if ("isOptional".equals(name)) {
                return !required;
            }
            if ("setParent".equals(name)) {
                return null;
            }
            return defaultValue(method.getReturnType());
        }
    }

    private static final class ArgumentHandler implements InvocationHandler {
        private boolean canProcess = true;
        private int processCount;
        private int validateCount;
        private int defaultsCount;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("canProcess".equals(name)) {
                return canProcess;
            }
            if ("process".equals(name)) {
                processCount++;
                return null;
            }
            if ("validate".equals(name)) {
                validateCount++;
                return null;
            }
            if ("defaults".equals(name)) {
                defaultsCount++;
                return null;
            }
            if ("getPreferredName".equals(name)) {
                return "arg";
            }
            if ("isRequired".equals(name)) {
                return false;
            }
            if ("isOptional".equals(name)) {
                return true;
            }
            if ("setParent".equals(name)) {
                return null;
            }
            return defaultValue(method.getReturnType());
        }
    }

    private static final class CommandLineHandler implements InvocationHandler {
        private final Set<Option> present = new HashSet<Option>();
        private boolean looksLikeOption;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("looksLikeOption".equals(name)) {
                return looksLikeOption;
            }
            if ("hasOption".equals(name) && args != null && args.length == 1) {
                return present.contains(args[0]);
            }
            return defaultValue(method.getReturnType());
        }
    }

    private static Object defaultValue(Class<?> type) {
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
        if (type == void.class) {
            return null;
        }
        return null;
    }
}