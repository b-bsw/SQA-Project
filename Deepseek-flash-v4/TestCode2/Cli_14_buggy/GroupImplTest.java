package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Test;

public class GroupImplTest {

    // ---------------------------------------------------------------------
    // Basic behaviour
    // ---------------------------------------------------------------------

    @Test
    public void testConstructorSeparatesArgumentsAndBuildsMaps() {
        OptionHandle regular = option("-a", "-");
        OptionHandle anon = argument();

        List<Option> options = new ArrayList<Option>();
        options.add(regular.option);
        options.add(anon.option);

        GroupImpl group = new GroupImpl(options, "group", "Group", 0, 1);

        assertEquals(1, group.getOptions().size());
        assertSame(regular.option, group.getOptions().get(0));

        assertEquals(1, group.getAnonymous().size());
        assertSame(anon.option, group.getAnonymous().get(0));

        assertTrue(group.getTriggers().contains("-a"));
        assertTrue(group.getPrefixes().contains("-"));
    }

    @Test
    public void testGetNameDescriptionAndId() {
        GroupImpl group = new GroupImpl(new ArrayList<Option>(), "name", "desc", 0, 0);
        assertEquals("name", group.getPreferredName());
        assertEquals("desc", group.getDescription());
        assertEquals(0, group.getId());
    }

    @Test
    public void testGetMinimumMaximumAndRequired() {
        GroupImpl optional = new GroupImpl(new ArrayList<Option>(), "g", "d", 0, 2);
        assertFalse(optional.isRequired());
        assertEquals(0, optional.getMinimum());
        assertEquals(2, optional.getMaximum());

        GroupImpl required = new GroupImpl(new ArrayList<Option>(), "g", "d", 1, 2);
        assertTrue(required.isRequired());
    }

    // ---------------------------------------------------------------------
    // canProcess
    // ---------------------------------------------------------------------

    @Test
    public void testCanProcessNullArgReturnsFalse() {
        GroupImpl group = groupWithOption("-a", "-");
        assertFalse(group.canProcess(null, null));
    }

    @Test
    public void testCanProcessExactOptionReturnsTrue() {
        GroupImpl group = groupWithOption("-a", "-");
        assertTrue(group.canProcess(null, "-a"));
    }

    // ---------------------------------------------------------------------
    // findOption
    // ---------------------------------------------------------------------

    @Test
    public void testFindOptionDelegatesToChildOption() {
        OptionHandle leaf = option("-a", "-");
        GroupImpl group = groupWith(leaf.option);

        assertSame(leaf.option, group.findOption("-a"));
    }

    @Test
    public void testFindOptionReturnsNullWhenNotFound() {
        GroupImpl group = groupWithOption("-a", "-");
        assertNull(group.findOption("-b"));
    }

    // ---------------------------------------------------------------------
    // process, defaults and validation
    // ---------------------------------------------------------------------

    @Test
    public void testProcessCallsProcessOnExactOption() {
        OptionHandle opt = option("-a", "-");
        GroupImpl group = groupWith(opt.option);

        group.process(commandLine(false, false), Arrays.asList("-a").listIterator());

        assertEquals(1, opt.handler.processCount);
    }

    @Test
    public void testDefaultsCallsDefaultsOnOptions() {
        OptionHandle opt = option("-a", "-");
        GroupImpl group = groupWith(opt.option);

        group.defaults(commandLine(false, false));

        assertEquals(1, opt.handler.defaultsCount);
    }

    @Test
    public void testValidateThrowsWhenRequiredOptionMissing() {
        OptionHandle opt = option("-a", "-");
        opt.handler.required = true;

        List<Option> options = new ArrayList<Option>();
        options.add(opt.option);
        GroupImpl group = new GroupImpl(options, "g", "d", 1, 1);

        try {
            group.validate(commandLine(false, false));
            fail("Expected OptionException");
        } catch (OptionException expected) {
            // expected
        }
    }

    // ---------------------------------------------------------------------
    // Test helpers / simple dynamic stubs
    // ---------------------------------------------------------------------

    private GroupImpl groupWithOption(String trigger, String prefix) {
        return groupWith(option(trigger, prefix).option);
    }

    private GroupImpl groupWith(Option option) {
        List<Option> options = new ArrayList<Option>();
        options.add(option);
        return new GroupImpl(options, "group", "Group", 0, 0);
    }

    private OptionHandle option(String trigger, String prefix) {
        OptionHandler handler = new OptionHandler(trigger, prefix);
        Option proxy = (Option) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Option.class},
                handler);
        handler.proxy = proxy;
        return new OptionHandle(proxy, handler);
    }

    private OptionHandle argument() {
        OptionHandler handler = new OptionHandler(null, null);
        Option proxy = (Option) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Argument.class},
                handler);
        handler.proxy = proxy;
        return new OptionHandle(proxy, handler);
    }

    private WriteableCommandLine commandLine(final boolean looksLikeOption,
                                             final boolean hasOption) {
        return (WriteableCommandLine) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{WriteableCommandLine.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        if ("looksLikeOption".equals(method.getName())) {
                            return looksLikeOption;
                        }
                        if ("hasOption".equals(method.getName())) {
                            return hasOption;
                        }
                        if ("toString".equals(method.getName())) {
                            return "CommandLine(" + looksLikeOption + "," + hasOption + ")";
                        }
                        return defaultReturn(method.getReturnType());
                    }
                });
    }

    private static Object defaultReturn(Class<?> type) {
        if (type == boolean.class) {
            return false;
        }
        if (type == int.class) {
            return 0;
        }
        if (type == long.class) {
            return 0L;
        }
        if (type == double.class) {
            return 0.0d;
        }
        if (type == float.class) {
            return 0.0f;
        }
        return null;
    }

    private static final class OptionHandle {
        private final Option option;
        private final OptionHandler handler;

        private OptionHandle(Option option, OptionHandler handler) {
            this.option = option;
            this.handler = handler;
        }
    }

    private static final class OptionHandler implements InvocationHandler {
        private final String trigger;
        private final Set<String> prefixes;
        private Option proxy;

        private boolean canProcess = true;
        private boolean required;
        private int processCount;
        private int defaultsCount;

        private OptionHandler(String trigger, String prefix) {
            this.trigger = trigger;
            Set<String> prefixes = new HashSet<String>();
            if (prefix != null) {
                prefixes.add(prefix);
            }
            this.prefixes = prefixes;
        }

        @Override
        public Object invoke(Object handlerProxy, Method method, Object[] args) {
            String name = method.getName();

            if ("getTriggers".equals(name)) {
                return Collections.singleton(trigger);
            }
            if ("getPrefixes".equals(name)) {
                return prefixes;
            }
            if ("getPreferredName".equals(name)) {
                return trigger;
            }
            if ("getDescription".equals(name)) {
                return trigger;
            }
            if ("canProcess".equals(name)) {
                return canProcess;
            }
            if ("process".equals(name)) {
                processCount++;
                return null;
            }
            if ("defaults".equals(name)) {
                defaultsCount++;
                return null;
            }
            if ("isRequired".equals(name)) {
                return required;
            }
            if ("validate".equals(name)) {
                return null;
            }
            if ("findOption".equals(name)) {
                String requested = (String) args[0];
                if (trigger != null && trigger.equals(requested)) {
                    return proxy;
                }
                return null;
            }
            if ("helpLines".equals(name)) {
                return Collections.emptyList();
            }
            if ("appendUsage".equals(name)) {
                return null;
            }
            if ("toString".equals(name)) {
                return "Option(" + trigger + ")";
            }
            if ("hashCode".equals(name)) {
                return System.identityHashCode(handlerProxy);
            }
            if ("equals".equals(name)) {
                return handlerProxy == args[0];
            }
            return defaultReturn(method.getReturnType());
        }
    }
}