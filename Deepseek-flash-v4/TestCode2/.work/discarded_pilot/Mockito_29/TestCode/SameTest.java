package org.mockito.internal.matchers;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;

public class SameTest {

    private static class StubDescription implements Description {
        private final StringBuilder text = new StringBuilder();

        @Override
        public void appendText(String s) {
            text.append(s);
        }

        @Override
        public Description appendDescriptionOf(SelfDescribing selfDescribing) {
            return this;
        }

        @Override
        public Description appendValue(Object o) {
            return this;
        }

        @Override
        public <T> Description appendValueList(String start, String separator, String end, T... values) {
            return this;
        }

        @Override
        public <T> Description appendValueList(String start, String separator, String end, Iterable<T> values) {
            return this;
        }

        @Override
        public Description appendList(String start, String separator, String end,
                                      Iterable<? extends SelfDescribing> values) {
            return this;
        }

        public String getText() {
            return text.toString();
        }
    }

    @Test
    public void testMatchesSameReference() {
        Object obj = new Object();
        Same same = new Same(obj);
        Assert.assertTrue(same.matches(obj));
    }

    @Test
    public void testMatchesDifferentReference() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Same same = new Same(obj1);
        Assert.assertFalse(same.matches(obj2));
    }

    @Test
    public void testMatchesNullWithNull() {
        Same same = new Same(null);
        Assert.assertTrue(same.matches(null));
    }

    @Test
    public void testMatchesNullWithNonNull() {
        Same same = new Same(null);
        Assert.assertFalse(same.matches("anything"));
    }

    @Test
    public void testDescribeToString() {
        Same same = new Same("hello");
        StubDescription desc = new StubDescription();
        same.describeTo(desc);
        Assert.assertEquals("same(\"hello\")", desc.getText());
    }

    @Test
    public void testDescribeToCharacter() {
        Same same = new Same('A');
        StubDescription desc = new StubDescription();
        same.describeTo(desc);
        Assert.assertEquals("same('A')", desc.getText());
    }

    @Test
    public void testDescribeToNonStringNonCharacter() {
        Same same = new Same(123);
        StubDescription desc = new StubDescription();
        same.describeTo(desc);
        Assert.assertEquals("same(123)", desc.getText());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeToNullWanted() {
        Same same = new Same(null);
        StubDescription desc = new StubDescription();
        same.describeTo(desc);
    }
}