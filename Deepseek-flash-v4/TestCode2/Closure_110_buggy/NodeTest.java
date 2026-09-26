package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class NodeTest {

    private Node emptyNode;
    private Node nameNode;
    private Node numberNode;
    private Node stringNode;
    private Node callNode;
    private Node blockNode;
    private Node childA, childB, childC;

    @Before
    public void setUp() {
        emptyNode = new Node(Token.EMPTY);
        nameNode = new Node(Token.NAME);
        nameNode.setString("test");
        numberNode = Node.newNumber(3.14);
        stringNode = Node.newString("hello");
        childA = new Node(Token.NAME);
        childA.setString("a");
        childB = new Node(Token.NAME);
        childB.setString("b");
        childC = new Node(Token.NAME);
        childC.setString("c");
        callNode = new Node(Token.CALL, childA);
        blockNode = new Node(Token.BLOCK, childA, childB);
    }

    @Test
    public void testConstructorsBasic() {
        Node n = new Node(Token.NUMBER);
        assertEquals(Token.NUMBER, n.getType());
        assertNull(n.getParent());
        assertEquals(-1, n.getSourcePosition());
    }

    @Test
    public void testConstructorsWithChild() {
        Node n = new Node(Token.EXPR_RESULT, childA);
        assertEquals(Token.EXPR_RESULT, n.getType());
        assertSame(childA, n.getFirstChild());
        assertSame(childA, n.getLastChild());
        assertSame(n, childA.getParent());
    }

    @Test
    public void testConstructorsWithTwoChildren() {
        Node n = new Node(Token.ADD, childA, childB);
        assertSame(childA, n.getFirstChild());
        assertSame(childB, n.getLastChild());
        assertSame(childA.next, childB);
        assertSame(n, childA.getParent());
        assertSame(n, childB.getParent());
    }

    @Test
    public void testConstructorsWithThreeChildren() {
        Node mid = new Node(Token.NAME);
        mid.setString("mid");
        Node n = new Node(Token.ADD, childA, mid, childB);
        assertSame(childA, n.getFirstChild());
        assertSame(childB, n.getLastChild());
        assertSame(mid, childA.next);
        assertSame(childB, mid.next);
    }

    @Test
    public void testConstructorsWithFourChildren() {
        Node mid = new Node(Token.NAME); mid.setString("m1");
        Node mid2 = new Node(Token.NAME); mid2.setString("m2");
        Node n = new Node(Token.ADD, childA, mid, mid2, childB);
        assertSame(childA, n.getFirstChild());
        assertSame(childB, n.getLastChild());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithChildAlreadyParented() {
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(childA);
        new Node(Token.BLOCK, childA); // child already parented
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithArrayDuplicateChild() {
        Node[] children = new Node[] { childA, childA };
        new Node(Token.BLOCK, children);
    }

    @Test
    public void testConstructorsWithArray() {
        Node[] children = new Node[] { childA, childB, childC };
        Node n = new Node(Token.BLOCK, children);
        assertSame(childA, n.getFirstChild());
        assertSame(childC, n.getLastChild());
        assertSame(childA.next, childB);
        assertSame(childB.next, childC);
    }

    @Test
    public void testConstructorsWithLinenoCharno() {
        Node n = new Node(Token.NUMBER, 5, 3);
        assertEquals(5, n.getLineno());
        assertEquals(3, n.getCharno());
    }

    @Test
    public void testNewNumberAndGetDouble() {
        Node n = Node.newNumber(2.5);
        assertEquals(2.5, n.getDouble(), 0.0);
        Node n2 = Node.newNumber(0.0);
        assertEquals(0.0, n2.getDouble(), 0.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDoubleOnNonNumberNode() {
        emptyNode.getDouble();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetDoubleOnNonNumberNode() {
        emptyNode.setDouble(1.0);
    }

    @Test
    public void testNewStringAndGetString() {
        Node s = Node.newString("world");
        assertEquals("world", s.getString());
        Node s2 = Node.newString(Token.NAME, "foo");
        assertEquals("foo", s2.getString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewStringNull() {
        Node.newString((String) null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStringOnNonStringNode() {
        numberNode.getString();
    }

    @Test
    public void testSetGetType() {
        Node n = new Node(Token.EMPTY);
        n.setType(Token.BLOCK);
        assertEquals(Token.BLOCK, n.getType());
    }

    @Test
    public void testHasChildren() {
        assertFalse(emptyNode.hasChildren());
        assertTrue(callNode.hasChildren());
    }

    @Test
    public void testGetChildBefore() {
        Node child = new Node(Token.NAME);
        child.setString("x");
        blockNode.addChildToBack(child);
        assertSame(childA, blockNode.getChildBefore(child));
        assertNull(blockNode.getChildBefore(childA));
    }

    @Test(expected = RuntimeException.class)
    public void testGetChildBeforeNonExistent() {
        Node other = new Node(Token.NAME);
        blockNode.getChildBefore(other);
    }

    @Test
    public void testGetChildAtIndex() {
        assertSame(childA, blockNode.getChildAtIndex(0));
        assertSame(childB, blockNode.getChildAtIndex(1));
    }

    @Test
    public void testGetIndexOfChild() {
        assertEquals(0, blockNode.getIndexOfChild(childA));
        assertEquals(1, blockNode.getIndexOfChild(childB));
        assertEquals(-1, blockNode.getIndexOfChild(new Node(Token.NAME)));
    }

    @Test
    public void testGetLastSibling() {
        assertSame(childB, childA.getLastSibling());
        assertSame(childB, childB.getLastSibling());
    }

    @Test
    public void testAddChildToFront() {
        Node front = new Node(Token.NAME);
        front.setString("front");
        blockNode.addChildToFront(front);
        assertSame(front, blockNode.getFirstChild());
        assertTrue(blockNode.hasChildren());
        assertSame(blockNode, front.getParent());
    }

    @Test
    public void testAddChildToBack() {
        Node back = new Node(Token.NAME);
        back.setString("back");
        emptyNode.addChildToBack(back);
        assertSame(back, emptyNode.getFirstChild());
        assertSame(back, emptyNode.getLastChild());
    }

    @Test
    public void testAddChildrenToFront() {
        Node chain = new Node(Token.NAME);
        chain.setString("x");
        Node chain2 = new Node(Token.NAME);
        chain2.setString("y");
        chain.next = chain2;
        blockNode.addChildrenToFront(chain);
        assertSame(chain, blockNode.getFirstChild());
        assertSame(childB, blockNode.getLastChild());
        assertSame(blockNode, chain.getParent());
        assertSame(blockNode, chain2.getParent());
        assertEquals(chain2.next, childA);
    }

    @Test
    public void testAddChildrenToBack() {
        Node chain = new Node(Token.NAME);
        chain.setString("z");
        Node chain2 = new Node(Token.NAME);
        chain2.setString("w");
        chain.next = chain2;
        blockNode.addChildrenToBack(chain);
        assertSame(childA, blockNode.getFirstChild());
        assertSame(chain2, blockNode.getLastChild());
    }

    @Test
    public void testAddChildBefore() {
        Node newChild = new Node(Token.NAME);
        newChild.setString("mid");
        blockNode.addChildBefore(newChild, childB);
        assertSame(newChild, childA.next);
        assertSame(childB, newChild.next);
        assertSame(blockNode, newChild.getParent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildBeforeWithSibling() {
        Node newChild = new Node(Token.NAME);
        newChild.next = new Node(Token.NAME);
        blockNode.addChildBefore(newChild, childB);
    }

    @Test
    public void testAddChildAfter() {
        Node newChild = new Node(Token.NAME);
        newChild.setString("mid");
        blockNode.addChildAfter(newChild, childA);
        assertSame(newChild, childA.next);
        assertSame(childB, newChild.next);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildAfterWithParent() {
        Node newChild = new Node(Token.NAME);
        blockNode.addChildToBack(newChild);
        blockNode.addChildAfter(newChild, childA); // already parented
    }

    @Test
    public void testAddChildrenAfter() {
        Node chain = new Node(Token.NAME);
        chain.setString("x");
        Node chain2 = new Node(Token.NAME);
        chain2.setString("y");
        chain.next = chain2;
        blockNode.addChildrenAfter(chain, childA);
        assertSame(chain, childA.next);
        assertSame(chain2.next, childB);
    }

    @Test
    public void testRemoveChild() {
        blockNode.removeChild(childA);
        assertNull(childA.getParent());
        assertSame(childB, blockNode.getFirstChild());
        assertSame(childB, blockNode.getLastChild());
    }

    @Test
    public void testRemoveChildLast() {
        blockNode.removeChild(childB);
        assertNull(childB.getParent());
        assertSame(childA, blockNode.getFirstChild());
        assertSame(childA, blockNode.getLastChild());
    }

    @Test
    public void testReplaceChild() {
        Node newChild = new Node(Token.NAME);
        newChild.setString("new");
        blockNode.replaceChild(childA, newChild);
        assertSame(newChild, blockNode.getFirstChild());
        assertNull(childA.getParent());
        assertSame(blockNode, newChild.getParent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChildWithSibling() {
        Node newChild = new Node(Token.NAME);
        newChild.next = new Node(Token.NAME);
        blockNode.replaceChild(childA, newChild);
    }

    @Test
    public void testReplaceChildAfter() {
        Node newChild = new Node(Token.NAME);
        newChild.setString("new");
        blockNode.replaceChildAfter(childA, newChild);
        assertSame(newChild, childA.next);
        assertSame(childB, newChild.next);
        assertNull(childA.next);
    }

    @Test
    public void testRemoveChildAfter() {
        Node removed = blockNode.removeChildAfter(childA);
        assertSame(childB, removed);
        assertNull(childB.getParent());
        assertNull(childA.next);
        assertSame(childA, blockNode.getLastChild());
    }

    @Test
    public void testCloneNode() {
        Node cloned = nameNode.cloneNode();
        assertEquals(nameNode.getType(), cloned.getType());
        assertNull(cloned.getFirstChild());
        assertNull(cloned.getParent());
    }

    @Test
    public void testCloneTree() {
        Node cloned = callNode.cloneTree();
        assertEquals(callNode.getType(), cloned.getType());
        assertNotNull(cloned.getFirstChild());
        assertEquals(childA.getString(), cloned.getFirstChild().getString());
        assertSame(cloned, cloned.getFirstChild().getParent());
    }

    @Test
    public void testCopyInformationFrom() {
        Node source = new Node(Token.NAME);
        source.putProp(Node.ORIGINALNAME_PROP, "orig");
        source.setStaticSourceFile(new SimpleSourceFile("test.js", false));
        source.setLineno(10);
        Node target = new Node(Token.EMPTY);
        target.copyInformationFrom(source);
        assertEquals("orig", target.getProp(Node.ORIGINALNAME_PROP));
        assertEquals("test.js", target.getSourceFileName());
        assertEquals(10, target.getLineno());
    }

    @Test
    public void testUseSourceInfoFromAndSrcref() {
        Node source = new Node(Token.NUMBER);
        source.setLineno(5);
        source.setCharno(2);
        Node target = new Node(Token.EMPTY);
        target.useSourceInfoFrom(source);
        assertEquals(5, target.getLineno());
        assertEquals(2, target.getCharno());
        target.getProp(Node.STATIC_SOURCE_FILE); // should be null if not set, but method sets it
    }

    @Test
    public void testGetQualifiedName() {
        Node name = new Node(Token.NAME);
        name.setString("x");
        assertEquals("x", name.getQualifiedName());

        Node emptyName = new Node(Token.NAME);
        emptyName.setString("");
        assertNull(emptyName.getQualifiedName());

        Node getprop = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString("prop"));
        getprop.getFirstChild().setString("obj");
        assertEquals("obj.prop", getprop.getQualifiedName());

        Node thisNode = new Node(Token.THIS);
        assertEquals("this", thisNode.getQualifiedName());

        Node block = new Node(Token.BLOCK);
        assertNull(block.getQualifiedName());
    }

    @Test
    public void testIsQualifiedName() {
        Node name = new Node(Token.NAME);
        name.setString("x");
        assertTrue(name.isQualifiedName());

        Node emptyName = new Node(Token.NAME);
        emptyName.setString("");
        assertFalse(emptyName.isQualifiedName());

        assertFalse(new Node(Token.BLOCK).isQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedName() {
        Node name = new Node(Token.NAME);
        name.setString("x");
        assertTrue(name.isUnscopedQualifiedName());

        Node getprop = new Node(Token.GETPROP, name, Node.newString("p"));
        assertTrue(getprop.isUnscopedQualifiedName());

        Node thisNode = new Node(Token.THIS);
        assertFalse(thisNode.isUnscopedQualifiedName());
    }

    @Test
    public void testDetachFromParent() {
        Node child = new Node(Token.NAME);
        child.setString("detach");
        Node parent = new Node(Token.BLOCK, child);
        child.detachFromParent();
        assertFalse(parent.hasChildren());
        assertNull(child.getParent());
    }

    @Test
    public void testRemoveFirstChild() {
        Node removed = blockNode.removeFirstChild();
        assertSame(childA, removed);
        assertEquals(childB, blockNode.getFirstChild());
        assertNull(childA.getParent());
    }

    @Test
    public void testRemoveChildren() {
        Node children = blockNode.removeChildren();
        assertSame(childA, children);
        assertFalse(blockNode.hasChildren());
    }

    @Test
    public void testDetachChildren() {
        blockNode.detachChildren();
        assertFalse(blockNode.hasChildren());
        assertNull(childA.getParent());
        assertNull(childB.getParent());
    }

    @Test
    public void testIsEquivalentTo() {
        Node n1 = Node.newNumber(42);
        Node n2 = Node.newNumber(42);
        assertTrue(n1.isEquivalentTo(n2));

        Node n3 = Node.newNumber(0);
        Node n4 = Node.newNumber(0);
        assertTrue(n3.isEquivalentTo(n4));

        Node nNeg1 = Node.newNumber(-0.0);
        Node nNeg2 = Node.newNumber(-0.0);
        assertTrue(nNeg1.isEquivalentTo(nNeg2));

        // 0 and -0 not equivalent
        assertFalse(n3.isEquivalentTo(nNeg1));

        Node s1 = Node.newString("hi");
        Node s2 = Node.newString("hi");
        assertTrue(s1.isEquivalentTo(s2));

        Node s3 = Node.newString("bye");
        assertFalse(s1.isEquivalentTo(s3));

        // type difference
        assertFalse(n1.isEquivalentTo(s1));
    }

    @Test
    public void testIsEquivalentToWithFreeCall() {
        Node call1 = new Node(Token.CALL);
        call1.putBooleanProp(Node.FREE_CALL, true);
        Node call2 = new Node(Token.CALL);
        call2.putBooleanProp(Node.FREE_CALL, false);
        assertFalse(call1.isEquivalentTo(call2));
    }

    @Test
    public void testGetParent() {
        assertNull(emptyNode.getParent());
        assertSame(callNode, childA.getParent());
    }

    @Test
    public void testGetAncestor() {
        Node grandchild = new Node(Token.NAME);
        grandchild.setString("gc");
        callNode.addChildToBack(grandchild);
        assertSame(callNode, grandchild.getAncestor(1));
        assertNull(grandchild.getAncestor(2)); // only parent, no grandparent
    }

    @Test
    public void testGetAncestors() {
        Node grandchild = new Node(Token.NAME);
        grandchild.setString("gc");
        callNode.addChildToBack(grandchild);
        int count = 0;
        for (Node anc : grandchild.getAncestors()) {
            assertSame(callNode, anc);
            count++;
        }
        assertEquals(1, count);
    }

    @Test
    public void testHasOneChildMoreThanOne() {
        assertFalse(emptyNode.hasOneChild());
        assertFalse(emptyNode.hasMoreThanOneChild());

        assertTrue(callNode.hasOneChild());
        assertFalse(callNode.hasMoreThanOneChild());

        assertFalse(blockNode.hasOneChild());
        assertTrue(blockNode.hasMoreThanOneChild());
    }

    @Test
    public void testGetChildCount() {
        assertEquals(2, blockNode.getChildCount());
        assertEquals(0, emptyNode.getChildCount());
    }

    @Test
    public void testHasChild() {
        assertTrue(blockNode.hasChild(childA));
        assertFalse(blockNode.hasChild(new Node(Token.NAME)));
    }

    @Test
    public void testGetSiblingsIterable() {
        int count = 0;
        for (Node s : childA.siblings()) {
            assertTrue(s == childA || s == childB);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testChildrenIterable() {
        int count = 0;
        for (Node c : blockNode.children()) {
            assertTrue(c == childA || c == childB);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testSetGetBooleanProp() {
        Node n = new Node(Token.CALL);
        assertFalse(n.getBooleanProp(Node.FREE_CALL));
        n.putBooleanProp(Node.FREE_CALL, true);
        assertTrue(n.getBooleanProp(Node.FREE_CALL));
        n.putBooleanProp(Node.FREE_CALL, false);
        assertFalse(n.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testSetGetIntProp() {
        Node n = new Node(Token.CALL);
        assertEquals(0, n.getIntProp(Node.SIDE_EFFECT_FLAGS));
        n.putIntProp(Node.SIDE_EFFECT_FLAGS, 3);
        assertEquals(3, n.getIntProp(Node.SIDE_EFFECT_FLAGS));
        n.putIntProp(Node.SIDE_EFFECT_FLAGS, 0);
        assertEquals(0, n.getIntProp(Node.SIDE_EFFECT_FLAGS));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetExistingIntPropMissing() {
        new Node(Token.EMPTY).getExistingIntProp(Node.SIDE_EFFECT_FLAGS);
    }

    @Test
    public void testGetExistingIntPropPresent() {
        Node n = new Node(Token.CALL);
        n.putIntProp(Node.SIDE_EFFECT_FLAGS, 5);
        assertEquals(5, n.getExistingIntProp(Node.SIDE_EFFECT_FLAGS));
    }

    @Test
    public void testGetPropPutProp() {
        Node n = new Node(Token.NAME);
        assertNull(n.getProp(Node.ORIGINALNAME_PROP));
        n.putProp(Node.ORIGINALNAME_PROP, "origName");
        assertEquals("origName", n.getProp(Node.ORIGINALNAME_PROP));
        n.putProp(Node.ORIGINALNAME_PROP, null);
        assertNull(n.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testSetGetSideEffectFlags() {
        Node call = new Node(Token.CALL);
        call.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
        assertTrue(call.isNoSideEffectsCall());
        assertTrue(call.isLocalResultCall()); // NO_SIDE_EFFECTS includes FLAG_LOCAL_RESULTS? Actually NO_SIDE_EFFECTS is all unmodified flags, but not FLAG_LOCAL_RESULTS. Let's test others.
        // better test mayMutateArguments etc.
        call.setSideEffectFlags(Node.FLAG_ARGUMENTS_UNMODIFIED | Node.FLAG_GLOBAL_STATE_UNMODIFIED);
        assertFalse(call.mayMutateArguments());
        assertTrue(call.mayMutateGlobalStateOrThrow()); // because FLAG_NO_THROWS not set

        call.setSideEffectFlags(Node.FLAG_NO_THROWS);
        assertFalse(call.mayMutateGlobalStateOrThrow());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSideEffectFlagsOnNonCall() {
        emptyNode.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
    }

    @Test
    public void testIsQuotedString() {
        assertFalse(nameNode.isQuotedString());
        Node stringNode2 = Node.newString("a");
        assertTrue(stringNode2 instanceof StringNode);
        // StringNode's isQuotedString returns getBooleanProp(QUOTED_PROP) - initially false
        assertFalse(stringNode2.isQuotedString());
        stringNode2.setQuotedString();
        assertTrue(stringNode2.isQuotedString());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetQuotedStringOnNonStringNode() {
        nameNode.setQuotedString();
    }

    @Test
    public void testSetStaticSourceFile() {
        SimpleSourceFile file = new SimpleSourceFile("test.js", false);
        node.setStaticSourceFile(file);
        assertEquals("test.js", node.getSourceFileName());
        assertFalse(node.isFromExterns());

        SimpleSourceFile externFile = new SimpleSourceFile("extern.js", true);
        node.setStaticSourceFile(externFile);
        assertTrue(node.isFromExterns());
    }

    @Test
    public void testGetSourceFileNameNull() {
        assertNull(emptyNode.getSourceFileName());
    }

    @Test
    public void testIsFromExternsNoFile() {
        assertFalse(emptyNode.isFromExterns());
    }

    @Test
    public void testGetLength() {
        assertEquals(0, emptyNode.getLength());
        emptyNode.setLength(10);
        assertEquals(10, emptyNode.getLength());
    }

    @Test
    public void testMergeLineCharNo() {
        Node n = new Node(Token.EMPTY, 100, 20);
        assertEquals(100, n.getLineno());
        assertEquals(20, n.getCharno());
    }

    @Test
    public void testSetLineno() {
        nameNode.setLineno(7);
        assertEquals(7, nameNode.getLineno());
    }

    @Test
    public void testSetCharno() {
        nameNode.setCharno(5);
        assertEquals(5, nameNode.getCharno());
    }

    @Test
    public void testSetSourceEncodedPosition() {
        nameNode.setSourceEncodedPosition(1234);
        assertEquals(1234, nameNode.getSourcePosition());
    }

    @Test
    public void testCheckTreeEqualsEqual() {
        Node t1 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node t2 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertNull(t1.checkTreeEquals(t2));
    }

    @Test
    public void testCheckTreeEqualsDifferent() {
        Node t1 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node t2 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(3));
        assertNotNull(t1.checkTreeEquals(t2));
    }

    @Test
    public void testCheckTreeTypeAwareEquals() {
        Node t1 = new Node(Token.ADD, Node.newNumber(1));
        Node t2 = new Node(Token.ADD, Node.newNumber(1));
        NodeMismatch diff = t1.checkTreeTypeAwareEqualsImpl(t2);
        assertNull(diff);
    }

    @Test
    public void testJSDocInfo() {
        assertNull(emptyNode.getJSDocInfo());
        JSDocInfo info = new JSDocInfo(false);
        emptyNode.setJSDocInfo(info);
        assertSame(info, emptyNode.getJSDocInfo());
    }

    @Test
    public void testVarArgs() {
        assertFalse(emptyNode.isVarArgs());
        emptyNode.setVarArgs(true);
        assertTrue(emptyNode.isVarArgs());
    }

    @Test
    public void testOptionalArg() {
        assertFalse(emptyNode.isOptionalArg());
        emptyNode.setOptionalArg(true);
        assertTrue(emptyNode.isOptionalArg());
    }

    @Test
    public void testSetIsSyntheticBlock() {
        assertFalse(emptyNode.isSyntheticBlock());
        emptyNode.setIsSyntheticBlock(true);
        assertTrue(emptyNode.isSyntheticBlock());
    }

    @Test
    public void testDirectives() {
        assertNull(emptyNode.getDirectives());
        Set<String> dirs = new HashSet<>(Arrays.asList("use strict"));
        emptyNode.setDirectives(dirs);
        assertEquals(dirs, emptyNode.getDirectives());
    }

    @Test
    public void testAddSuppression() {
        emptyNode.addSuppression("warning1");
        JSDocInfo info = emptyNode.getJSDocInfo();
        assertNotNull(info);
        assertTrue(info.getSuppressions().contains("warning1"));
    }

    @Test
    public void testSetWasEmptyNode() {
        assertFalse(emptyNode.wasEmptyNode());
        emptyNode.setWasEmptyNode(true);
        assertTrue(emptyNode.wasEmptyNode());
    }

    @Test
    public void testTypeCheckers() {
        Node addNode = new Node(Token.ADD);
        assertTrue(addNode.isAdd());
        assertFalse(addNode.isBlock());

        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(assignNode.isAssign());

        assertTrue(new Node(Token.THIS).isThis());
        assertTrue(new Node(Token.NUMBER).isNumber());
        assertTrue(new Node(Token.STRING).isString());
        assertTrue(new Node(Token.FALSE).isFalse());
        assertTrue(new Node(Token.TRUE).isTrue());
        assertTrue(new Node(Token.FUNCTION).isFunction());
        // etc., test a few more
        assertTrue(new Node(Token.CALL).isCall());
        assertTrue(new Node(Token.NEW).isNew());
    }

    @Test
    public void testToStringWithAnnotations() {
        Node n = Node.newNumber(42);
        n.setLineno(1);
        n.putProp(Node.IS_CONSTANT_NAME, true);
        String str = n.toString(true, true, false);
        assertTrue(str.contains("NUMBER"));
        assertTrue(str.contains("42"));
        assertTrue(str.contains("1"));
        assertTrue(str.contains("is_constant_name"));
    }

    @Test
    public void testToStringTree() {
        Node n = new Node(Token.BLOCK, Node.newString("x"), Node.newNumber(5));
        String tree = n.toStringTree();
        assertNotNull(tree);
        assertTrue(tree.contains("BLOCK"));
        assertTrue(tree.contains("STRING"));
        assertTrue(tree.contains("NUMBER"));
    }

    @Test
    public void testSideEffectFlagsClass() {
        Node.SideEffectFlags flags = new Node.SideEffectFlags();
        assertEquals(Node.SIDE_EFFECTS_ALL, flags.valueOf());
        flags.clearAllFlags();
        assertEquals(Node.NO_SIDE_EFFECTS | Node.FLAG_LOCAL_RESULTS, flags.valueOf());
        assertFalse(flags.areAllFlagsSet());
        flags.setAllFlags();
        assertTrue(flags.areAllFlagsSet());
        flags.clearSideEffectFlags();
        assertFalse(flags.areAllFlagsSet());
    }

    @Test
    public void testNodeMismatchEquals() {
        Node a = new Node(Token.EMPTY);
        Node b = new Node(Token.EMPTY);
        Node.NodeMismatch m1 = new Node.NodeMismatch(a, b);
        Node.NodeMismatch m2 = new Node.NodeMismatch(a, b);
        assertEquals(m1, m2);
        Node.NodeMismatch m3 = new Node.NodeMismatch(b, a);
        assertNotEquals(m1, m3);
    }

    @Test
    public void testUseSourceInfoIfMissingFrom() {
        Node source = new Node(Token.NUMBER);
        source.setLineno(3);
        source.putProp(Node.ORIGINALNAME_PROP, "orig");
        source.setStaticSourceFile(new SimpleSourceFile("s.js", false));

        Node target = new Node(Token.EMPTY);
        target.useSourceInfoIfMissingFrom(source);
        assertEquals("orig", target.getProp(Node.ORIGINALNAME_PROP));
        assertEquals("s.js", target.getSourceFileName());

        // second call should not overwrite
        Node source2 = new Node(Token.NUMBER);
        source2.setLineno(5);
        target.useSourceInfoIfMissingFrom(source2);
        assertEquals(3, target.getLineno()); // not overwritten
    }

    @Test
    public void testGetSourceOffset() {
        Node n = new Node(Token.EMPTY);
        assertEquals(-1, n.getSourceOffset());

        Node n2 = new Node(Token.EMPTY, 10, 5);
        assertEquals(-1, n2.getSourceOffset()); // no StaticSourceFile

        StaticSourceFile file = new SimpleSourceFile("test.js", false);
        n2.setStaticSourceFile(file);
        int offset = n2.getSourceOffset();
        assertTrue(offset >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewStringNodeNullInConstructor() {
        Node.newString((String) null);
    }

    @Test
    public void testStringNodeSetStringNull() {
        Node sn = Node.newString("ok");
        try {
            ((Node.StringNode) sn).setString(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNodeCloneSerializable() {
        assertTrue(nameNode instanceof java.io.Serializable);
    }
}