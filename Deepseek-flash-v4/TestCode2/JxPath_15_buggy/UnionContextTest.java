package org.apache.commons.jxpath.ri.axes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnionContextTest {

    private TestEvalContext parentContext;
    private TestEvalContext singleContext;
    private TestEvalContext multiContext;

    @Before
    public void setUp() {
        parentContext = new TestEvalContext();
        singleContext = new TestEvalContext();
        multiContext = new TestEvalContext();
    }

    @Test
    public void testGetDocumentOrderWithSingleContext() {
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext});
        assertEquals(1, ctx.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrderWithMultipleContexts() {
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext, multiContext});
        assertEquals(1, ctx.getDocumentOrder());
    }

    @Test
    public void testSetPositionWithNullContexts() {
        UnionContext ctx = new UnionContext(parentContext, null);
        assertFalse(ctx.setPosition(1));
    }

    @Test(expected = NullPointerException.class)
    public void testSetPositionWithNullContextElement() {
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{null});
        ctx.setPosition(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPositionWithEmptyContexts() {
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[0]);
        ctx.setPosition(1);
    }

    @Test
    public void testSetPositionMergesPointersFromMultipleContexts() {
        singleContext.addPointer(new TestNodePointer("a"));
        singleContext.addPointer(new TestNodePointer("b"));
        multiContext.addPointer(new TestNodePointer("c"));

        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext, multiContext});
        assertTrue(ctx.setPosition(1));

        BasicNodeSet nodeSet = (BasicNodeSet) ctx.getNodeSet();
        assertEquals(3, nodeSet.size());
    }

    @Test
    public void testSetPositionRemovesDuplicates() {
        singleContext.addPointer(new TestNodePointer("a"));
        multiContext.addPointer(new TestNodePointer("a"));

        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext, multiContext});
        assertTrue(ctx.setPosition(1));

        BasicNodeSet nodeSet = (BasicNodeSet) ctx.getNodeSet();
        assertEquals(1, nodeSet.size());
    }

    @Test
    public void testSetPositionWithEmptyPointerLists() {
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext, multiContext});
        assertFalse(ctx.setPosition(1));
    }

    @Test
    public void testSetPositionCallsSuperSetPosition() {
        singleContext.addPointer(new TestNodePointer("a"));
        UnionContext ctx = new UnionContext(parentContext, new EvalContext[]{singleContext});
        assertTrue(ctx.setPosition(1));
    }

    private static class TestEvalContext extends EvalContext {
        private List pointers = new ArrayList();
        private int idx = -1;

        public TestEvalContext() {
            super(null, null);
        }

        public void addPointer(NodePointer ptr) {
            pointers.add(ptr);
        }

        public boolean nextSet() {
            return true;
        }

        public boolean nextNode() {
            idx++;
            return idx < pointers.size();
        }

        public NodePointer getCurrentNodePointer() {
            return (NodePointer) pointers.get(idx);
        }

        public int getDocumentOrder() {
            return 1;
        }

        public boolean setPosition(int position) {
            return position == 1 && idx >= 0;
        }
    }

    private static class TestNodePointer extends NodePointer {
        private String name;

        public TestNodePointer(String name) {
            super(null);
            this.name = name;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public int getLength() {
            return 1;
        }

        public Object getBaseValue() {
            return name;
        }

        public Object getImmediateNode() {
            return name;
        }

        public Object getValue() {
            return name;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TestNodePointer)) return false;
            return name.equals(((TestNodePointer) obj).name);
        }

        public int hashCode() {
            return name.hashCode();
        }

        public int getDocumentOrder() {
            return 1;
        }

        public String asPath() {
            return name;
        }
    }
}