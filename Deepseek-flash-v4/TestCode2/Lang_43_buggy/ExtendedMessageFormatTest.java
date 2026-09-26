package org.apache.commons.lang.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ExtendedMessageFormatTest {

    private static final String DUMMY_PATTERN = "";
    
    private Map<String, FormatFactory> registry;
    private ExtendedMessageFormat format;

    @Before
    public void setUp() {
        registry = new HashMap<String, FormatFactory>();
        format = new ExtendedMessageFormat(DUMMY_PATTERN);
    }

    @Test
    public void testDefaultConstructor() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertNotNull(emf);
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructorWithLocale() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", Locale.GERMANY);
        assertNotNull(emf);
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructorWithRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", registry);
        assertNotNull(emf);
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructorWithAllParams() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", Locale.US, registry);
        assertNotNull(emf);
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithRegistryNull() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", null);
        emf.applyPattern("Custom {0}");
        assertEquals("Custom {0}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithQuotedString() {
        registry.put("lower", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{0}'", Locale.US, registry);
        assertEquals("'{0}'", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithEscapedQuote() {
        registry.put("lower", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("''{0}", Locale.US, registry);
        assertEquals("''{0}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithCustomFormat() {
        registry.put("lower", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,lower}", Locale.US, registry);
        assertEquals("{0,lower}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithCustomFormatAndStyle() {
        registry.put("lower", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,lower,style}", Locale.US, registry);
        assertEquals("{0,lower,style}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithNestedBraces() {
        registry.put("lower", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,lower,{1}}", Locale.US, registry);
        assertEquals("{0,lower,{1}}", emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPatternUnterminatedFormatElement() {
        new ExtendedMessageFormat("{0,something", Locale.US, registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPatternUnreadableFormatElement() {
        registry.put("test", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        new ExtendedMessageFormat("{0,test,unclosed}", Locale.US, registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPatternInvalidArgumentIndex() {
        new ExtendedMessageFormat("{abc}", Locale.US, registry);
    }

    @Test
    public void testApplyPatternUnterminatedQuotedString() {
        try {
            new ExtendedMessageFormat("'{0}", Locale.US, registry);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unterminated quoted string"));
        }
    }

    @Test
    public void testToPatternAfterApplyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", Locale.US, registry);
        emf.applyPattern("World {1}");
        assertEquals("World {1}", emf.toPattern());
    }

    @Test
    public void testSetFormatThrowsUnsupportedOperationException() {
        try {
            format.setFormat(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatByArgumentIndexThrowsUnsupportedOperationException() {
        try {
            format.setFormatByArgumentIndex(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatsThrowsUnsupportedOperationException() {
        try {
            format.setFormats(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatsByArgumentIndexThrowsUnsupportedOperationException() {
        try {
            format.setFormatsByArgumentIndex(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testContainsElementsWithNull() {
        assertFalse(containsElements(null));
    }

    @Test
    public void testContainsElementsWithEmpty() {
        assertFalse(containsElements(new ArrayList()));
    }

    @Test
    public void testContainsElementsWithAllNull() {
        ArrayList list = new ArrayList();
        list.add(null);
        list.add(null);
        assertFalse(containsElements(list));
    }

    @Test
    public void testContainsElementsWithNonNull() {
        ArrayList list = new ArrayList();
        list.add(null);
        list.add("test");
        assertTrue(containsElements(list));
    }

    private boolean containsElements(Collection coll) {
        if (coll == null || coll.size() == 0) {
            return false;
        }
        for (Iterator iter = coll.iterator(); iter.hasNext();) {
            if (iter.next() != null) {
                return true;
            }
        }
        return false;
    }
}