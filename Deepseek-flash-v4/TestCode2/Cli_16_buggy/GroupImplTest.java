package org.apache.commons.cli2.option;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.apache.commons.cli2.*;
import org.apache.commons.cli2.option.GroupImpl;
import org.junit.Test;

public class GroupImplTest {

    // --------------------------------------------------------------------------
    //  Helpers
    // --------------------------------------------------------------------------

    private static class MockOption {
        final String preferredName;
        final Set<String> triggers = new HashSet<>();
        final Set<String> prefixes = new HashSet<>();
        boolean canProcess;
        boolean required;
        boolean processCalled;
        int processCount;
        boolean validated;

        MockOption(String trigger, boolean canProcess) {
            this.preferredName = trigger;
            this.triggers.add(trigger);
            this.prefixes.add("-");
            if (trigger.startsWith("--")) {
                prefixes.add("--");
            }
            this.canProcess = canProcess;
        }

        Set<String> getTriggers() { return triggers; }
        Set<String> getPrefixes() { return prefixes; }
        String getPreferredName() { return preferredName; }
        String getDescription() { return null; }

        boolean canProcess(WriteableCommandLine cl, String arg) {
            return canProcess && arg != null;
        }

        boolean canProcess(WriteableCommandLine cl, ListIterator args) {
            return canProcess && args.hasNext();
        }

        void process(WriteableCommandLine cl, ListIterator args) {
            processCalled = true;
            processCount++;
        }

        void validate(WriteableCommandLine cl) {
            validated = true;
        }

        void defaults(WriteableCommandLine cl) {
        }

        void appendUsage(StringBuffer sb, Set s, Comparator c) {
            sb.append(preferredName);
        }

        List helpLines(int depth, Set s, Comparator c) {
            return new ArrayList();
        }

        boolean isRequired() {
            return required;
        }

        Option findOption(String t) {
            return null;
        }
    }

    private static class OptionHandler implements InvocationHandler {
        final MockOption mock;

        OptionHandler(MockOption mock) {
            this.mock = mock;
        }

        MockOption mock() {
            return mock;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            switch (method.getName()) {
                case "getTriggers"      : return mock.getTriggers();
                case "getPrefixes"      : return mock.getPrefixes();
                case "getPreferredName" : return mock.getPreferredName();
                case "getDescription"   : return mock.getDescription();
                case "canProcess":
                    if (args[1] instanceof String) {
                        return mock.canProcess((WriteableCommandLine) args[0],
                                               (String) args[1]);
                    }
                    return mock.canProcess((WriteableCommandLine) args[0],
                                           (ListIterator) args[1]);
                case "process":
                    mock.process((WriteableCommandLine) args[0],
                                 (ListIterator) args[1]);
                    return null;
                case "validate":
                    mock.validate((WriteableCommandLine) args[0]);
                    return null;
                case "defaults":
                    mock.defaults((WriteableCommandLine) args[0]);
                    return null;
                case "appendUsage":
                    mock.appendUsage((StringBuffer) args[0], (Set) args[1],
                                     (Comparator) args[2]);
                    return null;
                case "helpLines":
                    return mock.helpLines((Integer) args[0], (Set) args[1],
                                          (Comparator) args[2]);
                case "isRequired" : return mock.isRequired();
                case "findOption" : return null;
                case "getId"      : return 0;
                case "toString"   : return mock.getPreferredName();
                case "hashCode"   : return System.identityHashCode(proxy);
                case "equals"     : return proxy == args[0];
                default:
                    return defaultValue(method.getReturnType());
            }
        }
    }

    private static Object defaultValue(Class<?> type) {
        if (type == boolean.class) return false;
        if (type == int.class)     return 0;
        if (type == long.class)    return 0L;
        return null;
    }

    private Option option(String trigger, boolean canProcess) {
        return option(trigger, canProcess, false);
    }

    private Option option(String trigger, boolean canProcess, boolean required) {
        MockOption mock = new MockOption(trigger, canProcess);
        mock.required = required;
        return (Option) Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class[]{Option.class},
            new OptionHandler(mock));
    }

    private Argument argument(String trigger, boolean canProcess) {
        MockOption mock = new MockOption(trigger, canProcess);
        return (Argument) Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class[]{Argument.class},
            new OptionHandler(mock));
    }

    private MockOption mockOf(Object proxy) {
        return ((OptionHandler) Proxy.getInvocationHandler(proxy)).mock();
    }

    private WriteableCommandLine commandLine(boolean looksLikeOption,
                                             boolean hasOption) {
        return (WriteableCommandLine) Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class[]{WriteableCommandLine.class},
            (proxy, method, args) -> {
                if (method.getName().equals("looksLikeOption")) {
                    return looksLikeOption;
                }
                if (method.getName().equals("hasOption")) {
                    return hasOption;
                }
                return defaultValue(method.getReturnType());
            });
    }

    // --------------------------------------------------------------------------
    //  Tests
    // --------------------------------------------------------------------------

    @Test
    public void testConstructorSeparatesArguments() {
        Option opt = option("--foo", true);
        Argument arg = argument("arg", false);

        List<Option> options = new ArrayList<>();
        options.add(opt);
        options.add((Option) arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);

        assertEquals(1, group.getOptions().size());
        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().get(0) instanceof Argument);
        assertEquals("grp", group.getPreferredName());
        assertEquals("desc", group.getDescription());
    }

    @Test
    public void testMinMaxAndIsRequired() {
        GroupImpl g0 = new GroupImpl(new ArrayList<Option>(), "g", "d", 0, 1);
        assertFalse(g0.isRequired());
        assertEquals(0, g0.getMinimum());
        assertEquals(1, g0.getMaximum());

        GroupImpl g1 = new GroupImpl(new ArrayList<Option>(), "g", "d", 2, 5);
        assertTrue(g1.isRequired());
        assertEquals(2, g1.getMinimum());
        assertEquals(5, g1.getMaximum());
    }

    @Test
    public void testCanProcessNullIsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList<Option>(), "g", "d", 0, 1);
        assertFalse(group.canProcess(commandLine(false, false), null));
    }

    @Test
    public void testCanProcessExactTrigger() {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        assertTrue(group.canProcess(commandLine(false, false), "--foo"));
    }

    @Test
    public void testCanProcessNoMatch() {
        Option opt = option("--foo", false);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        assertFalse(group.canProcess(commandLine(false, false), "--bar"));
    }

    @Test
    public void testCanProcessOptionWhenLooksLikeOptionAndNoAnonymous() {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        assertFalse(group.canProcess(commandLine(true, false), "--fox"));
    }

    @Test
    public void testCanProcessOptionWhenLooksLikeOptionAndAnonymous() {
        Option opt = option("--foo", true);
        Argument arg = argument("arg", false);
        List<Option> options = new ArrayList<>();
        options.add(opt);
        options.add((Option) arg);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 2);
        assertTrue(group.canProcess(commandLine(true, false), "--fox"));
    }

    @Test
    public void testProcessKnownOptionCallsOptionProcess() throws Exception {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        List<String> tokens = new ArrayList<>(Collections.singletonList("--foo"));
        group.process(commandLine(false, false), tokens.listIterator());

        MockOption mock = mockOf(opt);
        assertTrue(mock.processCalled);
        assertEquals(1, mock.processCount);
    }

    @Test
    public void testProcessUnknownOptionWithAnonymous() throws Exception {
        Argument arg = argument("arg", true);
        List<Option> options = new ArrayList<>();
        options.add((Option) arg);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 2);
        List<String> tokens = new ArrayList<>(Arrays.asList("--unknown", "value"));
        group.process(commandLine(false, false), tokens.listIterator());

        MockOption mock = mockOf(arg);
        assertTrue(mock.processCalled);
    }

    @Test
    public void testProcessUnknownOptionNoAnonymousDoesNotThrow() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList<Option>(), "g", "d", 0, 1);
        List<String> tokens = new ArrayList<>(Collections.singletonList("unknown"));
        group.process(commandLine(false, false), tokens.listIterator());
    }

    @Test
    public void testProcessStopsOnRepeatedArgument() throws Exception {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        List<String> tokens = new ArrayList<>(Arrays.asList("--foo", "--foo"));
        group.process(commandLine(false, false), tokens.listIterator());

        MockOption mock = mockOf(opt);
        assertEquals(1, mock.processCount);
    }

    @Test
    public void testValidateWhenTooFewOptions() {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 1, 2);
        WriteableCommandLine cl = commandLine(false, false);

        try {
            group.validate(cl);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateWhenTooManyOptions() {
        Option opt1 = option("--a", true);
        Option opt2 = option("--b", true);
        List<Option> options = new ArrayList<>();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(false, true);

        try {
            group.validate(cl);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateCallsOptionValidateOnRequiredOption() throws Exception {
        Option opt = option("--foo", true, true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 2);
        group.validate(commandLine(false, true));

        MockOption mock = mockOf(opt);
        assertTrue(mock.validated);
    }

    @Test
    public void testDefaultsDoesNotThrow() {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        group.defaults(commandLine(false, false));
    }

    @Test
    public void testHelpLinesNotNull() {
        Option opt = option("--foo", true);
        List<Option> options = new ArrayList<>();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        assertNotNull(group.helpLines(0, Collections.emptySet(), null));
    }
}