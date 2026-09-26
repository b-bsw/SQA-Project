package org.apache.commons.jxpath.ri.axes;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AttributeContextTest {

    private AttributeContext attributeContext;
    private MockParentContext parentContext;
    private NodeTest nodeTest;

    private static class MockNodePointer extends NodePointer {
        private MockNodeIterator iterator;

        MockNodePointer(MockNodeIterator iterator) {
            super(null);
            this.iterator = iterator;
        }

        @Override
        public NodeIterator attributeIterator(QName name) {
            return iterator;
        }

        @Override
        public boolean isLeaf() {
            return false;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public Object getBaseValue() {
            return null;
        }

        @Override
        public Object getImmediateNode() {
            return null;
        }

        @Override
        public void setValue(Object value) {
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Object getNodeValue() {
            return null;
        }

        @Override
        public NodePointer getImmediateValuePointer() {
            return null;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public String asPath() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean testNode(NodeTest test) {
            return false;
        }
    }

    private static class MockNodeIterator implements NodeIterator {
        private int maxPosition;
        private int currentPosition = 0;

        MockNodeIterator(int maxPosition) {
            this.maxPosition = maxPosition;
        }

        @Override
        public NodePointer getNodePointer() {
            return new MockNodePointer(this);
        }

        @Override
        public int getPosition() {
            return currentPosition;
        }

        @Override
        public boolean setPosition(int position) {
            if (position > maxPosition) {
                return false;
            }
            currentPosition = position;
            return true;
        }
    }

    private static class MockParentContext extends EvalContext {
        private NodePointer currentNodePointer;

        MockParentContext() {
            super(null);
        }

        MockParentContext(EvalContext parentContext) {
            super(parentContext);
        }

        void setCurrentNodePointer(NodePointer pointer) {
            this.currentNodePointer = pointer;
        }

        @Override
        public NodePointer getCurrentNodePointer() {
            return currentNodePointer;
        }

        @Override
        public boolean nextNode() {
            return false;
        }

        @Override
        public boolean setPosition(int position) {
            return false;
        }

        @Override
        public void reset() {
        }

        @Override
        public int getCurrentPosition() {
            return 0;
        }
    }

    @Before
    public void setUp() {
        parentContext = new MockParentContext();
        parentContext.setCurrentNodePointer(new MockNodePointer(new MockNodeIterator(0)));
        nodeTest = new NodeNameTest(new QName("attr"));
        attributeContext = new AttributeContext(parentContext, nodeTest);
    }

    @Test
    public void testNextNodeWithNonNodeNameTestReturnsFalse() {
        NodeTest nonNameTest = new NodeTest() {};
        AttributeContext context = new AttributeContext(parentContext, nonNameTest);
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNodeReturnsFalseWhenNoAttributes() {
        MockNodeIterator iterator = new MockNodeIterator(0);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext emptyParent = new MockParentContext();
        emptyParent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(emptyParent, new NodeNameTest(new QName("id")));
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNodeReturnsTrueForExistingAttribute() {
        MockNodeIterator iterator = new MockNodeIterator(1);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        assertTrue(context.nextNode());
        assertNotNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNodeReturnsFalseAfterExhaustion() {
        MockNodeIterator iterator = new MockNodeIterator(2);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        assertTrue(context.nextNode());
        assertTrue(context.nextNode());
        assertFalse(context.nextNode());
    }

    @Test
    public void testSetPositionForward() {
        MockNodeIterator iterator = new MockNodeIterator(3);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        assertTrue(context.setPosition(2));
    }

    @Test
    public void testSetPositionOutOfRangeReturnsFalse() {
        MockNodeIterator iterator = new MockNodeIterator(1);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        assertFalse(context.setPosition(5));
    }

    @Test
    public void testSetPositionLessThanCurrentResets() {
        MockNodeIterator iterator = new MockNodeIterator(3);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        context.setPosition(2);
        assertTrue(context.setPosition(1));
    }

    @Test
    public void testResetClearsStartedAndIterator() {
        MockNodeIterator iterator = new MockNodeIterator(1);
        MockNodePointer pointer = new MockNodePointer(iterator);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("id")));
        context.nextNode();
        context.reset();
        assertTrue(context.nextNode());
    }

    @Test
    public void testNextNodeReturnsFalseWhenIteratorIsNull() {
        MockNodePointer pointer = new MockNodePointer(null);
        MockParentContext parent = new MockParentContext();
        parent.setCurrentNodePointer(pointer);
        AttributeContext context = new AttributeContext(parent, new NodeNameTest(new QName("missing")));
        assertFalse(context.nextNode());
    }

    @Test
    public void testGetCurrentNodePointerInitiallyNull() {
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testConstructorStoresNodeTest() {
        NodeNameTest nameTest = new NodeNameTest(new QName("x"));
        AttributeContext context = new AttributeContext(parentContext, nameTest);
        assertNotNull(context);
    }
}