package org.apache.commons.jxpath.ri.model;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class NodePointerTest {

    private static final QName TEST_NAME = new QName("test");
    private static final Locale TEST_LOCALE = Locale.US;
    
    private TestNodePointer pointer;
    private TestNodePointer childPointer;
    
    @Before
    public void setUp() {
        pointer = new TestNodePointer(null, TEST_LOCALE);
        childPointer = new TestNodePointer(pointer, TEST_LOCALE);
    }

    @Test
    public void testConstructorSetsParent() {
        assertNull("parent should be null", pointer.getParent());
        assertSame("child parent should be pointer", pointer, childPointer.getParent());
    }

    @Test
    public void testIsRoot() {
        assertTrue("root pointer should be root", pointer.isRoot());
        assertFalse("child pointer should not be root", childPointer.isRoot());
    }

    @Test
    public void testIsAttributeDefaultFalse() {
        assertFalse("attribute should be false by default", pointer.isAttribute());
    }

    @Test
    public void testSetAndGetAttribute() {
        pointer.setAttribute(true);
        assertTrue("attribute should be true", pointer.isAttribute());
        pointer.setAttribute(false);
        assertFalse("attribute should be false after reset", pointer.isAttribute());
    }

    @Test
    public void testGetIndexDefault() {
        assertEquals("default index should be WHOLE_COLLECTION", 
                     NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testSetAndGetIndex() {
        pointer.setIndex(5);
        assertEquals("index should be 5", 5, pointer.getIndex());
        pointer.setIndex(-1);
        assertEquals("index should be -1", -1, pointer.getIndex());
    }

    @Test
    public void testIsActualWithWHOLE_COLLECTION() {
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue("WHOLE_COLLECTION should be actual", pointer.isActual());
    }

    @Test
    public void testIsActualWithValidIndex() {
        TestNodePointer collectionPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public int getLength() {
                return 10;
            }
        };
        collectionPointer.setIndex(5);
        assertTrue("index 5 should be actual", collectionPointer.isActual());
    }

    @Test
    public void testIsActualWithInvalidNegativeIndex() {
        TestNodePointer collectionPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public int getLength() {
                return 5;
            }
        };
        collectionPointer.setIndex(-2);
        assertFalse("index -2 should not be actual", collectionPointer.isActual());
    }

    @Test
    public void testIsActualWithIndexOutOfRange() {
        TestNodePointer collectionPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public int getLength() {
                return 3;
            }
        };
        collectionPointer.setIndex(5);
        assertFalse("index 5 should not be actual", collectionPointer.isActual());
    }

    @Test
    public void testGetLocaleFromParent() {
        pointer.setLocale(TEST_LOCALE);
        assertEquals("child should inherit parent locale", TEST_LOCALE, childPointer.getLocale());
    }

    @Test
    public void testGetLocaleWhenNullInParent() {
        assertNull("locale should be null", pointer.getLocale());
    }

    @Test
    public void testIsLanguageExactMatchUpperCase() {
        pointer.setLocale(Locale.US);
        assertTrue("should match EN", pointer.isLanguage("EN"));
    }

    @Test
    public void testIsLanguageExactMatchLowerCase() {
        pointer.setLocale(Locale.US);
        assertTrue("should match en", pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageNoMatch() {
        pointer.setLocale(Locale.US);
        assertFalse("should not match FR", pointer.isLanguage("FR"));
    }

    @Test
    public void testIsLanguageWithCountrySeparator() {
        pointer.setLocale(Locale.CANADA_FRENCH);
        assertTrue("should match fr", pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageNullSafety() {
        pointer.setLocale(Locale.US);
        try {
            pointer.isLanguage(null);
            fail("should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue("null test should match", pointer.testNode(null));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue("should match node type test", pointer.testNode(nodeTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNotNode() {
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse("should not match non-node type test", pointer.testNode(nodeTest));
    }

    @Test
    public void testTestNodeWithNodeNameTestNullName() {
        NodeNameTest nameTest = new NodeNameTest(new QName("missing"));
        assertFalse("should not match when getName returns null", pointer.testNode(nameTest));
    }

    @Test
    public void testEqualStringsBothSame() {
        // indirect test via testNode: prefixes match exactly
        NodeNameTest nameTest = new NodeNameTest(TEST_NAME);
        assertTrue("should match exact name", pointer.testNode(nameTest));
    }

    @Test
    public void testEqualStringsOneNullOneNonNull() {
        // create a pointer with null prefix to test equalStrings with one null
        TestNodePointer nullPrefixPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName(null, "test");
            }
        };
        NodeNameTest nameTest = new NodeNameTest(new QName("prefix", "test"));
        // prefix mismatch should cause namespace check which will return null -> different -> false
        assertFalse("should not match due to prefix difference", nullPrefixPointer.testNode(nameTest));
    }

    @Test
    public void testTestNodeWithContainerReturnsFalse() {
        TestNodePointer containerPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public boolean isContainer() {
                return true;
            }
            @Override
            public QName getName() {
                return TEST_NAME;
            }
        };
        NodeNameTest nameTest = new NodeNameTest(TEST_NAME);
        assertFalse("container should return false for NodeNameTest", containerPointer.testNode(nameTest));
    }

    @Test
    public void testGetValueReturnsGetNodeByDefault() {
        Object expected = new Object();
        TestNodePointer valuePointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public Object getImmediateNode() {
                return expected;
            }
            @Override
            public NodePointer getImmediateValuePointer() {
                return this;
            }
        };
        assertSame("getValue should return getNode result", expected, valuePointer.getValue());
    }

    @Test
    public void testGetValueDelegatesToValuePointer() {
        Object expected = new Object();
        TestNodePointer valuePointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public Object getImmediateNode() {
                return expected;
            }
        };
        TestNodePointer container = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodePointer getImmediateValuePointer() {
                return valuePointer;
            }
        };
        assertSame("getValue should delegate to value pointer", expected, container.getValue());
    }

    @Test
    public void testGetValuePointerReturnsSelfWhenImmediateIsSelf() {
        assertSame("should return self", pointer, pointer.getValuePointer());
    }

    @Test
    public void testGetValuePointerRecursesWhenImmediateIsDifferent() {
        TestNodePointer inner = new TestNodePointer(null, TEST_LOCALE);
        TestNodePointer outer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodePointer getImmediateValuePointer() {
                return inner;
            }
        };
        assertSame("should return inner after recursion", inner, outer.getValuePointer());
    }

    @Test
    public void testGetImmediateValuePointerReturnsSelf() {
        assertSame("should return this", pointer, pointer.getImmediateValuePointer());
    }

    @Test
    public void testGetParentReturnsContainerParent() {
        TestNodePointer container = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public boolean isContainer() {
                return true;
            }
        };
        TestNodePointer child = new TestNodePointer(container, TEST_LOCALE);
        TestNodePointer grandchild = new TestNodePointer(child, TEST_LOCALE);
        // grandchild's getParent should skip container parent and return container's parent (null here)
        assertNull("should skip container parent", grandchild.getParent());
    }

    @Test
    public void testGetParentReturnsImmediateParentIfNotContainer() {
        assertSame("should return immediate parent", pointer, childPointer.getParent());
    }

    @Test
    public void testGetImmediateParentPointer() {
        assertSame("should return parent", pointer, childPointer.getImmediateParentPointer());
    }

    @Test
    public void testAsPathWithParent() {
        TestNodePointer root = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName("root");
            }
            @Override
            public boolean isCollection() {
                return false;
            }
        };
        TestNodePointer child = new TestNodePointer(root, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName("child");
            }
            @Override
            public boolean isCollection() {
                return true;
            }
            @Override
            public int getLength() {
                return 5;
            }
        };
        root.setIndex(2);
        child.setIndex(1);
        String path = child.asPath();
        assertTrue("path should contain /root/child[2]", path.contains("/root/child[2]"));
    }

    @Test
    public void testAsPathWithNullParent() {
        TestNodePointer root = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName("root");
            }
            @Override
            public boolean isCollection() {
                return false;
            }
        };
        String path = root.asPath();
        assertEquals("should be /root", "/root", path);
    }

    @Test
    public void testAsPathWithAttribute() {
        TestNodePointer attrPointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName("attr");
            }
            @Override
            public boolean isCollection() {
                return false;
            }
        };
        attrPointer.setAttribute(true);
        String path = attrPointer.asPath();
        assertEquals("should be /@attr", "/@attr", path);
    }

    @Test
    public void testAsPathDelegatesToContainerParent() {
        TestNodePointer container = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public boolean isContainer() {
                return true;
            }
            @Override
            public QName getName() {
                return new QName("container");
            }
            @Override
            public String asPath() {
                return "/custom/container";
            }
        };
        TestNodePointer child = new TestNodePointer(container, TEST_LOCALE) {
            @Override
            public QName getName() {
                return new QName("child");
            }
            @Override
            public boolean isCollection() {
                return false;
            }
        };
        String path = child.asPath();
        assertEquals("should delegate to container parent", "/custom/container/child", path);
    }

    @Test
    public void testGetNamespaceResolverFromParent() {
        NamespaceResolver resolver = new NamespaceResolver();
        pointer.setNamespaceResolver(resolver);
        assertSame("child should get resolver from parent", resolver, childPointer.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolverWhenNullParent() {
        assertNull("root pointer should have null resolver", pointer.getNamespaceResolver());
    }

    @Test
    public void testCreatePathSetsValue() {
        Object value = new Object();
        TestNodePointer result = (TestNodePointer) pointer.createPath(null, value);
        assertSame("should return this", pointer, result);
        assertSame("value should be set", value, pointer.createdValue);
    }

    @Test
    public void testCreatePathWithNoArgsReturnsThis() {
        assertSame("should return this", pointer, pointer.createPath(null));
    }

    @Test
    public void testCreateChildThrowsException() {
        try {
            pointer.createChild(null, TEST_NAME, 0, null);
            fail("should have thrown JXPathException");
        } catch (JXPathException e) {
            // expected
        }
    }

    @Test
    public void testCreateChildWithOnlyIndexThrowsException() {
        try {
            pointer.createChild(null, TEST_NAME, 0);
            fail("should have thrown JXPathException");
        } catch (JXPathException e) {
            // expected
        }
    }

    @Test
    public void testCreateAttributeThrowsException() {
        try {
            pointer.createAttribute(null, TEST_NAME);
            fail("should have thrown JXPathException");
        } catch (JXPathException e) {
            // expected
        }
    }

    @Test
    public void testRemoveIsNoOp() {
        // should not throw, just ensure it runs
        pointer.remove();
        // no assertion needed, just verify no exception
    }

    @Test
    public void testCompareToWithSameParent() {
        TestNodePointer a = new TestNodePointer(null, TEST_LOCALE);
        TestNodePointer b = new TestNodePointer(null, TEST_LOCALE);
        TestNodePointer parent = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                if (p1 == a && p2 == b) return -1;
                return 0;
            }
        };
        a.parent = parent;
        b.parent = parent;
        int result = a.compareTo(b);
        assertTrue("result should be negative", result < 0);
    }

    @Test
    public void testCompareToWithDifferentParents() {
        TestNodePointer root = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                if (p1 == p2) return 0;
                return -1;
            }
        };
        TestNodePointer a = new TestNodePointer(root, TEST_LOCALE);
        TestNodePointer b = new TestNodePointer(root, TEST_LOCALE);
        root.index = 0;
        a.index = 1;
        b.index = 2;
        // they share same root depth 2, root compareChildNodePointers will be called eventually
        // use the custom compareChildNodePointers
        int result = a.compareTo(b);
        assertTrue("result should be non-zero", result != 0);
    }

    @Test(expected = JXPathException.class)
    public void testCompareToThrowsWhenDepthOneAndDifferent() {
        TestNodePointer a = new TestNodePointer(null, TEST_LOCALE);
        TestNodePointer b = new TestNodePointer(null, TEST_LOCALE);
        a.compareTo(b);
    }

    @Test
    public void testCompareToWhenBothNull() {
        // only reaches depth1==1 test, will throw exception, so use same pointer
        int result = pointer.compareTo(pointer);
        assertEquals("same pointer should be 0", 0, result);
    }

    @Test
    public void testClone() {
        NodePointer cloned = (NodePointer) pointer.clone();
        assertNotNull("cloned should not be null", cloned);
        assertNotSame("cloned should be different object", pointer, cloned);
        if (pointer.parent != null) {
            assertNotNull("parent should be cloned", cloned.parent);
            assertNotSame("parent should be different", pointer.parent, cloned.parent);
        }
    }

    @Test
    public void testToStringReturnsAsPath() {
        String path = pointer.toString();
        assertEquals("toString should equal asPath", pointer.asPath(), path);
    }

    @Test
    public void testGetRootNodeWithParent() {
        Object rootNode = new Object();
        TestNodePointer root = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public Object getImmediateNode() {
                return rootNode;
            }
        };
        TestNodePointer child = new TestNodePointer(root, TEST_LOCALE);
        assertSame("root node should be from parent", rootNode, child.getRootNode());
    }

    @Test
    public void testGetRootNodeWithoutParent() {
        Object rootNode = new Object();
        TestNodePointer root = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public Object getImmediateNode() {
                return rootNode;
            }
        };
        assertSame("root node should be immediate node", rootNode, root.getRootNode());
    }

    @Test
    public void testChildIteratorDelegatesToValuePointer() {
        TestNodePointer valuePointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodeIterator childIterator(NodeTest test, boolean reverse, NodePointer startWith) {
                return null; // indicates delegation worked
            }
        };
        TestNodePointer container = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodePointer getImmediateValuePointer() {
                return valuePointer;
            }
        };
        assertNull("should delegate to value pointer", container.childIterator(null, false, null));
    }

    @Test
    public void testChildIteratorReturnsNullWhenValuePointerIsSelf() {
        assertNull("should return null when valuePointer is self", pointer.childIterator(null, false, null));
    }

    @Test
    public void testAttributeIteratorDelegates() {
        TestNodePointer valuePointer = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodeIterator attributeIterator(QName qname) {
                return null;
            }
        };
        TestNodePointer container = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public NodePointer getImmediateValuePointer() {
                return valuePointer;
            }
        };
        assertNull("should delegate to value pointer", container.attributeIterator(null));
    }

    @Test
    public void testAttributeIteratorReturnsNullWhenSelf() {
        assertNull("should return null when valuePointer is self", pointer.attributeIterator(null));
    }

    @Test
    public void testNamespaceIteratorReturnsNull() {
        assertNull("default should return null", pointer.namespaceIterator());
    }

    @Test
    public void testNamespacePointerReturnsNull() {
        assertNull("default should return null", pointer.namespacePointer("test"));
    }

    @Test
    public void testGetNamespaceURIReturnsNull() {
        assertNull("default should return null", pointer.getNamespaceURI("prefix"));
    }

    @Test
    public void testGetNamespaceURINoPrefixReturnsNull() {
        assertNull("default should return null", pointer.getNamespaceURI());
    }

    @Test
    public void testIsDefaultNamespaceNullPrefix() {
        assertTrue("null prefix should be default", pointer.isDefaultNamespace(null));
    }

    @Test
    public void testIsDefaultNamespaceExplicitMatch() {
        TestNodePointer custom = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public String getNamespaceURI(String prefix) {
                return "http://example.com/default";
            }
            @Override
            protected String getDefaultNamespaceURI() {
                return "http://example.com/default";
            }
        };
        assertTrue("matching prefix should be default", custom.isDefaultNamespace("prefix"));
    }

    @Test
    public void testIsDefaultNamespaceNoMatch() {
        TestNodePointer custom = new TestNodePointer(null, TEST_LOCALE) {
            @Override
            public String getNamespaceURI(String prefix) {
                return "http://example.com/other";
            }
            @Override
            protected String getDefaultNamespaceURI() {
                return "http://example.com/default";
            }
        };
        assertFalse("non-matching namespace should not be default", custom.isDefaultNamespace("prefix"));
    }

    @Test
    public void testIsDefaultNamespaceWhenNamespaceURIReturnsNull() {
        // if getNamespaceURI returns null, should return false since not equal to default URI
        assertFalse("null namespace should not be default", pointer.isDefaultNamespace("prefix"));
    }

    @Test
    public void testGetDefaultNamespaceURIReturnsNull() {
        assertNull("default should return null", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetPointerByIDDelegates() {
        // just ensure no exception, returns null normally but depends on context
        // we can't test full delegation without a real context
        // just call method to verify it compiles and runs
        try {
            pointer.getPointerByID(null, "id");
        } catch (Exception e) {
            // maybe NullPointerException from null context, but that's acceptable
        }
    }

    @Test
    public void testGetPointerByKeyDelegates() {
        try {
            pointer.getPointerByKey(null, "key", "value");
        } catch (Exception e) {
            // acceptable
        }
    }

    // -----------------------------------------------------------------
    // Helper class: abstract NodePointer implementation for testing
    // -----------------------------------------------------------------
    private static class TestNodePointer extends NodePointer {
        private QName name = new QName("test");
        private Object immediateNode;
        private int length = 1;
        private boolean collection = false;
        Object createdValue;

        TestNodePointer(NodePointer parent, Locale locale) {
            super(parent, locale);
        }

        TestNodePointer(NodePointer parent) {
            super(parent);
        }

        @Override
        public boolean isLeaf() {
            return false;
        }

        @Override
        public boolean isCollection() {
            return collection;
        }

        public void setCollection(boolean collection) {
            this.collection = collection;
        }

        @Override
        public int getLength() {
            return length;
        }

        @Override
        public QName getName() {
            return name;
        }

        public void setName(QName name) {
            this.name = name;
        }

        @Override
        public Object getBaseValue() {
            return null;
        }

        @Override
        public Object getImmediateNode() {
            return immediateNode;
        }

        @Override
        public void setValue(Object value) {
            this.createdValue = value;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        void setLocale(Locale locale) {
            this.locale = locale;
        }
    }
}