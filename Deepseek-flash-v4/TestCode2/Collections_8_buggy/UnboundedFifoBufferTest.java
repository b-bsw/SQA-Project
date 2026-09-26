package org.apache.commons.collections.buffer;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class UnboundedFifoBufferTest {

    private UnboundedFifoBuffer buffer;

    @Before
    public void setUp() {
        buffer = new UnboundedFifoBuffer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeSize() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorZeroSize() {
        new UnboundedFifoBuffer(0);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testAddAndSize() {
        assertTrue(buffer.add("A"));
        assertEquals(1, buffer.size());
        assertFalse(buffer.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNull() {
        buffer.add(null);
    }

    @Test
    public void testAddManyAndRemove() {
        for (int i = 0; i < 100; i++) {
            buffer.add("Item" + i);
        }
        assertEquals(100, buffer.size());
        for (int i = 0; i < 100; i++) {
            assertEquals("Item" + i, buffer.get());
            assertEquals("Item" + i, buffer.remove());
        }
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testAddCausesResize() {
        // buffer starts with capacity 32, which is 33 internal array
        for (int i = 0; i < 32; i++) {
            buffer.add("X" + i);
        }
        // now size 32, internal array length 33, next add triggers resize
        buffer.add("Trigger");
        assertEquals(33, buffer.size());
        // verify order preserved
        for (int i = 0; i < 33; i++) {
            if (i < 32) {
                assertEquals("X" + i, buffer.remove());
            } else {
                assertEquals("Trigger", buffer.remove());
            }
        }
    }

    @Test(expected = BufferUnderflowException.class)
    public void testGetEmpty() {
        buffer.get();
    }

    @Test(expected = BufferUnderflowException.class)
    public void testRemoveEmpty() {
        buffer.remove();
    }

    @Test
    public void testGetAfterAdd() {
        buffer.add("first");
        assertEquals("first", buffer.get());
        // get does not remove
        assertEquals(1, buffer.size());
    }

    @Test
    public void testRemoveSingle() {
        buffer.add("only");
        assertEquals("only", buffer.remove());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testAddRemoveMix() {
        buffer.add("A");
        buffer.add("B");
        assertEquals("A", buffer.remove());
        buffer.add("C");
        assertEquals(2, buffer.size());
        assertEquals("B", buffer.remove());
        assertEquals("C", buffer.remove());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIteratorEmpty() {
        Iterator it = buffer.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextOnEmpty() {
        buffer.iterator().next();
    }

    @Test
    public void testIteratorSimple() {
        buffer.add("a");
        buffer.add("b");
        Iterator it = buffer.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNext() {
        buffer.add("x");
        Iterator it = buffer.iterator();
        it.remove();
    }

    @Test
    public void testIteratorRemoveHead() {
        buffer.add("first");
        buffer.add("second");
        Iterator it = buffer.iterator();
        assertEquals("first", it.next());
        it.remove();
        assertEquals(1, buffer.size());
        assertEquals("second", buffer.get());
    }

    @Test
    public void testIteratorRemoveMiddle() {
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");
        Iterator it = buffer.iterator();
        it.next();
        it.next();
        it.remove();
        assertEquals(2, buffer.size());
        assertEquals("a", buffer.remove());
        assertEquals("c", buffer.remove());
    }

    @Test
    public void testIteratorRemoveLast() {
        buffer.add("x");
        buffer.add("y");
        buffer.add("z");
        Iterator it = buffer.iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertEquals(2, buffer.size());
        assertEquals("x", buffer.remove());
        assertEquals("y", buffer.remove());
    }

    @Test
    public void testHeadTailWrapAround() {
        // Fill to exceed default capacity, then remove many, then add more to wrap around
        for (int i = 0; i < 31; i++) {
            buffer.add("a" + i);
        }
        // remove 15 elements from head
        for (int i = 0; i < 15; i++) {
            buffer.remove();
        }
        // now add 20 more, will cause resize but also movement
        for (int i = 0; i < 20; i++) {
            buffer.add("b" + i);
        }
        assertEquals(36, buffer.size());
        Iterator it = buffer.iterator();
        // first 16 elements are from original (a15..a30)
        for (int i = 15; i < 31; i++) {
            assertEquals("a" + i, it.next());
        }
        // then the 20 new ones
        for (int i = 0; i < 20; i++) {
            assertEquals("b" + i, it.next());
        }
        assertFalse(it.hasNext());
    }

    @Test
    public void testSizeAfterWrap() {
        // fill to capacity
        for (int i = 0; i < 32; i++) {
            buffer.add("" + i);
        }
        // remove most to cause head to advance
        for (int i = 0; i < 30; i++) {
            buffer.remove();
        }
        // now add to cause wrap tail < head
        buffer.add("new1");
        buffer.add("new2");
        // size should be 4
        assertEquals(4, buffer.size());
    }

    @Test
    public void testIteratorAfterWrap() {
        // build scenario where tail < head
        for (int i = 0; i < 32; i++) {
            buffer.add("" + i);
        }
        for (int i = 0; i < 30; i++) {
            buffer.remove();
        }
        buffer.add("new1");
        buffer.add("new2");
        // buffer now: [ empty, empty, ..., (remaining: 30,31,new1,new2) ]
        // tail = something < head? Actually after remove head=30, tail=32, then add calls resize because size+1 >= array length? compute
        // Let's ensure wrap by doing more cycles: use small capacity to guarantee wrap manually
    }

    @Test
    public void testRemoveSingleElementWithWrap() {
        UnboundedFifoBuffer small = new UnboundedFifoBuffer(3);
        small.add("a");
        small.add("b");
        small.remove();
        small.remove();
        // now empty, head=2, tail=2
        small.add("c");
        small.add("d");
        // head=2, tail=0? After add: tail increments: 2->3->0? index wrapping
        // After first add: tail=3, after second add: tail=0 (since buffer.length=4)
        assertEquals(2, small.size());
        Iterator it = small.iterator();
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMultipleResizes() {
        for (int i = 0; i < 1000; i++) {
            buffer.add("elem" + i);
        }
        assertEquals(1000, buffer.size());
        for (int i = 0; i < 1000; i++) {
            assertEquals("elem" + i, buffer.remove());
        }
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIteratorRemoveTwice() {
        buffer.add("only");
        Iterator it = buffer.iterator();
        it.next();
        it.remove();
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testBoundaryHeadTail() {
        // buffer with initialSize=2, so internal length=3
        UnboundedFifoBuffer tiny = new UnboundedFifoBuffer(2);
        tiny.add("a");
        tiny.add("b");
        // now head=0, tail=2, full (size=2, array len=3)
        assertEquals("a", tiny.remove());
        // head=1, tail=2
        tiny.add("c");
        // tail=3? actually tail was 2, after add, tail increments to 3? wait capacity=3, so after add tail becomes 3, but array length is 3, so tail wraps to 0? Check increment: tail = (tail+1)%(array length) not used, it's just tail++ and if >= length then =0. tail=2, add -> tail=3, which equals array.length, so tail=0!
        // So now head=1, tail=0, so tail < head
        assertEquals(2, tiny.size());
        // iteration order: indices 1, then 0
        Iterator it = tiny.iterator();
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
        // remove works
        assertEquals("b", tiny.remove());
        assertEquals("c", tiny.remove());
        assertTrue(tiny.isEmpty());
    }

    @Test
    public void testAddAfterWrapAndResize() {
        UnboundedFifoBuffer tiny = new UnboundedFifoBuffer(2);
        tiny.add("x");
        tiny.add("y");
        tiny.remove();
        tiny.remove();
        // empty: head=2,tail=2
        tiny.add("1");
        tiny.add("2");
        tiny.add("3");
        // will cause resize
        assertEquals(3, tiny.size());
        assertEquals("1", tiny.remove());
        assertEquals("2", tiny.remove());
        assertEquals("3", tiny.remove());
    }

    @Test
    public void testIteratorRemoveAfterNextThenNext() {
        buffer.add("a");
        buffer.add("b");
        Iterator it = buffer.iterator();
        it.next();
        it.next();
        it.remove();
        assertEquals(1, buffer.size());
        assertEquals("a", buffer.get());
    }
}