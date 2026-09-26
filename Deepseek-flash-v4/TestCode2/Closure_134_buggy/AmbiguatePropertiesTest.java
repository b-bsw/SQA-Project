package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.Map;

public class AmbiguatePropertiesTest {
    private Compiler compiler;
    private AmbiguateProperties ambiguate;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        char[] reserved = new char[]{'$'};
        ambiguate = new AmbiguateProperties(compiler, reserved);
    }

    @Test
    public void testProcessEmptyScripts() {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        ambiguate.process(externs, root);
        assertTrue(ambiguate.getRenamingMap().isEmpty());
    }

    @Test
    public void testPropertyRenamed() {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node getprop = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "obj");
        Node prop = Node.newString(Token.STRING, "myProp");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        root.addChildToBack(getprop);

        JSTypeRegistry reg = compiler.getTypeRegistry();
        JSType objType = reg.getNativeType(JSTypeNative.ARRAY_TYPE);
        obj.setJSType(objType);

        ambiguate.process(externs, root);
        Map<String, String> map = ambiguate.getRenamingMap();
        assertTrue(map.containsKey("myProp"));
        assertNotNull(map.get("myProp"));
        assertFalse("myProp".equals(prop.getString()));
    }

    @Test
    public void testExternPropertyNotRenamed() {
        Node externs = new Node(Token.SCRIPT);
        Node getpropEx = new Node(Token.GETPROP);
        Node objEx = Node.newString(Token.NAME, "obj");
        Node propEx = Node.newString(Token.STRING, "extProp");
        getpropEx.addChildToBack(objEx);
        getpropEx.addChildToBack(propEx);
        externs.addChildToBack(getpropEx);

        Node root = new Node(Token.SCRIPT);
        Node getpropRoot = new Node(Token.GETPROP);
        Node objRoot = Node.newString(Token.NAME, "obj2");
        Node propRoot = Node.newString(Token.STRING, "extProp");
        getpropRoot.addChildToBack(objRoot);
        getpropRoot.addChildToBack(propRoot);
        root.addChildToBack(getpropRoot);

        JSTypeRegistry reg = compiler.getTypeRegistry();
        JSType objType = reg.getNativeType(JSTypeNative.ARRAY_TYPE);
        objRoot.setJSType(objType);

        ambiguate.process(externs, root);
        assertFalse(ambiguate.getRenamingMap().containsKey("extProp"));
    }

    @Test
    public void testQuotedObjectLitNotRenamed() {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "quotedKey");
        keyNode.setQuotedString(true);
        Node valueNode = Node.newString(Token.NUMBER, "1");
        objLit.addChildToBack(keyNode);
        objLit.addChildToBack(valueNode);
        root.addChildToBack(objLit);

        ambiguate.process(externs, root);
        assertFalse(ambiguate.getRenamingMap().containsKey("quotedKey"));
    }

    @Test
    public void testInvalidatingTypeSkipped() {
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node getprop = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "obj");
        Node prop = Node.newString(Token.STRING, "skipProp");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        root.addChildToBack(getprop);

        JSTypeRegistry reg = compiler.getTypeRegistry();
        JSType invalidType = reg.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        obj.setJSType(invalidType);

        ambiguate.process(externs, root);
        assertFalse(ambiguate.getRenamingMap().containsKey("skipProp"));
    }
}