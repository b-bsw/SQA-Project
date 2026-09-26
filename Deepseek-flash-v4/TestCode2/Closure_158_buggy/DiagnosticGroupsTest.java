package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DiagnosticGroupsTest {

    private final DiagnosticGroups diagnosticGroups = new DiagnosticGroups();

    @Test
    public void testForNameReturnsRegisteredGroupForKnownName() {
        assertSame(DiagnosticGroups.GLOBAL_THIS,
                diagnosticGroups.forName("globalThis"));
        assertSame(DiagnosticGroups.DEPRECATED,
                diagnosticGroups.forName("deprecated"));
        assertSame(DiagnosticGroups.MISSING_PROPERTIES,
                diagnosticGroups.forName("missingProperties"));
        assertSame(DiagnosticGroups.CHECK_TYPES,
                diagnosticGroups.forName("checkTypes"));
        assertSame(DiagnosticGroups.CHECK_VARIABLES,
                diagnosticGroups.forName("checkVars"));
    }

    @Test
    public void testForNameHandlesUnknownNullAndEmptyNames() {
        assertNull(diagnosticGroups.forName("noSuchGroup"));
        assertNull(diagnosticGroups.forName(""));
        assertNull(diagnosticGroups.forName(null));
    }

    @Test
    public void testGetRegisteredGroupsContainsRegisteredGroups() {
        Map<String, DiagnosticGroup> groups =
                diagnosticGroups.getRegisteredGroups();

        assertSame(DiagnosticGroups.GLOBAL_THIS, groups.get("globalThis"));
        assertSame(DiagnosticGroups.UNDEFINED_VARIABLES,
                groups.get("undefinedVars"));
        assertSame(DiagnosticGroups.ACCESS_CONTROLS,
                groups.get("accessControls"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRegisteredGroupsIsImmutable() {
        diagnosticGroups.getRegisteredGroups()
                .put("newGroup", DiagnosticGroups.GLOBAL_THIS);
    }

    @Test
    public void testSetWarningLevelsWithZeroOneAndManyNames() {
        RecordingOptions options = new RecordingOptions();
        diagnosticGroups.setWarningLevels(options,
                Collections.<String>emptyList(), CheckLevel.WARNING);
        assertTrue(options.groups.isEmpty());
        assertTrue(options.levels.isEmpty());

        options = new RecordingOptions();
        diagnosticGroups.setWarningLevels(options,
                Collections.singletonList("globalThis"), CheckLevel.WARNING);
        assertEquals(
                Collections.<DiagnosticGroup>singletonList(
                        DiagnosticGroups.GLOBAL_THIS),
                options.groups);
        assertEquals(1, options.levels.size());

        options = new RecordingOptions();
        diagnosticGroups.setWarningLevels(options,
                Arrays.asList("globalThis", "deprecated"), CheckLevel.WARNING);
        assertEquals(
                Arrays.asList(DiagnosticGroups.GLOBAL_THIS,
                        DiagnosticGroups.DEPRECATED),
                options.groups);
        assertEquals(2, options.levels.size());
        assertEquals(CheckLevel.WARNING, options.levels.get(0));
        assertEquals(CheckLevel.WARNING, options.levels.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevelsWithNullListThrowsNpe() {
        diagnosticGroups.setWarningLevels(
                new RecordingOptions(), null, CheckLevel.WARNING);
    }

    @Test
    public void testSetWarningLevelsWithUnknownNameThrowsNpe() {
        try {
            diagnosticGroups.setWarningLevels(new RecordingOptions(),
                    Collections.singletonList("unknownGroup"),
                    CheckLevel.WARNING);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("No warning class for name: unknownGroup",
                    expected.getMessage());
        }
    }

    private static class RecordingOptions extends CompilerOptions {
        private final List<DiagnosticGroup> groups =
                new ArrayList<DiagnosticGroup>();
        private final List<CheckLevel> levels =
                new ArrayList<CheckLevel>();

        @Override
        public void setWarningLevel(DiagnosticGroup type, CheckLevel level) {
            groups.add(type);
            levels.add(level);
        }
    }
}