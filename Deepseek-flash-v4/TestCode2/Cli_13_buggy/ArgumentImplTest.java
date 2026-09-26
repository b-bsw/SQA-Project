package org.apache.commons.cli2.option;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for {@link ArgumentImpl}.
 * Constructor calls assume the common constructor:
 *
 * <p>{@code ArgumentImpl(String, String, int, int, char, char, Validator, String, List, int)}</p>
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class ArgumentImplTest {

    private static final char NUL = '\0';

    /** Test helper that creates a simple ArgumentImpl with many default values. */
    private ArgumentImpl arg(String name, int min, int max) {
        return new ArgumentImpl(name, null, min, max, NUL, NUL, null, null, null, 0);
    }

    @Test
    public void testConstructorAndGetters() {
        List<Object> defaults = new ArrayList<Object>();
        defaults.add("a");
        defaults.add("b");

        ArgumentImpl arg = new ArgumentImpl(
                "name", "description", 1, 3, '<', '>', null, "--", defaults, 7);

        assertEquals("name", arg.getPreferredName());
        assertEquals("description", arg.getDescription());
        assertEquals(1, arg.getMinimum());
        assertEquals(3, arg.getMaximum());
        assertEquals('<', arg.getInitialSeparator());
        assertEquals('>', arg.getSubsequentSeparator());
        assertNull(arg.getValidator());
        assertEquals("--", arg.getConsumeArgument());
        assertSame(defaults, arg.getDefaultValues());
        assertTrue(arg.isRequired());
        assertSame(Collections.EMPTY_SET, arg.getPrefixes());
        assertSame(Collections.EMPTY_SET, arg.getTriggers());
    }

    @Test
    public void testDefaultNameAndDescription() {
        ArgumentImpl arg = new ArgumentImpl(null, null, 0, 0, NUL, NUL, null, null, null, 0);

        assertEquals("arg", arg.getPreferredName());
        assertNull(arg.getDescription());
        assertEquals(0, arg.getMinimum());
        assertEquals(0, arg.getMaximum());
        assertFalse(arg.isRequired());
        assertTrue(arg.canProcess(null, "anything"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinimumGreaterThanMaximumIsRejected() {
        new ArgumentImpl("x", null, 5, 2, NUL, NUL, null, null, null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooFewDefaultValuesAreRejected() {
        List<Object> defaults = new ArrayList<Object>();
        defaults.add("only one");
        new ArgumentImpl("x", null, 2, 3, NUL, NUL, null, null, defaults, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooManyDefaultValuesAreRejected() {
        List<Object> defaults = Arrays.asList((Object) "a", (Object) "b");
        new ArgumentImpl("x", null, 0, 1, NUL, NUL, null, null, defaults, 0);
    }

    @Test
    public void testStripBoundaryQuotes() {
        ArgumentImpl arg = arg("x", 0, 1);

        assertEquals("plain", arg.stripBoundaryQuotes("plain"));
        assertEquals("abc", arg.stripBoundaryQuotes("\"abc\""));
        assertEquals("plain\"", arg.stripBoundaryQuotes("plain\""));
        assertEquals("\"plain", arg.stripBoundaryQuotes("\"plain"));
        assertEquals("", arg.stripBoundaryQuotes("\"\""));
    }

    @Test
    public void testAppendUsageSingleName() {
        ArgumentImpl arg = arg("file", 0, 1);

        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, Collections.EMPTY_SET, null);

        assertEquals("file", buffer.toString());
    }

    @Test
    public void testAppendUsageInfiniteContainsEllipsis() {
        ArgumentImpl arg = arg("file", 0, Integer.MAX_VALUE);

        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, Collections.EMPTY_SET, null);

        assertTrue(buffer.toString().contains("file"));
        assertTrue(buffer.toString().contains("..."));
    }

    @Test
    public void testProcessValuesAddsSingleValue() throws Exception {
        ArgumentImpl arg = arg("x", 0, 5);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = new ArrayList<String>();
        values.add("value");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);

        assertEquals(Arrays.asList("value"), commandLine.values(arg));
    }

    @Test
    public void testProcessValuesStripsQuotes() throws Exception {
        ArgumentImpl arg = arg("x", 0, 5);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = new ArrayList<String>();
        values.add("\"quoted\"");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);

        assertEquals(Arrays.asList("quoted"), commandLine.values(arg));
    }

    @Test
    public void testProcessValuesStopsAtOptionLikeValue() throws Exception {
        ArgumentImpl arg = arg("x", 0, 5);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = new ArrayList<String>();
        values.add("-x");
        values.add("actual");

        ListIterator iterator = values.listIterator();
        arg.processValues(commandLine.proxy(), iterator, arg);

        assertTrue(commandLine.values(arg).isEmpty());
        assertEquals("-x", iterator.next());
    }

    @Test
    public void testProcessValuesConsumesValuesAfterMarker() throws Exception {
        ArgumentImpl arg = new ArgumentImpl("x", null, 0, 10, NUL, NUL, null, "--", null, 0);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = Arrays.asList("--", "a", "b");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);

        assertEquals(Arrays.asList("a", "b"), commandLine.values(arg));
    }

    @Test
    public void testProcessValuesSplitsOnSubsequentSeparator() throws Exception {
        ArgumentImpl arg = new ArgumentImpl("x", null, 0, 10, NUL, ',', null, null, null, 0);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = Collections.singletonList("a,b");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);

        assertEquals(Arrays.asList("a", "b"), commandLine.values(arg));
    }

    @Test(expected = OptionException.class)
    public void testProcessValuesRejectsTooManySubsequentValues() throws Exception {
        ArgumentImpl arg = new ArgumentImpl("x", null, 0, 2, NUL, ',', null, null, null, 0);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = Collections.singletonList("a,b,c");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);
    }

    @Test
    public void testProcessValuesWithMaximumZeroAddsNothing() throws Exception {
        ArgumentImpl arg = arg("x", 0, 0);
        CommandLineStub commandLine = new CommandLineStub();

        List<String> values = new ArrayList<String>();
        values.add("nope");
        arg.processValues(commandLine.proxy(), values.listIterator(), arg);

        assertTrue(commandLine.values(arg).isEmpty());
    }

    @Test
    public void testDefaults() {
        List<Object> defaults = new ArrayList<Object>();
        defaults.add("d");

        ArgumentImpl arg = new ArgumentImpl("x", null, 0, 2, NUL, NUL, null, null, defaults, 0);
        CommandLineStub commandLine = new CommandLineStub();

        arg.defaults(commandLine.proxy());

        assertEquals(Arrays.asList("d"), commandLine.defaultValues(arg));
    }

    @Test
    public void testDefaultValuesMethod() {
        List<Object> defaults = new ArrayList<Object>();
        defaults.add("a");
        defaults.add("b");

        ArgumentImpl arg = new ArgumentImpl("x", null, 0, 2, NUL, NUL, null, null, defaults, 0);
        CommandLineStub commandLine = new CommandLineStub();

        arg.defaultValues(commandLine.proxy(), arg);

        assertEquals(defaults, commandLine.defaultValues(arg));
    }

    @Test
    public void testValidateDoesNotThrowForEmptyValues() throws Exception {
        ArgumentImpl arg = arg("x", 0, 1);
        CommandLineStub commandLine = new CommandLineStub();

        arg.validate(commandLine.proxy(), arg);
    }

    @Test
    public void testHelpLines() {
        ArgumentImpl arg = arg("x", 0, 1);

        List lines = arg.helpLines(0, Collections.EMPTY_SET, null);

        assertNotNull(lines);
        assertEquals(1, lines.size());
        assertNotNull(lines.get(0));
    }

    /**
     * A small dynamic proxy for {@link WriteableCommandLine} that records
     * values added through the command line during argument processing.
     */
    private static final class CommandLineStub implements InvocationHandler {

        private final Map<Option, List<Object>> valuesByOption =
                new HashMap<Option, List<Object>>();

        private final Map<Option, List<Object>> defaultValuesByOption =
                new HashMap<Option, List<Object>>();

        WriteableCommandLine proxy() {
            return (WriteableCommandLine) Proxy.newProxyInstance(
                    WriteableCommandLine.class.getClassLoader(),
                    new Class<?>[]{WriteableCommandLine.class},
                    this);
        }

        List<Object> values(Option option) {
            List<Object> values = valuesByOption.get(option);
            return values == null ? Collections.<Object>emptyList() : values;
        }

        List<Object> defaultValues(Option option) {
            List<Object> values = defaultValuesByOption.get(option);
            return values == null ? Collections.<Object>emptyList() : values;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (args == null) {
                args = new Object[0];
            }

            if (method.getDeclaringClass() == Object.class) {
                if ("toString".equals(method.getName())) {
                    return "CommandLineStub";
                }
                if ("hashCode".equals(method.getName())) {
                    return System.identityHashCode(proxy);
                }
                if ("equals".equals(method.getName())) {
                    return proxy == args[0];
                }
            }

            String name = method.getName();

            if ("addValue".equals(name) && args.length == 2 && args[0] instanceof Option) {
                addValue((Option) args[0], args[1]);
                return null;
            }

            if ("getValues".equals(name) && args.length == 1 && args[0] instanceof Option) {
                return values((Option) args[0]);
            }

            if ("setDefaultValues".equals(name)
                    && args.length == 2
                    && args[0] instanceof Option
                    && args[1] instanceof List) {

                List<Object> copy = new ArrayList<Object>((List) args[1]);
                defaultValuesByOption.put((Option) args[0], copy);
                return null;
            }

            if ("looksLikeOption".equals(name) && args.length == 1 && args[0] instanceof String) {
                return ((String) args[0]).startsWith("-");
            }

            return defaultValue(method.getReturnType());
        }

        private void addValue(Option option, Object value) {
            List<Object> values = valuesByOption.get(option);
            if (values == null) {
                values = new ArrayList<Object>();
                valuesByOption.put(option, values);
            }
            values.add(value);
        }

        private Object defaultValue(Class<?> type) {
            if (!type.isPrimitive()) {
                return null;
            }
            if (type == boolean.class) {
                return false;
            }
            if (type == char.class) {
                return NUL;
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
}