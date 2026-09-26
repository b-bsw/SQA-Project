package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TypeValidatorTest {

    private TypeValidator validator;
    private MockCompiler compiler;
    private MockTypeRegistry registry;
    private MockNodeTraversal traversal;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        registry = new MockTypeRegistry();
        compiler.typeRegistry = registry;
        validator = new TypeValidator(compiler);
        traversal = new MockNodeTraversal();
    }

    // --- Stub classes ---

    static class MockCompiler extends AbstractCompiler {
        JSTypeRegistry typeRegistry;

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public void report(JSError error) {
            // captured for verification
        }
    }

    static class MockTypeRegistry extends JSTypeRegistry {
        // Provide simple stubs for native types
        @Override
        public JSType getNativeType(JSTypeNative typeId) {
            return new MockJSType(typeId);
        }

        @Override
        public JSType createUnionType(JSType... variants) {
            return new MockJSType(JSTypeNative.UNKNOWN_TYPE);
        }
    }

    static class MockJSType extends JSType {
        private final JSTypeNative nativeId;
        private boolean isObject = false;
        private boolean matchesObjectCtx = false;
        private boolean matchesStringCtx = false;
        private boolean matchesNumberCtx = false;
        private boolean isNoType = false;
        private boolean isUnknownType = false;
        private boolean isEmptyType = false;
        private boolean isSubtypeOfNullUndefined = false;
        private boolean isConstructor = false;
        private boolean isEnumType = false;
        private boolean canAssignResult = false;

        MockJSType(JSTypeNative id) {
            super(null); // no registry needed
            this.nativeId = id;
        }

        // Setter methods for test control
        void setMatchesObjectContext(boolean val) { matchesObjectCtx = val; }
        void setMatchesStringContext(boolean val) { matchesStringCtx = val; }
        void setMatchesNumberContext(boolean val) { matchesNumberCtx = val; }
        void setObject(boolean val) { isObject = val; }
        void setNoType(boolean val) { isNoType = val; }
        void setUnknownType(boolean val) { isUnknownType = val; }
        void setEmptyType(boolean val) { isEmptyType = val; }
        void setSubtypeOfNullUndefined(boolean val) { isSubtypeOfNullUndefined = val; }
        void setConstructor(boolean val) { isConstructor = val; }
        void setEnumType(boolean val) { isEnumType = val; }
        void setCanAssignResult(boolean val) { canAssignResult = val; }

        @Override
        public boolean matchesObjectContext() { return matchesObjectCtx; }
        @Override
        public boolean matchesStringContext() { return matchesStringCtx; }
        @Override
        public boolean matchesNumberContext() { return matchesNumberCtx; }
        @Override
        public boolean isObject() { return isObject; }
        @Override
        public boolean isNoType() { return isNoType; }
        @Override
        public boolean isUnknownType() { return isUnknownType; }
        @Override
        public boolean isEmptyType() { return isEmptyType; }
        @Override
        public boolean isSubtype(JSType type) { return isSubtypeOfNullUndefined; }
        @Override
        public boolean canAssignTo(JSType type) { return canAssignResult; }
        @Override
        public boolean isConstructor() { return isConstructor; }
        @Override
        public boolean isEnumType() { return isEnumType; }
        @Override
        public JSType restrictByNotNullOrUndefined() { return this; }
        @Override
        public ObjectType toObjectType() { return null; }
        @Override
        public boolean isFunctionPrototypeType() { return false; }
        @Override
        public boolean isNoResolvedType() { return false; }
        @Override
        public JSType autoboxesTo() { return null; }
        @Override
        public boolean canTestForShallowEqualityWith(JSType that) { return false; }

        @Override
        public String toString() {
            return nativeId.toString();
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof MockJSType) {
                return nativeId == ((MockJSType) other).nativeId;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return nativeId.hashCode();
        }
    }

    static class MockNode extends Node {
        private String sourceName;
        private JSType jsType;
        private int type;

        MockNode(int type) {
            super(type);
            this.type = type;
        }

        @Override
        public int getType() { return type; }

        @Override
        public JSType getJSType() { return jsType; }

        @Override
        public void setJSType(JSType type) { this.jsType = type; }

        @Override
        public String getString() { return "prop"; }

        @Override
        public Node getFirstChild() { return null; }

        @Override
        public Node getLastChild() { return null; }

        @Override
        public JSDocInfo getJSDocInfo() { return null; }

        @Override
        public void setJSDocInfo(JSDocInfo info) { }

        @Override
        public Object getProp(int propType) { return null; }

        @Override
        public String getQualifiedName() { return null; }
    }

    static class MockNodeTraversal extends NodeTraversal {
        private String sourceName = "test.js";

        @Override
        public String getSourceName() { return sourceName; }

        @Override
        public boolean inGlobalScope() { return true; }

        @Override
        public JSError makeError(Node n, DiagnosticType type, Object... args) {
            return JSError.make(sourceName, n, type, args);
        }
    }

    // ============== Test Methods ==============

    @Test
    public void testExpectObject_MatchingContext_ReturnsTrue() {
        MockJSType type = new MockJSType(JSTypeNative.OBJECT_TYPE);
        type.setMatchesObjectContext(true);
        assertTrue(validator.expectObject(traversal, new MockNode(Token.NAME), type, "msg"));
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectObject_NonMatchingContext_ReturnsFalseAndRecordsMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesObjectContext(false);
        assertFalse(validator.expectObject(traversal, new MockNode(Token.NAME), type, "msg"));
        assertEquals(1, validator.getMismatches().size());
    }

    @Test
    public void testExpectString_MatchingContext_NoMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesStringContext(true);
        validator.expectString(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectString_NonMatchingContext_RecordsMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.NUMBER_TYPE);
        type.setMatchesStringContext(false);
        validator.expectString(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(1, validator.getMismatches().size());
    }

    @Test
    public void testExpectNumber_MatchingContext_NoMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.NUMBER_TYPE);
        type.setMatchesNumberContext(true);
        validator.expectNumber(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectNumber_NonMatchingContext_RecordsMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesNumberContext(false);
        validator.expectNumber(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(1, validator.getMismatches().size());
    }

    @Test
    public void testExpectNotNullOrUndefined_NonNullOrUndefinedReturnsTrue() {
        MockJSType type = new MockJSType(JSTypeNative.OBJECT_TYPE);
        type.setSubtypeOfNullUndefined(false);
        type.setNoType(false);
        type.setUnknownType(false);
        assertTrue(validator.expectNotNullOrUndefined(traversal, new MockNode(Token.NAME), type, "msg", type));
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectNotNullOrUndefined_NullSubtypeReturnsFalse() {
        MockJSType type = new MockJSType(JSTypeNative.NULL_TYPE);
        type.setSubtypeOfNullUndefined(true);
        type.setNoType(false);
        type.setUnknownType(false);
        // Also set isNullType to true via overriding isNullType? Not in mock; we rely on isSubtype
        // The method also checks for GETPROP and global scope, but we set GETPROP to avoid early return
        MockNode node = new MockNode(Token.GETPROP);
        assertFalse(validator.expectNotNullOrUndefined(traversal, node, type, "msg", type));
        assertEquals(1, validator.getMismatches().size());
    }

    @Test
    public void testExpectNotNullOrUndefined_NoTypeReturnsTrue() {
        MockJSType type = new MockJSType(JSTypeNative.NO_TYPE);
        type.setNoType(true);
        assertTrue(validator.expectNotNullOrUndefined(traversal, new MockNode(Token.NAME), type, "msg", type));
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectNotNullOrUndefined_UnknownTypeReturnsTrue() {
        MockJSType type = new MockJSType(JSTypeNative.UNKNOWN_TYPE);
        type.setUnknownType(true);
        assertTrue(validator.expectNotNullOrUndefined(traversal, new MockNode(Token.NAME), type, "msg", type));
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectNotNullOrUndefined_GETPROPGlobalScopeNullType_ReturnsTrue() {
        // Case where n.getType() == Token.GETPROP && !t.inGlobalScope() && type.isNullType()
        // We set traversal to not in global scope
        MockNode node = new MockNode(Token.GETPROP);
        MockJSType type = new MockJSType(JSTypeNative.NULL_TYPE);
        type.setSubtypeOfNullUndefined(true);
        type.setNoType(false);
        type.setUnknownType(false);
        // Make traversal return false for inGlobalScope
        traversal = new MockNodeTraversal() {
            @Override
            public boolean inGlobalScope() {
                return false;
            }
        };
        // isNullType: we need to simulate that; our mock doesn't have isNullType, so we rely on isSubtype.
        // The actual code checks "type.isNullType()". We can't mock that easily.
        // This test will fail if isNullType is not implemented. We'll skip this test case for simplicity.
        // Instead we test the branch that returns true when GETPROP and not global and type.isNullType().
        // We'll create a special mock that overrides isNullType.
        MockJSType nullType = new MockJSType(JSTypeNative.NULL_TYPE) {
            @Override
            public boolean isNullType() {
                return true;
            }
        };
        nullType.setSubtypeOfNullUndefined(true);
        nullType.setNoType(false);
        nullType.setUnknownType(false);
        assertTrue(validator.expectNotNullOrUndefined(traversal, node, nullType, "msg", nullType));
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testTypeMismatchEquals_Symmetric() {
        MockJSType a = new MockJSType(JSTypeNative.STRING_TYPE);
        MockJSType b = new MockJSType(JSTypeNative.NUMBER_TYPE);
        TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b);
        TypeValidator.TypeMismatch m2 = new TypeValidator.TypeMismatch(b, a);
        assertEquals(m1, m2);
        assertEquals(m1.hashCode(), m2.hashCode());
    }

    @Test
    public void testTypeMismatchNotEquals() {
        MockJSType a = new MockJSType(JSTypeNative.STRING_TYPE);
        MockJSType b = new MockJSType(JSTypeNative.NUMBER_TYPE);
        MockJSType c = new MockJSType(JSTypeNative.BOOLEAN_TYPE);
        TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b);
        TypeValidator.TypeMismatch m2 = new TypeValidator.TypeMismatch(a, c);
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testGetMismatchesInitiallyEmpty() {
        assertNotNull(validator.getMismatches());
        assertTrue(validator.getMismatches().iterator().hasNext() == false);
    }

    @Test
    public void testSetShouldReportToFalse_NoReportOnMismatch() {
        validator.setShouldReport(false);
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesObjectContext(false);
        // Calling mismatch should not add to any report, but still record mismatch?
        // The private mismatch method calls registerMismatch which adds to mismatches regardless of shouldReport.
        // So mismatches should still be added.
        validator.expectObject(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(1, validator.getMismatches().size());
    }

    @Test
    public void testExpectBitwiseable_NumberContext_NoMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.NUMBER_TYPE);
        type.setMatchesNumberContext(true);
        validator.expectBitwiseable(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectBitwiseable_NotNumberContextButSubtypeOfAllValueTypes_NoMismatch() {
        // allValueTypes includes STRING_TYPE, NUMBER_TYPE, etc.
        // In our mock, isSubtype returns true for this case.
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesNumberContext(false);
        type.setSubtypeOfNullUndefined(true); // Simulate being subtype of something (allValueTypes)
        // But allValueTypes is specific; we need type.isSubtype(allValueTypes) to return true.
        // We'll set a flag for isSubtype to true.
        type = new MockJSType(JSTypeNative.STRING_TYPE) {
            @Override
            public boolean isSubtype(JSType type) {
                return true;
            }
        };
        type.setMatchesNumberContext(false);
        validator.expectBitwiseable(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(0, validator.getMismatches().size());
    }

    @Test
    public void testExpectBitwiseable_NotNumberContextNotSubtype_RecordsMismatch() {
        MockJSType type = new MockJSType(JSTypeNative.STRING_TYPE);
        type.setMatchesNumberContext(false);
        type.setCanAssignResult(false); // Not subtype
        type.setSubtypeOfNullUndefined(false);
        validator.expectBitwiseable(traversal, new MockNode(Token.NAME), type, "msg");
        assertEquals(1, validator.getMismatches().size());
    }
}