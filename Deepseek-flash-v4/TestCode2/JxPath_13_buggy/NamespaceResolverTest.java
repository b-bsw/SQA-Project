package org.apache.commons.jxpath.ri;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.Pointer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NamespaceResolverTest {

    private NamespaceResolver resolver;
    private static final String PREFIX1 = "prefix1";
    private static final String URI1 = "http://uri1.com";
    private static final String PREFIX2 = "prefix2";
    private static final String URI2 = "http://uri2.com";

    @Before
    public void setUp() {
        resolver = new NamespaceResolver();
    }

    @Test
    public void testConstructorNoArgs() {
        NamespaceResolver r = new NamespaceResolver();
        assertNull(r.parent);
    }

    @Test
    public void testConstructorWithParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(parent, child.parent);
    }

    @Test
    public void testRegisterNamespaceNormal() {
        resolver.registerNamespace(PREFIX1, URI1);
        assertEquals(URI1, resolver.getNamespaceURI(PREFIX1));
    }

    @Test
    public void testRegisterNamespaceNullPrefix() {
        resolver.registerNamespace(null, URI1);
        assertEquals(URI1, resolver.getNamespaceURI(null));
    }

    @Test
    public void testRegisterNamespaceNullURI() {
        resolver.registerNamespace(PREFIX1, null);
        assertNull(resolver.getNamespaceURI(PREFIX1));
    }

    @Test(expected = IllegalStateException.class)
    public void testRegisterNamespaceSealed() {
        resolver.seal();
        resolver.registerNamespace(PREFIX1, URI1);
    }

    @Test
    public void testSetNamespaceContextPointer() {
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                if (PREFIX1.equals(prefix)) {
                    return URI1;
                }
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return null;
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);
        assertSame(mockPointer, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointerFallsBackToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return null;
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        parent.setNamespaceContextPointer(mockPointer);
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(mockPointer, child.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceURIRegisteredOnly() {
        resolver.registerNamespace(PREFIX1, URI1);
        assertEquals(URI1, resolver.getNamespaceURI(PREFIX1));
        assertNull(resolver.getNamespaceURI(PREFIX2));
    }

    @Test
    public void testGetNamespaceURIFromPointer() {
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                if (PREFIX2.equals(prefix)) {
                    return URI2;
                }
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return null;
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        resolver.registerNamespace(PREFIX1, URI1);
        resolver.setNamespaceContextPointer(mockPointer);
        assertEquals(URI2, resolver.getNamespaceURI(PREFIX2));
    }

    @Test
    public void testGetNamespaceURIFallsBackToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace(PREFIX1, URI1);
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals(URI1, child.getNamespaceURI(PREFIX1));
    }

    @Test
    public void testGetPrefixWhenReverseMapNull() {
        resolver.registerNamespace(PREFIX1, URI1);
        assertNotNull(resolver.getPrefix(URI1));
    }

    @Test
    public void testGetPrefixFromPointerIterator() {
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                if (PREFIX2.equals(prefix)) {
                    return URI2;
                }
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return new NodeIterator() {
                    private int position = 0;
                    private final NodePointer[] nodes = new NodePointer[] {
                        new NodePointer() {
                            private static final long serialVersionUID = 1L;

                            @Override
                            public Object getValue() {
                                return null;
                            }

                            @Override
                            public Object getNode() {
                                return null;
                            }

                            @Override
                            public Object getRootNode() {
                                return null;
                            }

                            @Override
                            public String asPath() {
                                return null;
                            }

                            @Override
                            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                                return 0;
                            }

                            @Override
                            public int getLength() {
                                return 0;
                            }

                            @Override
                            public boolean isLeaf() {
                                return false;
                            }

                            @Override
                            public boolean isActual() {
                                return false;
                            }

                            @Override
                            public boolean isCollection() {
                                return false;
                            }

                            @Override
                            public Object getImmediateValue() {
                                return null;
                            }

                            @Override
                            public NodePointer createPath(JXPathContext context, Object value) {
                                return null;
                            }

                            @Override
                            public NodePointer createPath(JXPathContext context) {
                                return null;
                            }

                            @Override
                            public NodePointer createChild(JXPathContext context, QName name, int index) {
                                return null;
                            }

                            @Override
                            public NodePointer createChild(JXPathContext context, QName name) {
                                return null;
                            }

                            @Override
                            public String getNamespaceURI() {
                                return URI2;
                            }

                            @Override
                            public String getNamespaceURI(String prefix) {
                                return null;
                            }

                            @Override
                            public NodeIterator namespaceIterator() {
                                return null;
                            }

                            @Override
                            public NodePointer getPointer() {
                                return null;
                            }

                            @Override
                            public boolean isDynamic() {
                                return false;
                            }

                            @Override
                            public boolean isContainer() {
                                return false;
                            }

                            @Override
                            public boolean isValid() {
                                return false;
                            }

                            @Override
                            public boolean isRoot() {
                                return false;
                            }

                            @Override
                            public QName getName() {
                                return new QName(null, PREFIX2);
                            }
                        }
                    };

                    @Override
                    public NodePointer getNodePointer() {
                        if (position == 1) {
                            return nodes[0];
                        }
                        return null;
                    }

                    @Override
                    public boolean setPosition(int position) {
                        this.position = position;
                        return position >= 1 && position <= nodes.length;
                    }
                };
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);
        assertEquals(PREFIX2, resolver.getPrefix(URI2));
    }

    @Test
    public void testGetPrefixFromRegisteredMap() {
        resolver.registerNamespace(PREFIX1, URI1);
        assertEquals(PREFIX1, resolver.getPrefix(URI1));
    }

    @Test
    public void testGetPrefixFallsBackToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace(PREFIX1, URI1);
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals(PREFIX1, child.getPrefix(URI1));
    }

    @Test
    public void testGetPrefixForUnknownURI() {
        assertNull(resolver.getPrefix(URI1));
    }

    @Test
    public void testIsSealedInitiallyFalse() {
        assertFalse(resolver.isSealed());
    }

    @Test
    public void testSealSetsSealed() {
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    public void testSealSealsParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        child.seal();
        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    public void testCloneCreatesUnsealedCopy() {
        resolver.seal();
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertFalse(clone.isSealed());
        assertNotNull(clone);
    }

    @Test
    public void testCloneIndependentReverseMap() {
        resolver.registerNamespace(PREFIX1, URI1);
        resolver.getPrefix(URI1);
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        clone.registerNamespace(PREFIX2, URI2);
        assertEquals(PREFIX1, resolver.getPrefix(URI1));
        assertEquals(PREFIX2, clone.getPrefix(URI2));
    }

    @Test
    public void testRegisterNamespaceResetsReverseMap() {
        resolver.registerNamespace(PREFIX1, URI1);
        resolver.getPrefix(URI1);
        resolver.registerNamespace(PREFIX2, URI2);
        assertEquals(PREFIX2, resolver.getPrefix(URI2));
    }

    @Test
    public void testGetPrefixWithEmptyPrefixInIterator() {
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return new NodeIterator() {
                    private int position = 0;
                    private final NodePointer[] nodes = new NodePointer[] {
                        new NodePointer() {
                            private static final long serialVersionUID = 1L;

                            @Override
                            public Object getValue() {
                                return null;
                            }

                            @Override
                            public Object getNode() {
                                return null;
                            }

                            @Override
                            public Object getRootNode() {
                                return null;
                            }

                            @Override
                            public String asPath() {
                                return null;
                            }

                            @Override
                            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                                return 0;
                            }

                            @Override
                            public int getLength() {
                                return 0;
                            }

                            @Override
                            public boolean isLeaf() {
                                return false;
                            }

                            @Override
                            public boolean isActual() {
                                return false;
                            }

                            @Override
                            public boolean isCollection() {
                                return false;
                            }

                            @Override
                            public Object getImmediateValue() {
                                return null;
                            }

                            @Override
                            public NodePointer createPath(JXPathContext context, Object value) {
                                return null;
                            }

                            @Override
                            public NodePointer createPath(JXPathContext context) {
                                return null;
                            }

                            @Override
                            public NodePointer createChild(JXPathContext context, QName name, int index) {
                                return null;
                            }

                            @Override
                            public NodePointer createChild(JXPathContext context, QName name) {
                                return null;
                            }

                            @Override
                            public String getNamespaceURI() {
                                return URI2;
                            }

                            @Override
                            public String getNamespaceURI(String prefix) {
                                return null;
                            }

                            @Override
                            public NodeIterator namespaceIterator() {
                                return null;
                            }

                            @Override
                            public NodePointer getPointer() {
                                return null;
                            }

                            @Override
                            public boolean isDynamic() {
                                return false;
                            }

                            @Override
                            public boolean isContainer() {
                                return false;
                            }

                            @Override
                            public boolean isValid() {
                                return false;
                            }

                            @Override
                            public boolean isRoot() {
                                return false;
                            }

                            @Override
                            public QName getName() {
                                return new QName(null, "");
                            }
                        }
                    };

                    @Override
                    public NodePointer getNodePointer() {
                        if (position == 1) {
                            return nodes[0];
                        }
                        return null;
                    }

                    @Override
                    public boolean setPosition(int position) {
                        this.position = position;
                        return position >= 1 && position <= nodes.length;
                    }
                };
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);
        resolver.registerNamespace(PREFIX1, URI1);
        assertEquals(PREFIX1, resolver.getPrefix(URI1));
    }

    @Test
    public void testGetPrefixWithMultipleIterations() {
        NodePointer mockPointer = new NodePointer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public Object getRootNode() {
                return null;
            }

            @Override
            public String asPath() {
                return null;
            }

            @Override
            public int compareChildNodePointers(NodePointer arg0, NodePointer arg1) {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public Object getImmediateValue() {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getNamespaceURI(String prefix) {
                return null;
            }

            @Override
            public NodeIterator namespaceIterator() {
                return null;
            }

            @Override
            public NodePointer getPointer() {
                return null;
            }

            @Override
            public boolean isDynamic() {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public QName getName() {
                return null;
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);
        resolver.registerNamespace(PREFIX1, URI1);
        resolver.registerNamespace(PREFIX2, URI2);
        assertEquals(PREFIX1, resolver.getPrefix(URI1));
        assertEquals(PREFIX2, resolver.getPrefix(URI2));
    }
}