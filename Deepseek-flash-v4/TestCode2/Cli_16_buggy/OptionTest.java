package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class OptionTest {

    private GroupImpl group;
    private WriteableCommandLine commandLine;

    @Before
    public void setUp() {
        group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        commandLine = new WriteableCommandLineImpl(group, new ArrayList());
    }

    @Test
    public void testDefaultConstructorValues() {
        assertEquals("group", group.getPreferredName());
        assertEquals("desc", group.getDescription());
        assertFalse(group.isRequired());
        assertTrue(group.getId() >= 0);
    }

    @Test
    public void testGetPrefixesAndTriggersNeverNull() {
        assertNotNull(group.getPrefixes());
        assertNotNull(group.getTriggers());
    }

    @Test
    public void testDefaultsDoesNotAlterCommandLine() {
        group.defaults(commandLine);
        assertNotNull(commandLine);
    }

    @Test
    public void testValidateAllowsOptionalGroup() throws Exception {
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testProcessWithNoArgumentsFails() throws Exception {
        group.process(commandLine, new ArrayList().listIterator());
    }

    @Test(expected = OptionException.class)
    public void testProcessWithUnknownSingleArgumentFails() throws Exception {
        group.process(commandLine, Collections.singletonList("--bad").listIterator());
    }

    @Test(expected = OptionException.class)
    public void testProcessWithMultipleUnknownArgumentsFails() throws Exception {
        group.process(commandLine, Arrays.asList("--a", "--b", "--c").listIterator());
    }

    @Test
    public void testCanProcessReturnsFalseForEmptyIterator() {
        assertFalse(group.canProcess(commandLine, new ArrayList().listIterator()));
    }

    @Test
    public void testCanProcessReturnsFalseForUnknownArgument() {
        assertFalse(group.canProcess(commandLine, "--bad"));
    }

    @Test
    public void testCanProcessReturnsFalseForNullArgument() {
        assertFalse(group.canProcess(commandLine, (String) null));
    }

    @Test
    public void testFindOptionReturnsNullForUnknownTrigger() {
        assertNull(group.findOption("--bad"));
    }

    @Test
    public void testHelpLinesNotNull() {
        assertNotNull(group.helpLines(0, Collections.EMPTY_SET, null));
    }

    @Test
    public void testAppendUsageWritesToBuffer() {
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, Collections.EMPTY_SET, null);
        assertTrue(buffer.length() > 0);
    }

    @Test
    public void testObjectMethods() {
        assertSame(group, group);
        assertEquals(group, group);
        assertFalse(group.equals(null));
        assertNotNull(group.toString());
    }
}