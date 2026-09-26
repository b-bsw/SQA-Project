package org.apache.commons.cli2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WriteableCommandLineTest {

    private WriteableCommandLineImpl commandLine;
    private GroupImpl rootOption;

    @Before
    public void setUp() {
        rootOption = new GroupImpl(new ArrayList<Option>(), "root", "Root option", 0, 0, false);
        commandLine = new WriteableCommandLineImpl(rootOption, new ArrayList<Object>());
    }

    @After
    public void tearDown() {
        commandLine = null;
        rootOption = null;
    }

    @Test
    public void testAddOptionAndHasOption() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "opt", "Desc", 0, 0, false);
        assertFalse(commandLine.hasOption(opt));
        commandLine.addOption(opt);
        assertTrue(commandLine.hasOption(opt));
    }

    @Test
    public void testGetOptionByTrigger() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "foo", "Foo desc", 0, 0, false);
        commandLine.addOption(opt);
        assertSame(opt, commandLine.getOption("foo"));
    }

    @Test
    public void testGetOptionMissingTrigger() {
        assertNull(commandLine.getOption("missing"));
    }

    @Test
    public void testAddValueAndGetValues() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "val", "Val desc", 0, 0, false);
        commandLine.addOption(opt);
        commandLine.addValue(opt, "value1");
        commandLine.addValue(opt, "value2");

        List values = commandLine.getValues(opt, Collections.emptyList());
        assertEquals(Arrays.asList("value1", "value2"), values);
    }

    @Test
    public void testGetValuesReturnsDefaultWhenNoValueSet() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "def", "Default desc", 0, 0, false);
        List defaults = Arrays.asList("def1", "def2");

        assertEquals(defaults, commandLine.getValues(opt, defaults));
    }

    @Test
    public void testGetUndefaultedValuesExcludesDefaults() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "undef", "Undef desc", 0, 0, false);
        commandLine.addOption(opt);

        List defaults = Arrays.asList("default");
        commandLine.setDefaultValues(opt, defaults);

        commandLine.addValue(opt, "real");

        List undefaulted = commandLine.getUndefaultedValues(opt);
        assertEquals(1, undefaulted.size());
        assertEquals("real", undefaulted.get(0));
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "sw", "Switch desc", 0, 0, false);
        commandLine.addSwitch(opt, true);

        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateThrowsIllegalStateException() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "sw2", "Switch2 desc", 0, 0, false);
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitchReturnsDefaultWhenUnset() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "sw3", "Switch3 desc", 0, 0, false);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testAddPropertyAndGetProperty() {
        commandLine.addProperty("key", "value");
        assertEquals("value", commandLine.getProperty("key"));
    }

    @Test
    public void testAddPropertyWithOptionAndGetProperty() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "propOpt", "Prop desc", 0, 0, false);
        commandLine.addProperty(opt, "name", "value");

        assertEquals("value", commandLine.getProperty("name"));
    }

    @Test
    public void testGetPropertyReturnsNullWhenMissing() {
        assertNull(commandLine.getProperty("no-property"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("-x"));
        assertTrue(commandLine.looksLikeOption("--long"));
        assertFalse(commandLine.looksLikeOption("plain"));
    }

    @Test
    public void testGetValuesWithNullDefaultAndStoredValue() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "nullDefault", "Null default desc", 0, 0, false);
        commandLine.addOption(opt);
        commandLine.addValue(opt, "stored");

        List result = commandLine.getValues(opt, null);
        assertEquals(1, result.size());
        assertEquals("stored", result.get(0));
    }

    @Test
    public void testSetDefaultValuesThenAddValue() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "mixed", "Mixed desc", 0, 0, false);
        commandLine.addOption(opt);

        commandLine.setDefaultValues(opt, Collections.singletonList("def"));
        commandLine.addValue(opt, "user");

        List allValues = commandLine.getValues(opt, Collections.emptyList());
        assertEquals(2, allValues.size());
        assertEquals("def", allValues.get(0));
        assertEquals("user", allValues.get(1));
    }

    @Test
    public void testAddNullValueIsStored() {
        GroupImpl opt = new GroupImpl(new ArrayList<Option>(), "nullVal", "Null val desc", 0, 0, false);
        commandLine.addOption(opt);
        commandLine.addValue(opt, null);

        List values = commandLine.getValues(opt, Collections.emptyList());
        assertEquals(1, values.size());
        assertNull(values.get(0));
    }
}
