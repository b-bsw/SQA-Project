package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class CodeGeneratorTest {

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder out = new StringBuilder();

        @Override
        void add(String str) {
            out.append(str);
        }

        @Override
        void addNumber(double value) {
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                out.append(value);
            } else if (value == Math.rint(value)) {
                out.append((long) value);
            } else {
                out.append(value);
            }
        }

        String getCode() {
            return out.toString();
        }
    }

    private TestCodeConsumer consumer;
    private CodeGenerator generator;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    @Test
    public void testAddStringDelegatesToConsumer() {
        generator.add("hello");
        assertEquals("hello", consumer.getCode());
    }

    @Test
    public void testAddEmptyString() {
        generator.add("");
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

    @Test
    public void testAddNumberNode() {
        Node number = new Node(Token.NUMBER);
        number.setDouble(42.5);

        generator.add(number);

        assertEquals("42.5", consumer.getCode());
    }

    @Test
    public void testConstructorAcceptsCharset() {
        CodeGenerator gen = new CodeGenerator(consumer, Charset.forName("UTF-8"));
        assertNotNull(gen);

        gen.add("test");
        assertEquals("test", consumer.getCode());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullNodeThrowsNullPointerException() {
        generator.add((Node) null);
        assertNull(consumer.getCode());
    }
}