package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class MetaphoneTest {

    private Metaphone m;

    @Before
    public void setUp() {
        m = new Metaphone();
    }

    @Test
    public void testNullAndEmpty() {
        assertEquals("", m.metaphone(null));
        assertEquals("", m.metaphone(""));
        assertEquals("", m.encode((String) null));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("A", m.metaphone("a"));
        assertEquals("Z", m.metaphone("z"));
    }

    @Test
    public void testInitialSpecialCases() {
        assertEquals("E", m.metaphone("AE"));
        assertEquals("N", m.metaphone("KN"));
        assertEquals("R", m.metaphone("WR"));
        assertEquals("S", m.metaphone("CI"));
        assertEquals("J", m.metaphone("DGE"));
        assertEquals("AKS", m.metaphone("AX"));
    }

    @Test
    public void testDuplicateAndSilentLetters() {
        assertEquals("B", m.metaphone("BB"));
        assertEquals("M", m.metaphone("MB"));
    }

    @Test
    public void testEncoding() throws Exception {
        assertEquals("SM0", m.metaphone("Smith"));
        assertEquals("SM0", m.encode("Smith"));

        Object encoded = m.encode((Object) "Smith");
        assertTrue(encoded instanceof String);
        assertEquals("SM0", encoded);
    }

    @Test
    public void testIsMetaphoneEqual() {
        assertTrue(m.isMetaphoneEqual("Smith", "Smythe"));
        assertTrue(m.isMetaphoneEqual("A", "a"));
        assertFalse(m.isMetaphoneEqual("A", "B"));
    }

    @Test
    public void testMaxCodeLenLimitsOutput() {
        assertEquals(4, m.getMaxCodeLen());

        m.setMaxCodeLen(2);
        assertEquals("SM", m.metaphone("Smith"));

        m.setMaxCodeLen(0);
        assertEquals("", m.metaphone("Smith"));

        m.setMaxCodeLen(4);
        assertEquals("SM0", m.metaphone("Smith"));
    }

    @Test
    public void testEncodeObjectRejectsNonString() {
        try {
            m.encode(new Object());
            fail("Expected EncoderException for non-String object");
        } catch (EncoderException e) {
            assertEquals(
                "Parameter supplied to Metaphone encode is not of type java.lang.String",
                e.getMessage()
            );
        }
    }

    @Test
    public void testEncodeObjectRejectsNull() throws Exception {
        try {
            m.encode((Object) null);
            fail("Expected EncoderException for null object");
        } catch (EncoderException e) {
            // expected
        }
    }
}