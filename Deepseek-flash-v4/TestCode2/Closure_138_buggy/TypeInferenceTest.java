package com.google.javascript.jscomp;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
public class TypeInferenceTest {
    @Test
    public void testGetBooleanOutcomes_allCases() {
        assertEquals(BooleanLiteralSet.FALSE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.EMPTY, true));
        assertEquals(BooleanLiteralSet.FALSE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, true));
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
        assertEquals(BooleanLiteralSet.FALSE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.FALSE, true));
        assertEquals(BooleanLiteralSet.TRUE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.FALSE, BooleanLiteralSet.TRUE, true));
        assertEquals(BooleanLiteralSet.EMPTY,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, true));
        assertEquals(BooleanLiteralSet.TRUE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.EMPTY, false));
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, false));
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false));
        assertEquals(BooleanLiteralSet.TRUE,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.EMPTY, false));
        assertEquals(BooleanLiteralSet.EMPTY,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, false));
    }
}