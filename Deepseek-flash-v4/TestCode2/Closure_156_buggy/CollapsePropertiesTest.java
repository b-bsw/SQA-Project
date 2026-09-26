package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;

public class CollapsePropertiesTest {
    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testProcessSimpleObjectLiteral() {
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "b");
        Node value = Node.newNumber(1);
        key.addChildToFront(value);
        objLit.addChildToBack(key);
        varNode.getFirstChild().addChildToFront(objLit);
        root.addChildToBack(varNode);
        Node externs = new Node(Token.BLOCK);

        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(externs, root);
        assertTrue("Expected no warnings", compiler.getWarnings().isEmpty());
    }

    @Test
    public void testInlineAliases() {
        Node root = new Node(Token.BLOCK);
        Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node objLit = new Node(Token.OBJECTLIT);
        var1.getFirstChild().addChildToFront(objLit);
        root.addChildToBack(var1);
        Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node nameRef = Node.newString(Token.NAME, "a");
        var2.getFirstChild().addChildToFront(nameRef);
        root.addChildToBack(var2);
        Node externs = new Node(Token.BLOCK);

        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        cp.process(externs, root);
    }

    @Test
    public void testNamespaceAliasingWarning() {
        Node root = new Node(Token.BLOCK);
        Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node objLit = new Node(Token.OBJECTLIT);
        var1.getFirstChild().addChildToFront(objLit);
        root.addChildToBack(var1);
        Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node nameRef = Node.newString(Token.NAME, "a");
        var2.getFirstChild().addChildToFront(nameRef);
        root.addChildToBack(var2);
        Node externs = new Node(Token.BLOCK);

        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(externs, root);
        List<JSError> warnings = compiler.getWarnings();
        assertFalse("Expected namespace aliasing warning", warnings.isEmpty());
        assertEquals(CollapseProperties.UNSAFE_NAMESPACE_WARNING, warnings.get(0).getType());
    }

    @Test(expected = NullPointerException.class)
    public void testProcessNullRoot() {
        Node externs = new Node(Token.BLOCK);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(externs, null);
    }

    @Test
    public void testCollapsePropertiesOnExternTypesTrue() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "x")));
        Node externs = new Node(Token.BLOCK);
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        cp.process(externs, root);
    }
}