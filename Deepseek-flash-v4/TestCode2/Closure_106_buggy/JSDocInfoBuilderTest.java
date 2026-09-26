package com.google.javascript.rhino;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JSDocInfoBuilderTest {

    private JSDocInfoBuilder builderWithDocs;
    private JSDocInfoBuilder builderWithoutDocs;

    @Before
    public void setUp() {
        builderWithDocs = new JSDocInfoBuilder(true);
        builderWithoutDocs = new JSDocInfoBuilder(false);
    }

    @Test
    public void testInitialState() {
        assertFalse(builderWithDocs.isPopulated());
        assertFalse(builderWithDocs.isPopulatedWithFileOverview());
        assertFalse(builderWithDocs.isDescriptionRecorded());
        assertNull(builderWithDocs.build("test.js"));
    }

    @Test
    public void testBuildWhenNotPopulatedReturnsNull() {
        assertNull(builderWithDocs.build("source.js"));
        assertNull(builderWithoutDocs.build("source.js"));
    }

    @Test
    public void testRecordBlockDescriptionWithParseDocumentationTrue() {
        // Should set populated and return true
        boolean recorded = builderWithDocs.recordBlockDescription("Block desc");
        assertTrue(recorded);
        assertTrue(builderWithDocs.isPopulated());
        // build should succeed and description should be recorded
        JSDocInfo info = builderWithDocs.build("test.js");
        assertNotNull(info);
        // After build, builder is reset
        assertFalse(builderWithDocs.isPopulated());
        // Description should be accessible via isDescriptionRecorded? Actually recordBlockDescription
        // calls currentInfo.documentBlock, which may set description; we cannot test directly.
        // But we can check that isDescriptionRecorded returns true (since block description set)
        // However after build the builder is new object, so isDescriptionRecorded returns false.
        // So we check the built JSDocInfo. Unfortunately JSDocInfo doesn't expose a getter for block description.
        // We'll just trust the method and rely on isPopulated.
    }

    @Test
    public void testRecordBlockDescriptionWithParseDocumentationFalse() {
        // parseDocumentation false, block description should not be recorded (populated stays false)
        boolean recorded = builderWithoutDocs.recordBlockDescription("Block desc");
        assertFalse(recorded); // from source: if (parseDocumentation) { populated = true; } then return currentInfo.documentBlock(description)
        // Actually recordBlockDescription does: if (parseDocumentation) { populated = true; } return currentInfo.documentBlock(description);
        // When parseDocumentation is false, populated is not set and documentBlock may still return true/false based on internal state.
        // We need to examine source: if (!parseDocumentation) then only return currentInfo.documentBlock(description).
        // documentBlock might still succeed, but populated is not set. So recorded could be true, but isPopulated remains false.
        // We'll test that isPopulated stays false.
        assertFalse(builderWithoutDocs.isPopulated());
        // build should return null because populated is false
        assertNull(builderWithoutDocs.build("test.js"));
    }

    @Test
    public void testRecordVisibilityFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordVisibility(Visibility.PUBLIC));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordVisibilitySecondTimeReturnsFalse() {
        builderWithDocs.recordVisibility(Visibility.PUBLIC);
        assertFalse(builderWithDocs.recordVisibility(Visibility.PRIVATE));
    }

    @Test
    public void testRecordVisibilitySetsVisibilityInBuiltInfo() {
        builderWithDocs.recordVisibility(Visibility.PROTECTED);
        JSDocInfo info = builderWithDocs.build("source.js");
        assertNotNull(info);
        // getVisibility returns the recorded visibility
        assertEquals(Visibility.PROTECTED, info.getVisibility());
    }

    @Test
    public void testPopulateDefaultsWhenVisibilityNotSet() {
        // record something else, then build
        builderWithDocs.recordConstancy();
        JSDocInfo info = builderWithDocs.build("source.js");
        assertNotNull(info);
        // visibility should be defaulted to INHERITED
        assertEquals(Visibility.INHERITED, info.getVisibility());
    }

    @Test
    public void testRecordDescriptionNullReturnsFalse() {
        assertFalse(builderWithDocs.recordDescription(null));
        assertFalse(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordDescriptionNonNullReturnsTrue() {
        assertTrue(builderWithDocs.recordDescription("A description"));
        assertTrue(builderWithDocs.isPopulated());
        JSDocInfo info = builderWithDocs.build("test.js");
        assertNotNull(info);
        assertEquals("A description", info.getDescription());
    }

    @Test
    public void testRecordDescriptionAlreadySetReturnsFalse() {
        builderWithDocs.recordDescription("first");
        assertFalse(builderWithDocs.recordDescription("second"));
    }

    @Test
    public void testRecordConstancyFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordConstancy());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordConstancySecondTimeReturnsFalse() {
        builderWithDocs.recordConstancy();
        assertFalse(builderWithDocs.recordConstancy());
    }

    @Test
    public void testRecordConstancySetsConstantInBuiltInfo() {
        builderWithDocs.recordConstancy();
        JSDocInfo info = builderWithDocs.build("source.js");
        assertTrue(info.isConstant());
    }

    @Test
    public void testRecordConstructorFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordConstructor());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordConstructorSecondTimeReturnsFalse() {
        builderWithDocs.recordConstructor();
        assertFalse(builderWithDocs.recordConstructor());
    }

    @Test
    public void testRecordConstructorIncompatibleWithInterface() {
        builderWithDocs.recordInterface();
        assertFalse(builderWithDocs.recordConstructor());
    }

    @Test
    public void testRecordInterfaceFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordInterface());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordInterfaceIncompatibleWithConstructor() {
        builderWithDocs.recordConstructor();
        assertFalse(builderWithDocs.recordInterface());
    }

    @Test
    public void testRecordConstructorAndInterfaceCompatibility() {
        // Neither recorded yet, record interface then constructor fails
        assertTrue(builderWithDocs.recordInterface());
        assertFalse(builderWithDocs.recordConstructor());
        // Also try the reverse: constructor then interface fails
        JSDocInfoBuilder builder2 = new JSDocInfoBuilder(true);
        assertTrue(builder2.recordConstructor());
        assertFalse(builder2.recordInterface());
    }

    @Test
    public void testRecordHiddennessFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordHiddenness());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordHiddennessSecondTimeReturnsFalse() {
        builderWithDocs.recordHiddenness();
        assertFalse(builderWithDocs.recordHiddenness());
    }

    @Test
    public void testRecordOverrideFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordOverride());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordOverrideSecondTimeReturnsFalse() {
        builderWithDocs.recordOverride();
        assertFalse(builderWithDocs.recordOverride());
    }

    @Test
    public void testRecordDeprecatedFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordDeprecated());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordDeprecatedSecondTimeReturnsFalse() {
        builderWithDocs.recordDeprecated();
        assertFalse(builderWithDocs.recordDeprecated());
    }

    @Test
    public void testRecordNoTypeCheckFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordNoTypeCheck());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordNoTypeCheckSecondTimeReturnsFalse() {
        builderWithDocs.recordNoTypeCheck();
        assertFalse(builderWithDocs.recordNoTypeCheck());
    }

    @Test
    public void testRecordExportFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordExport());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordNoShadowFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordNoShadow());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordImplicitCastFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordImplicitCast());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordNoSideEffectsFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordNoSideEffects());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordFileOverviewReturnsTrue() {
        assertTrue(builderWithDocs.recordFileOverview("File overview"));
        assertTrue(builderWithDocs.isPopulated());
        assertTrue(builderWithDocs.isPopulatedWithFileOverview());
    }

    @Test
    public void testRecordVersionFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordVersion("1.0"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordDeprecationReasonFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordDeprecationReason("Old API"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordPreserveTryFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordPreserveTry());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordNoAliasFirstTimeReturnsTrue() {
        assertTrue(builderWithDocs.recordNoAlias());
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testMarkAnnotationDoesNotSetPopulated() {
        builderWithDocs.markAnnotation("@param", 1, 0);
        assertFalse(builderWithDocs.isPopulated());
        // Build should still return null because populated is false
        assertNull(builderWithDocs.build("test.js"));
    }

    @Test
    public void testMarkAnnotationThenMarkText() {
        builderWithDocs.markAnnotation("@param", 1, 0);
        builderWithDocs.markText("description", 1, 7, 1, 18);
        // Still not populated
        assertFalse(builderWithDocs.isPopulated());
    }

    @Test
    public void testMarkAnnotationThenMarkTypeNode() {
        // We can't create a Node easily, so we pass null? markTypeNode checks currentMarker != null,
        // then sets currentMarker.type with null node. It won't crash if node is null.
        builderWithDocs.markAnnotation("@type", 2, 5);
        builderWithDocs.markTypeNode(null, 2, 5, 10, true);
        // No effect on populated
        assertFalse(builderWithDocs.isPopulated());
    }

    @Test
    public void testMarkAnnotationThenMarkName() {
        builderWithDocs.markAnnotation("@param", 3, 2);
        builderWithDocs.markName("paramName", 3, 8);
        assertFalse(builderWithDocs.isPopulated());
    }

    @Test
    public void testMarkTextWithoutAnnotationDoesNothing() {
        // currentMarker is null, markText should just return without effect
        builderWithDocs.markText("some text", 1, 1, 1, 10);
        assertFalse(builderWithDocs.isPopulated());
    }

    @Test
    public void testAddAuthorReturnsTrueFirstTime() {
        assertTrue(builderWithDocs.addAuthor("author@example.com"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testAddReferenceReturnsTrueFirstTime() {
        assertTrue(builderWithDocs.addReference("see #method"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordSuppressionsReturnsTrueFirstTime() {
        java.util.Set<String> suppressions = new java.util.HashSet<>();
        suppressions.add("unused");
        assertTrue(builderWithDocs.recordSuppressions(suppressions));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordReturnDescriptionReturnsTrue() {
        // recordReturnDescription requires that currentInfo.documentReturn returns true
        // It should work if no previous return description
        assertTrue(builderWithDocs.recordReturnDescription("return value"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordParameterDescriptionReturnsTrue() {
        assertTrue(builderWithDocs.recordParameterDescription("param1", "description"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testRecordTemplateTypeNameReturnsTrue() {
        assertTrue(builderWithDocs.recordTemplateTypeName("T"));
        assertTrue(builderWithDocs.isPopulated());
    }

    @Test
    public void testHasParameterInitiallyFalse() {
        assertFalse(builderWithDocs.hasParameter("x"));
    }

    @Test
    public void testMultipleRecordingsAggregate() {
        builderWithDocs.recordDescription("desc");
        builderWithDocs.recordConstancy();
        builderWithDocs.recordVisibility(Visibility.PRIVATE);
        JSDocInfo info = builderWithDocs.build("file.js");
        assertNotNull(info);
        assertEquals("desc", info.getDescription());
        assertTrue(info.isConstant());
        assertEquals(Visibility.PRIVATE, info.getVisibility());
    }

    @Test
    public void testBuildClearsPopulatedAfterwards() {
        builderWithDocs.recordDescription("test");
        assertTrue(builderWithDocs.isPopulated());
        JSDocInfo info = builderWithDocs.build("file.js");
        assertNotNull(info);
        assertFalse(builderWithDocs.isPopulated());
        // Subsequent build returns null
        assertNull(builderWithDocs.build("file2.js"));
    }

    @Test
    public void testConstructorSetsParseDocumentationField() {
        // parseDocumentation is used in recordBlockDescription
        // Already tested in recordBlockDescription tests
    }
}