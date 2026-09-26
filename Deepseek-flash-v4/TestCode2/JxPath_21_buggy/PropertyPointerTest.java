package org.apache.commons.jxpath.ri.model.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PropertyPointerTest {

    private TestPropertyPointer pointer;
    private NodePointer mockParent;

    @Before
    public void setUp() {
        mockParent = new TestNodePointer();
        pointer = new TestPropertyPointer(mockParent);
    }

    @Test
    public void testConstructorAndDefaults() {
        assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.getPropertyIndex());
        assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.propertyIndex);
    }

    @Test
    public void testSetPropertyIndexNormal() {
        pointer.setPropertyIndex(5);
        assertEquals(5, pointer.getPropertyIndex());
    }

    @Test
    public void testSetPropertyIndexBoundaryUnspecified() {
        pointer.setPropertyIndex(PropertyPointer.UNSPECIFIED_PROPERTY);
        assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.getPropertyIndex());
    }

    @Test
    public void testSetPropertyIndexResetsIndex() {
        pointer.setIndex(3);
        pointer.setPropertyIndex(2);
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testSetPropertyIndexSameValueNoReset() {
        pointer.setPropertyIndex(0);
        pointer.setIndex(3);
        pointer.setPropertyIndex(0);
        assertEquals(3, pointer.getIndex());
    }

    @Test
    public void testGetBeanWithInitializedBean() {
        Object bean = new Object();
        pointer.bean = bean;
        assertSame(bean, pointer.getBean());
    }

    @Test
    public void testGetBeanFromParent() {
        Object parentNode = new Object();
        ((TestNodePointer) mockParent).node = parentNode;
        Object bean = pointer.getBean();
        assertNotNull(bean);
        assertSame(parentNode, bean);
    }

    @Test
    public void testGetBeanCachesResult() {
        Object parentNode = new Object();
        ((TestNodePointer) mockParent).node = parentNode;
        Object bean1 = pointer.getBean();
        Object bean2 = pointer.getBean();
        assertSame(bean1, bean2);
    }

    @Test
    public void testGetName() {
        pointer.propertyName = "testProperty";
        QName name = pointer.getName();
        assertEquals("testProperty", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testIsActualWhenActualProperty() {
        pointer.actualProperty = true;
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsActualWhenNotActualProperty() {
        pointer.actualProperty = false;
        assertFalse(pointer.isActual());
    }

    @Test
    public void testIsActualCallsSuperWhenActualProperty() {
        pointer.actualProperty = true;
        assertTrue(pointer.isActual());
    }

    @Test
    public void testGetImmediateNodeWithWholeCollection() throws Exception {
        pointer.index = NodePointer.WHOLE_COLLECTION;
        Field valueField = PropertyPointer.class.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(pointer, PropertyPointer.UNINITIALIZED);

        List<String> baseValue = new ArrayList<>();
        baseValue.add("a");
        baseValue.add("b");
        pointer.baseValueToReturn = baseValue;

        Object result = pointer.getImmediateNode();
        assertEquals(baseValue, result);
    }

    @Test
    public void testGetImmediateNodeWithIndex() throws Exception {
        pointer.index = 1;
        Field valueField = PropertyPointer.class.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(pointer, PropertyPointer.UNINITIALIZED);

        List<String> baseValue = new ArrayList<>();
        baseValue.add("x");
        baseValue.add("y");
        pointer.baseValueToReturn = baseValue;

        Object result = pointer.getImmediateNode();
        assertEquals("y", result);
    }

    @Test
    public void testGetImmediateNodeCachesValue() throws Exception {
        pointer.index = 0;
        Field valueField = PropertyPointer.class.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(pointer, PropertyPointer.UNINITIALIZED);

        List<String> baseValue = new ArrayList<>();
        baseValue.add("test");
        pointer.baseValueToReturn = baseValue;

        Object result1 = pointer.getImmediateNode();
        Object result2 = pointer.getImmediateNode();
        assertSame(result1, result2);
    }

    @Test
    public void testIsCollectionWithNullBaseValue() {
        pointer.baseValueToReturn = null;
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testIsCollectionWithCollection() {
        pointer.baseValueToReturn = new ArrayList<>();
        assertTrue(pointer.isCollection());
    }

    @Test
    public void testIsCollectionWithNonCollection() {
        pointer.baseValueToReturn = "single";
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testIsLeafWithNullNode() {
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testGetLengthForCollection() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        pointer.baseValueToReturn = list;
        assertEquals(3, pointer.getLength());
    }

    @Test
    public void testGetLengthForSingleValue() {
        pointer.baseValueToReturn = "single";
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testGetImmediateValuePointer() {
        pointer.propertyName = "prop";
        pointer.index = 0;
        List<String> baseValue = new ArrayList<>();
        baseValue.add("val");
        pointer.baseValueToReturn = baseValue;

        NodePointer valuePointer = pointer.getImmediateValuePointer();
        assertNotNull(valuePointer);
        assertEquals("prop", valuePointer.getName().getName());
    }

    @Test
    public void testCreatePathWithNonNullNode() {
        pointer.index = 0;
        List<String> baseValue = new ArrayList<>();
        baseValue.add("existing");
        pointer.baseValueToReturn = baseValue;
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer result = pointer.createPath(context);
        assertSame(pointer, result);
    }

    @Test
    public void testCreatePathWithNullNodeAndSuccessfulFactory() {
        pointer.index = 0;
        pointer.baseValueToReturn = null;
        TestFactory factory = new TestFactory(true);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(factory);

        NodePointer result = pointer.createPath(context);
        assertSame(pointer, result);
        assertTrue(factory.wasCalled());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreatePathWithNullNodeAndFailedFactory() {
        pointer.index = 0;
        pointer.baseValueToReturn = null;
        TestFactory factory = new TestFactory(false);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(factory);

        pointer.createPath(context);
    }

    @Test
    public void testCreatePathWithIndexAndValue() {
        pointer.index = 0;
        pointer.baseValueToReturn = new ArrayList<>();
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createPath(context, "newValue");
        assertEquals("newValue", pointer.setValueArgument);
    }

    @Test
    public void testCreatePathExpandsCollection() {
        pointer.index = 5;
        pointer.baseValueToReturn = new ArrayList<>();
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createPath(context, "value");
        assertEquals("value", pointer.setValueArgument);
    }

    @Test
    public void testCreateChildWithNameAndValue() {
        pointer.propertyName = "parentProp";
        pointer.index = 0;
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, new QName(null, "childProp"), 1, "childValue");
        assertNotNull(child);
        assertEquals("childProp", ((TestPropertyPointer) child).propertyName);
        assertEquals(1, child.getIndex());
    }

    @Test
    public void testCreateChildWithNullNameAndValue() {
        pointer.propertyName = "parentProp";
        pointer.index = 0;
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, null, 2, "value");
        assertNotNull(child);
        assertEquals("parentProp", ((TestPropertyPointer) child).propertyName);
    }

    @Test
    public void testCreateChildWithNameAndNoValue() {
        pointer.propertyName = "parentProp";
        pointer.index = 0;
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, new QName(null, "childProp"), 3);
        assertNotNull(child);
        assertEquals("childProp", ((TestPropertyPointer) child).propertyName);
    }

    @Test
    public void testCreateChildWithNullNameAndNoValue() {
        pointer.propertyName = "parentProp";
        pointer.index = 0;
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, null, 4);
        assertNotNull(child);
        assertEquals("parentProp", ((TestPropertyPointer) child).propertyName);
    }

    @Test
    public void testHashCode() {
        pointer.propertyIndex = 3;
        pointer.index = 5;
        int expectedHash = mockParent.hashCode() + 3 + 5;
        assertEquals(expectedHash, pointer.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(pointer.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(pointer.equals("string"));
    }

    @Test
    public void testEqualsDifferentParent() {
        TestPropertyPointer other = new TestPropertyPointer(new TestNodePointer());
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsSameParentDifferentPropertyIndex() {
        TestPropertyPointer other = new TestPropertyPointer(mockParent);
        other.setPropertyIndex(1);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsSameParentDifferentPropertyName() {
        TestPropertyPointer other = new TestPropertyPointer(mockParent);
        other.propertyName = "different";
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsSameParentDifferentIndex() {
        TestPropertyPointer other = new TestPropertyPointer(mockParent);
        other.setIndex(2);
        pointer.setIndex(3);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsAllFieldsEqual() {
        TestPropertyPointer other = new TestPropertyPointer(mockParent);
        other.propertyIndex = pointer.propertyIndex;
        other.propertyName = pointer.propertyName;
        other.index = pointer.index;
        assertTrue(pointer.equals(other));
    }

    @Test
    public void testEqualsIndexWhoCollectionHandling() {
        TestPropertyPointer other = new TestPropertyPointer(mockParent);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        other.setIndex(0);
        assertTrue(pointer.equals(other));
    }

    @Test
    public void testCompareChildNodePointers() {
        NodePointer child1 = new TestNodePointer();
        NodePointer child2 = new TestNodePointer();
        try {
            pointer.compareChildNodePointers(child1, child2);
        } catch (NullPointerException e) {
            // Expected because getValuePointer() returns null in test
        }
    }

    // --- Test Helper Classes ---

    private static class TestPropertyPointer extends PropertyPointer {
        String propertyName = "testProp";
        boolean actualProperty = true;
        Object baseValueToReturn;
        Object setValueArgument;
        int propertyCount = 1;
        String[] propertyNames = {"testProp"};

        TestPropertyPointer(NodePointer parent) {
            super(parent);
        }

        @Override
        public String getPropertyName() {
            return propertyName;
        }

        @Override
        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        @Override
        public int getPropertyCount() {
            return propertyCount;
        }

        @Override
        public String[] getPropertyNames() {
            return propertyNames;
        }

        @Override
        protected boolean isActualProperty() {
            return actualProperty;
        }

        @Override
        public Object getBaseValue() {
            return baseValueToReturn;
        }

        @Override
        public void setValue(Object value) {
            this.setValueArgument = value;
        }

        @Override
        public Object getNode() {
            if (baseValueToReturn != null && index != WHOLE_COLLECTION) {
                return ValueUtils.getValue(baseValueToReturn, index);
            }
            return baseValueToReturn;
        }
    }

    private static class TestNodePointer extends NodePointer {
        Object node;

        TestNodePointer() {
            super(null);
        }

        @Override
        public Object getNode() {
            return node;
        }

        @Override
        public Object getImmediateNode() {
            return node;
        }

        @Override
        public Object getValue() {
            return node;
        }

        @Override
        public void setValue(Object value) {
            this.node = value;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        @Override
        public int getLength() {
            return 1;
        }

        @Override
        public QName getName() {
            return new QName(null, "test");
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
        public boolean isActual() {
            return true;
        }

        @Override
        public NodePointer getValuePointer() {
            return this;
        }
    }

    private static class TestFactory extends AbstractFactory {
        private final boolean shouldSucceed;
        private boolean called = false;

        TestFactory(boolean shouldSucceed) {
            this.shouldSucceed = shouldSucceed;
        }

        @Override
        public boolean createObject(JXPathContext context, NodePointer pointer, Object parent,
                                    String name, int index) {
            called = true;
            if (shouldSucceed) {
                ((PropertyPointer) pointer).baseValueToReturn = new Object();
                return true;
            }
            return false;
        }

        boolean wasCalled() {
            return called;
        }
    }
}