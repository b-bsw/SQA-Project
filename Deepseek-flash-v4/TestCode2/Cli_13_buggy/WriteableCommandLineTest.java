package org.apache.commons.cli2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WriteableCommandLineTest {

    private WriteableCommandLineImpl createCommandLine() {
        Option root = new ArgumentImpl("root", null, 0, 0, '\0', '\0', null, null, null, 0);
        return new WriteableCommandLineImpl(root, new ArrayList<Option>());
    }

    private Option createOption(final String name) {
        return new ArgumentImpl(name, null, 0, 1, '\0', '\0', null, null, null, 0);
    }

    @Test
    public void testAddOptionAndHasOption() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("arg");
        assertFalse(cmd.hasOption(option));
        cmd.addOption(option);
        assertTrue(cmd.hasOption(option));
    }

    @Test
    public void testGetOptionByPreferredName() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("arg");
        cmd.addOption(option);
        assertSame(option, cmd.getOption(option.getPreferredName()));
    }

    @Test
    public void testAddValueAndGetValues() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("arg");
        cmd.addOption(option);
        cmd.addValue(option, "one");
        cmd.addValue(option, "two");
        List values = cmd.getValues(option, Collections.emptyList());
        assertEquals(Arrays.asList("one", "two"), values);
    }

    @Test
    public void testGetValuesReturnsDefaultWhenNoValuesAdded() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("arg");
        List defaults = Arrays.asList("default");
        cmd.setDefaultValues(option, defaults);
        assertEquals(defaults, cmd.getValues(option, null));
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("switch");
        cmd.addSwitch(option, true);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchTwiceThrowsIllegalState() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("switch");
        cmd.addSwitch(option, true);
        cmd.addSwitch(option, false);
    }

    @Test
    public void testDefaultSwitchValue() {
        WriteableCommandLineImpl cmd = createCommandLine();
        Option option = createOption("switch");
        cmd.setDefaultSwitch(option, true);
        assertEquals(Boolean.TRUE, cmd.getSwitch(option, Boolean.FALSE));
    }

    @Test
    public void testAddPropertyAndGetProperty() {
        WriteableCommandLineImpl cmd = createCommandLine();
        cmd.addProperty("user", "alice");
        assertEquals("alice", cmd.getProperty("user", "default"));
    }

    @Test
    public void testAddPropertyReplacesValue() {
        WriteableCommandLineImpl cmd = createCommandLine();
        cmd.addProperty("user", "alice");
        cmd.addProperty("user", "bob");
        assertEquals("bob", cmd.getProperty("user", "default"));
    }

    @Test
    public void testGetPropertyReturnsDefault() {
        WriteableCommandLineImpl cmd = createCommandLine();
        assertNull(cmd.getProperty("unknown", null));
        assertEquals("def", cmd.getProperty("unknown", "def"));
    }

    @Test
    public void testGetPropertiesContainsAddedKeys() {
        WriteableCommandLineImpl cmd = createCommandLine();
        cmd.addProperty("key1", "val1");
        cmd.addProperty("key2", "val2");
        Set props = cmd.getProperties();
        assertNotNull(props);
        assertEquals(2, props.size());
        assertTrue(props.contains("key1"));
        assertTrue(props.contains("key2"));
    }
}