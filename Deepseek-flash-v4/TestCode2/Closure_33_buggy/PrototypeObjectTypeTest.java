import static org.junit.Assert.*;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PrototypeObjectTypeTest {

    private PrototypeObjectType base;
    private PrototypeObjectType child;

    @Before
    public void setUp() {
        // nativeType = true avoids touching a null JSTypeRegistry.
        base = new PrototypeObjectType(null, "Base", null, true);
        child = new PrototypeObjectType(null, null, base, false);
    }

    @Test
    public void testInitialState() {
        assertTrue(base.isNativeObjectType());
        assertFalse(child.isNativeObjectType());

        assertNull(base.getImplicitPrototype());
        assertSame(base, child.getImplicitPrototype());

        assertEquals("Base", base.getReferenceName());
        assertNull(child.getReferenceName());
        assertTrue(base.hasReferenceName());
        assertFalse(child.hasReferenceName());

        assertEquals(0, base.getPropertiesCount());
        assertTrue(base.getOwnPropertyNames().isEmpty());

        assertTrue(base.matchesObjectContext());
        assertFalse(base.canBeCalled());
        assertFalse(base.matchesNumberContext());
        assertFalse(base.matchesStringContext());
    }

    @Test
    public void testAddAndRemoveProperty() {
        assertFalse(base.hasOwnProperty("p"));
        assertTrue(base.defineProperty("p", base, false, null));

        assertTrue(base.hasOwnProperty("p"));
        assertTrue(base.hasProperty("p"));
        assertSame(base, base.getPropertyType("p"));
        assertEquals(1, base.getPropertiesCount());

        assertTrue(base.removeProperty("p"));
        assertFalse(base.hasOwnProperty("p"));
        assertFalse(base.removeProperty("p"));
    }

    @Test
    public void testDeclaredAndInferredPropertyFlags() {
        base.defineProperty("declared", base, false, null);
        base.defineProperty("inferred", child, true, null);

        assertTrue(base.isPropertyTypeDeclared("declared"));
        assertFalse(base.isPropertyTypeInferred("declared"));

        assertFalse(base.isPropertyTypeDeclared("inferred"));
        assertTrue(base.isPropertyTypeInferred("inferred"));

        assertFalse(base.isPropertyTypeDeclared("missing"));
        assertFalse(base.isPropertyTypeInferred("missing"));
    }

    @Test
    public void testCannotRedefineDeclaredProperty() {
        assertTrue(base.defineProperty("p", base, false, null));
        assertFalse(base.defineProperty("p", child, false, null));

        assertSame(base, base.getPropertyType("p"));
    }

    @Test
    public void testUpgradeInferredPropertyToDeclared() {
        assertTrue(base.defineProperty("p", base, true, null));
        assertTrue(base.defineProperty("p", child, false, null));

        assertSame(child, base.getPropertyType("p"));
        assertTrue(base.isPropertyTypeDeclared("p"));
    }

    @Test
    public void testPropertyCountAndNamesWithPrototype() {
        base.defineProperty("baseProp", base, false, null);
        child.defineProperty("childProp", child, false, null);
        child.defineProperty("baseProp", child, false, null);

        assertEquals(2, child.getPropertiesCount());

        Set<String> names = new HashSet<>();
        child.collectPropertyNames(names);
        assertTrue(names.contains("baseProp"));
        assertTrue(names.contains("childProp"));
    }

    @Test
    public void testInheritedPropertyLookup() {
        base.defineProperty("baseProp", base, false, null);
        child.defineProperty("childProp", child, false, null);

        assertTrue(child.hasProperty("baseProp"));
        assertFalse(child.hasOwnProperty("baseProp"));
        assertSame(base, child.getPropertyType("baseProp"));
        assertTrue(child.isPropertyTypeDeclared("baseProp"));

        assertEquals(2, child.getPropertiesCount());
    }

    @Test
    public void testReferenceName() {
        assertEquals("Base", base.getReferenceName());
        assertNull(child.getReferenceName());

        PrototypeObjectType noName = new PrototypeObjectType(null, null, null, true);
        assertNull(noName.getReferenceName());
        assertFalse(noName.hasReferenceName());
    }

    @Test
    public void testPropertyNode() {
        Node node = new Node(1);
        base.defineProperty("p", base, false, node);

        assertSame(node, base.getPropertyNode("p"));
        assertSame(node, child.getPropertyNode("p"));

        base.removeProperty("p");
        assertNull(base.getPropertyNode("p"));
    }

    @Test
    public void testSetAndGetPropertyJSDocInfo() {
        JSDocInfo info = new JSDocInfo();

        base.defineProperty("p", base, false, null);
        base.setPropertyJSDocInfo("p", info);

        assertSame(info, base.getOwnPropertyJSDocInfo("p"));
        assertNull(base.getOwnPropertyJSDocInfo("missing"));
    }

    @Test
    public void testHasPropertyWhenUnknownType() {
        UnknownPrototypeObjectType unknown = new UnknownPrototypeObjectType();
        assertTrue(unknown.hasProperty("anything"));
        assertFalse(unknown.hasOwnProperty("anything"));
    }

    @Test
    public void testMatchConstraintAddsMissingInferredProperty() {
        RecordPrototypeObjectType constraint = new RecordPrototypeObjectType(true);
        constraint.defineProperty("recordProp", base, false, null);

        base.matchConstraint(constraint);

        assertTrue(base.hasProperty("recordProp"));
        assertTrue(base.isPropertyTypeInferred("recordProp"));
    }

    @Test
    public void testMatchConstraintDoesNothingForNonRecord() {
        RecordPrototypeObjectType notRecord = new RecordPrototypeObjectType(false);
        notRecord.defineProperty("x", base, false, null);

        base.matchConstraint(notRecord);

        assertFalse(base.hasOwnProperty("x"));
    }

    private static class UnknownPrototypeObjectType extends PrototypeObjectType {
        UnknownPrototypeObjectType() {
            super(null, "Unknown", null, true);
        }

        @Override
        public boolean isUnknownType() {
            return true;
        }
    }

    private static class RecordPrototypeObjectType extends PrototypeObjectType {
        private final boolean recordType;

        RecordPrototypeObjectType(boolean recordType) {
            super(null, "Record", null, true);
            this.recordType = recordType;
        }

        @Override
        public boolean isRecordType() {
            return recordType;
        }
    }
}