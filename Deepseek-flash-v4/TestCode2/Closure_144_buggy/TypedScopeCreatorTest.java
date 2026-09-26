package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TypedScopeCreatorTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
                // no-op
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
                // no-op
            }
        };
        registry = new JSTypeRegistry(errorReporter);
    }

    // ------------------- DiscoverEnums Tests -------------------

    @Test
    public void testDiscoverEnums_enumViaNameNode() {
        Node nameNode = new Node(Token.NAME, "MyEnum");
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(registry.createUnionType(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        nameNode.setJSDocInfo(info);
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TypedScopeCreator.DiscoverEnums discover = new TypedScopeCreator.DiscoverEnums(registry);
        NodeTraversal t = createDummyTraversal();
        discover.visit(t, nameNode, parent);

        assertNotNull("Enum name should be registered", registry.getType("MyEnum"));
    }

    @Test
    public void testDiscoverEnums_enumViaVarNode() {
        Node nameNode = new Node(Token.NAME, "MyEnum2");
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(registry.createUnionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        nameNode.setJSDocInfo(info);
        Node varNode = new Node(Token.VAR, nameNode);
        Node parent = new Node(Token.SCRIPT, varNode);

        TypedScopeCreator.DiscoverEnums discover = new TypedScopeCreator.DiscoverEnums(registry);
        NodeTraversal t = createDummyTraversal();
        discover.visit(t, varNode, parent);

        assertNotNull("Enum name should be registered", registry.getType("MyEnum2"));
    }

    @Test
    public void testDiscoverEnums_enumViaAssignNode() {
        Node nameNode = new Node(Token.NAME, "MyEnum3");
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(registry.createUnionType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)));
        nameNode.setJSDocInfo(info);
        Node assignNode = new Node(Token.ASSIGN, nameNode, Node.newString("value"));
        Node parent = new Node(Token.EXPR_RESULT, assignNode);

        TypedScopeCreator.DiscoverEnums discover = new TypedScopeCreator.DiscoverEnums(registry);
        NodeTraversal t = createDummyTraversal();
        discover.visit(t, assignNode, parent);

        assertNotNull("Enum name should be registered", registry.getType("MyEnum3"));
    }

    @Test
    public void testDiscoverEnums_noInfo() {
        Node nameNode = new Node(Token.NAME, "NonEnum");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TypedScopeCreator.DiscoverEnums discover = new TypedScopeCreator.DiscoverEnums(registry);
        NodeTraversal t = createDummyTraversal();
        discover.visit(t, nameNode, parent);

        assertNull("Non-enum name should not be registered", registry.getType("NonEnum"));
    }

    @Test
    public void testDiscoverEnums_infoWithoutEnumParam() {
        Node nameNode = new Node(Token.NAME, "NotEnum");
        JSDocInfo info = new JSDocInfo();
        info.setType(registry.createUnionType(registry.getNativeType(JSTypeNative.STRING_TYPE))); // type, not enum
        nameNode.setJSDocInfo(info);
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TypedScopeCreator.DiscoverEnums discover = new TypedScopeCreator.DiscoverEnums(registry);
        NodeTraversal t = createDummyTraversal();
        discover.visit(t, nameNode, parent);

        assertNull("Should not register non-enum", registry.getType("NotEnum"));
    }

    // ------------------- getPrototypePropertyOwner Tests -------------------

    @Test
    public void testGetPrototypePropertyOwner_getpropPrototype() {
        // foo.prototype.bar => owner "foo"
        Node owner = Node.newString("foo");
        Node prototype = new Node(Token.GETPROP, owner, Node.newString("prototype"));
        Node bar = new Node(Token.GETPROP, prototype, Node.newString("bar"));
        Node result = TypedScopeCreator.getPrototypePropertyOwner(bar);
        assertNotNull(result);
        assertEquals("foo", result.getString());
    }

    @Test
    public void testGetPrototypePropertyOwner_nonGetprop() {
        Node name = new Node(Token.NAME, "x");
        Node result = TypedScopeCreator.getPrototypePropertyOwner(name);
        assertNull(result);
    }

    @Test
    public void testGetPrototypePropertyOwner_noPrototype() {
        Node owner = Node.newString("foo");
        Node bar = new Node(Token.GETPROP, owner, Node.newString("bar"));
        Node result = TypedScopeCreator.getPrototypePropertyOwner(bar);
        assertNull(result);
    }

    // ------------------- createInitialScope Tests -------------------

    @Test
    public void testCreateInitialScope_containsNativeTypes() {
        AbstractCompiler compiler = createMinimalCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Node root = new Node(Token.SCRIPT);
        root.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Scope scope = creator.createInitialScope(root);

        assertNotNull("Scope should be created", scope);
        assertNotNull("Variable 'undefined' should be declared", scope.getVar("undefined"));
        assertNotNull("Variable 'goog.typedef' should be declared", scope.getVar("goog.typedef"));
        assertNotNull("Variable 'ActiveXObject' should be declared", scope.getVar("ActiveXObject"));
    }

    @Test
    public void testCreateInitialScope_rootNodeSet() {
        AbstractCompiler compiler = createMinimalCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Node root = new Node(Token.SCRIPT);
        root.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Scope scope = creator.createInitialScope(root);
        assertEquals("Root node should be the given script", root, scope.getRootNode());
    }

    // ------------------- Helper Methods -------------------

    private NodeTraversal createDummyTraversal() {
        return new NodeTraversal(new AbstractCompiler() {
            @Override
            public CompilerInput getInput(String sourceName) {
                return null;
            }

            @Override
            public JSTypeRegistry getTypeRegistry() {
                return null;
            }

            @Override
            public CodingConvention getCodingConvention() {
                return null;
            }

            @Override
            public TypeValidator getTypeValidator() {
                return null;
            }
        });
    }

    private AbstractCompiler createMinimalCompiler(final JSTypeRegistry reg) {
        return new AbstractCompiler() {
            @Override
            public CompilerInput getInput(String sourceName) {
                return new CompilerInput(new SourceFile(sourceName));
            }

            @Override
            public JSTypeRegistry getTypeRegistry() {
                return reg;
            }

            @Override
            public CodingConvention getCodingConvention() {
                return new DefaultCodingConvention();
            }

            @Override
            public TypeValidator getTypeValidator() {
                return new TypeValidator(this, reg);
            }
        };
    }
}