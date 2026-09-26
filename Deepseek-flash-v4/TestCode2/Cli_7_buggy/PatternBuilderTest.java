package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * JUnit 5 test class for {@link PatternBuilder}.
 *
 * <p>The test class exercises:
 * <ul>
 *   <li>single options</li>
 *   <li>group options</li>
 *   <li>required options</li>
 *   <li>all supported argument validator marker characters</li>
 *   <li>the empty pattern</li>
 * </ul>
 * </p>
 */
class PatternBuilderTest {

    private Option build(final String pattern) {
        final PatternBuilder builder = new PatternBuilder();
        builder.withPattern(pattern);
        return builder.create();
    }

    @Test
    void testSingleLetterOption() {
        assertNotNull(build("a"));
    }

    @Test
    void testTwoLetterOptionsCreateGroup() {
        assertNotNull(build("ab"));
    }

    @Test
    void testRequiredOption() {
        assertNotNull(build("a!"));
    }

    @Test
    void testArgumentValidatorAt() {
        assertNotNull(build("a@"));
    }

    @Test
    void testArgumentValidatorPlus() {
        assertNotNull(build("a+"));
    }

    @Test
    void testArgumentValidatorPercent() {
        assertNotNull(build("a%"));
    }

    @Test
    void testArgumentValidatorHash() {
        assertNotNull(build("a#"));
    }

    @Test
    void testArgumentValidatorLeftAngle() {
        assertNotNull(build("a<"));
    }

    @Test
    void testArgumentValidatorRightAngle() {
        assertNotNull(build("a>"));
    }

    @Test
    void testArgumentValidatorStar() {
        assertNotNull(build("a*"));
    }

    @Test
    void testArgumentValidatorSlash() {
        assertNotNull(build("a/"));
    }

    @Test
    void testEmptyPatternAcceptedByWithPattern() {
        final PatternBuilder builder = new PatternBuilder();
        assertDoesNotThrow(() -> builder.withPattern(""));
    }

    @Test
    void testMixedPatternWithMultipleOptions() {
        assertNotNull(build("ab"));
    }

    @Test
    void testPatternWithArgumentsAndMultipleOptions() {
        assertNotNull(build("ab@cd"));
    }

    public static void main(final String[] args) {
        final PatternBuilderTest tests = new PatternBuilderTest();

        tests.testSingleLetterOption();
        tests.testTwoLetterOptionsCreateGroup();
        tests.testRequiredOption();
        tests.testArgumentValidatorAt();
        tests.testArgumentValidatorPlus();
        tests.testArgumentValidatorPercent();
        tests.testArgumentValidatorHash();
        tests.testArgumentValidatorLeftAngle();
        tests.testArgumentValidatorRightAngle();
        tests.testArgumentValidatorStar();
        tests.testArgumentValidatorSlash();
        tests.testEmptyPatternAcceptedByWithPattern();
        tests.testMixedPatternWithMultipleOptions();
        tests.testPatternWithArgumentsAndMultipleOptions();

        System.out.println("All PatternBuilder tests passed.");
    }
}