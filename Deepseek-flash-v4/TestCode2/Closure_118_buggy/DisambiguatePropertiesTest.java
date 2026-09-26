package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.DisambiguateProperties.Property;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticScope;

public class DisambiguatePropertiesTest {

    private TestCompiler compiler;
    private TestTypeSystem typeSystem;
    private Map<String, CheckLevel> emptyErrorMap;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        typeSystem = new TestTypeSystem();
        emptyErrorMap = Maps.newHashMap();
    }

    // ---------- Property.addType ----------

    @Test
    public void testAddType_normalWithoutRelatedType() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        boolean result = prop.addType("typeA", "topA", null);
        assertTrue(result);
        assertFalse(prop.skipRenaming);
        assertEquals(1, prop.getTypes().elements().size());
    }

    @Test
    public void testAddType_withRelatedType() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.getTypes().add("typeA");
        boolean result = prop.addType("typeB", "topB", "typeA");
        assertTrue(result);
        // types union should contain both and be equivalence class
        assertEquals(2, prop.getTypes().elements().size());
        assertSame(prop.getTypes().find("typeA"), prop.getTypes().find("typeB"));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddType_whenAlreadySkipped_throws() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.invalidate(); // sets skipRenaming = true
        prop.addType("typeA", "topA", null);
    }

    @Test
    public void testAddType_whenTopInvalidating_invalidatesAndReturnsFalse() {
        typeSystem.addInvalidatingType("invalidTop");
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        boolean result = prop.addType("typeA", "invalidTop", null);
        assertFalse(result);
        assertTrue(prop.skipRenaming);
    }

    @Test
    public void testAddType_whenTopIsTypeToSkip_addsTypeToSkip() {
        typeSystem.addTypeToSkip("skipTop");
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        assertTrue(prop.typesToSkip.isEmpty());
        boolean result = prop.addType("typeA", "skipTop", null);
        assertTrue(result);
        assertTrue(prop.typesToSkip.contains("skipTop"));
    }

    // ---------- Property.shouldRename ----------

    @Test
    public void testShouldRename_falseWhenSkipped() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.invalidate();
        assertFalse(prop.shouldRename());
    }

    @Test
    public void testShouldRename_falseWhenTypesNull() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        assertNull(prop.types);
        assertFalse(prop.shouldRename());
    }

    @Test
    public void testShouldRename_falseWhenOnlyOneEquivalenceClass() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.addType("A", "A", null);
        assertFalse(prop.shouldRename());
    }

    @Test
    public void testShouldRename_trueAfterMultipleUnions() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.addType("A", "A", null);
        prop.addType("B", "B", null);
        assertEquals(2, prop.getTypes().allEquivalenceClasses().size());
        assertTrue(prop.shouldRename());
    }

    // ---------- Property.invalidate ----------

    @Test
    public void testInvalidate_returnsTrueFirstTime() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        assertTrue(prop.invalidate());
        assertTrue(prop.skipRenaming);
        assertNull(prop.types);
    }

    @Test
    public void testInvalidate_returnsFalseWhenAlreadySkipped() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.invalidate();
        assertFalse(prop.invalidate());
    }

    // ---------- Property.scheduleRenaming ----------

    @Test
    public void testScheduleRenaming_normal_addsNode() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        Node node = new Node(0); // dummy node
        boolean result = prop.scheduleRenaming(node, "myType");
        assertTrue(result);
        assertTrue(prop.renameNodes.contains(node));
        assertEquals("myType", prop.rootTypes.get(node));
    }

    @Test
    public void testScheduleRenaming_invalidatingType_invalidatesAndReturnsFalse() {
        typeSystem.addInvalidatingType("invalid");
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        Node node = new Node(0);
        boolean result = prop.scheduleRenaming(node, "invalid");
        assertFalse(result);
        assertTrue(prop.skipRenaming);
        assertTrue(prop.renameNodes.isEmpty());
    }

    @Test
    public void testScheduleRenaming_whenAlreadySkipped_doesNotAdd() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.invalidate();
        Node node = new Node(0);
        boolean result = prop.scheduleRenaming(node, "any");
        assertFalse(result);
        assertTrue(prop.renameNodes.isEmpty());
    }

    // ---------- Property.expandTypesToSkip ----------

    @Test
    public void testExpandTypesToSkip_noChanges_loopZero() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.getTypes().add("A");
        prop.typesToSkip.add("A");
        // expand should exit immediately because size doesn't change
        prop.expandTypesToSkip();
        assertEquals(1, prop.typesToSkip.size());
    }

    @Test
    public void testExpandTypesToSkip_oneIteration() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.getTypes().add("A");
        prop.getTypes().add("B");
        prop.getTypes().union("A", "B"); // root becomes same (e.g., "A")
        prop.typesToSkip.add("A");
        prop.expandTypesToSkip();
        // after expansion, "B" should be added because its root "A" is in typesToSkip
        assertTrue(prop.typesToSkip.contains("B"));
    }

    @Test
    public void testExpandTypesToSkip_multipleIterations() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("test");
        prop.getTypes().add("A");
        prop.getTypes().add("B");
        prop.getTypes().add("C");
        prop.getTypes().union("A", "B"); // root "A" for A and B
        prop.getTypes().union("B", "C"); // now root "A" for all
        prop.typesToSkip.add("A");
        // after first iteration: all roots already in typesToSkip; no new types -> stop
        prop.expandTypesToSkip();
        assertTrue(prop.typesToSkip.contains("B"));
        assertTrue(prop.typesToSkip.contains("C"));
    }

    // ---------- getRenamedTypesForTesting ----------

    @Test
    public void testGetRenamedTypesForTesting_noSkippedProperties() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("color");
        prop.addType("Red", "Red", null);
        prop.addType("Blue", "Blue", null);
        // should have two distinct equivalence classes
        Map<String, Collection<String>> renamed = dis.getRenamedTypesForTesting();
        assertFalse(renamed.isEmpty());
        assertTrue(renamed.containsKey("color"));
        assertEquals(2, renamed.get("color").size());
    }

    @Test
    public void testGetRenamedTypesForTesting_excludesSkippedTypes() {
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        Property prop = dis.new Property("color");
        prop.addType("Red", "Red", null);
        prop.addType("Blue", "Blue", null);
        prop.typesToSkip.add("Red");
        prop.expandTypesToSkip();
        Map<String, Collection<String>> renamed = dis.getRenamedTypesForTesting();
        Collection<String> sets = renamed.get("color");
        // Blue should still appear; Red should be skipped
        for (Collection<String> set : renamed.values()) {
            for (String s : set) {
                assertFalse("Red should be skipped", s.equals("Red"));
            }
        }
    }

    // ---------- process() lifecycle check ----------

    @Test(expected = IllegalStateException.class)
    public void testProcess_throwsWhenStageNotNormalized() {
        compiler.lifeCycleStage = LifeCycleStage.RAW;
        DisambiguateProperties<String> dis = new DisambiguateProperties<>(compiler, typeSystem, emptyErrorMap);
        // process will check stage and throw because we set RAW
        Node externs = new Node(1);
        Node root = new Node(2);
        dis.process(externs, root);
    }

    // ---------- Inner helper classes ----------

    static class TestTypeSystem implements TypeSystem<String> {
        Set<String> invalidating = new HashSet<>();
        Set<String> typesToSkip = new HashSet<>();

        void addInvalidatingType(String t) { invalidating.add(t); }
        void addTypeToSkip(String t) { typesToSkip.add(t); }

        @Override
        public boolean isInvalidatingType(String type) {
            return type != null && invalidating.contains(type);
        }

        @Override
        public boolean isTypeToSkip(String type) {
            return type != null && typesToSkip.contains(type);
        }

        @Override
        public ImmutableSet<String> getTypesToSkipForType(String type) {
            return ImmutableSet.of(type);
        }

        @Override
        public String restrictByNotNullOrUndefined(String type) {
            return type;
        }

        @Override
        public Iterable<String> getTypeAlternatives(String type) {
            return null;
        }

        @Override
        public String getTypeWithProperty(String field, String type) {
            return type;
        }

        @Override
        public String getInstanceFromPrototype(String type) {
            return null;
        }

        @Override
        public void recordInterfaces(String type, String relatedType, DisambiguateProperties<String>.Property p) {
        }

        @Override
        public void addInvalidatingType(JSType type) {
            // not needed for string-based tests
        }

        @Override
        public StaticScope<String> getRootScope() {
            return null;
        }

        @Override
        public StaticScope<String> getFunctionScope(Node node) {
            return null;
        }

        @Override
        public String getType(StaticScope<String> scope, Node node, String prop) {
            return null;
        }
    }

    static class TestCompiler extends AbstractCompiler {
        LifeCycleStage lifeCycleStage = LifeCycleStage.NORMALIZED;
        int codeChangeCount = 0;

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return lifeCycleStage;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return new TypeValidator() {
                @Override
                public List<TypeMismatch> getMismatches() {
                    return java.util.Collections.emptyList();
                }
            };
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return null; // not used in string-based tests
        }

        @Override
        public void report(JSError error) {
            // do nothing
        }

        @Override
        public void reportCodeChange() {
            codeChangeCount++;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return null;
        }
    }
}