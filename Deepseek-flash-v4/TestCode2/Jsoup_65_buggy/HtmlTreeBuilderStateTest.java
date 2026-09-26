package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    // ---------- Mock HtmlTreeBuilder ----------
    private static class MockTreeBuilder extends HtmlTreeBuilder {
        HtmlTreeBuilderState state;
        Document doc;
        ArrayList<Element> stack;
        Element headElement;
        Element formElement;
        ArrayList<Element> formattingElements;
        ArrayList<String> pendingTableChars;
        boolean fosterInserts, framesetOk;
        List<String> actions;
        boolean fragmentParsing;

        MockTreeBuilder() {
            super();  // assume default constructor exists
            doc = new Document("");
            stack = new ArrayList<>();
            stack.add(new Element(Tag.valueOf("html", ParseSettings.preserveCase), "")); // implicit html
            formattingElements = new ArrayList<>();
            pendingTableChars = new ArrayList<>();
            actions = new ArrayList<>();
            state = HtmlTreeBuilderState.Initial;
            fragmentParsing = false;
        }

        @Override
        public void transition(HtmlTreeBuilderState newState) {
            actions.add("transition:" + (newState != null ? newState.name() : "null"));
            state = newState;
        }

        @Override
        public void error(HtmlTreeBuilderState st) {
            actions.add("error:" + st.name());
        }

        @Override
        public void insert(Token.Comment comment) {
            actions.add("insertComment:" + comment.getData());
        }

        @Override
        public void insert(Token.Character c) {
            actions.add("insertCharacter:" + c.getData());
        }

        @Override
        public void insert(Token.StartTag startTag) {
            actions.add("insertStartTag:" + startTag.normalName());
        }

        @Override
        public Element insertEmpty(Token.StartTag startTag) {
            actions.add("insertEmpty:" + startTag.normalName());
            return null;
        }

        @Override
        public void insertStartTag(String name) {
            actions.add("insertStartTag:" + name);
        }

        @Override
        public Element getDocument() {
            return doc;
        }

        @Override
        public Element getHeadElement() {
            return headElement;
        }

        @Override
        public void setHeadElement(Element head) {
            headElement = head;
            actions.add("setHeadElement:" + head.nodeName());
        }

        @Override
        public void pop() {
            if (!stack.isEmpty()) {
                Element removed = stack.remove(stack.size()-1);
                actions.add("pop:" + removed.nodeName());
            }
        }

        @Override
        public ArrayList<Element> getStack() {
            return stack;
        }

        @Override
        public Element currentElement() {
            return stack.isEmpty() ? null : stack.get(stack.size()-1);
        }

        @Override
        public boolean process(Token token) {
            actions.add("process:" + token.type);
            // do not actually delegate to state to avoid recursion
            return true;
        }

        @Override
        public boolean process(Token token, HtmlTreeBuilderState inState) {
            actions.add("processInState:" + (inState != null ? inState.name() : "null"));
            return true;
        }

        @Override
        public void processStartTag(String name) {
            actions.add("processStartTag:" + name);
        }

        @Override
        public void processEndTag(String name) {
            actions.add("processEndTag:" + name);
        }

        @Override
        public void markInsertionMode() {
            actions.add("markInsertionMode");
        }

        @Override
        public boolean isFragmentParsing() {
            return fragmentParsing;
        }

        @Override
        public boolean framesetOk() {
            return framesetOk;
        }

        @Override
        public void framesetOk(boolean ok) {
            actions.add("framesetOk:" + ok);
            framesetOk = ok;
        }

        @Override
        public void reconstructFormattingElements() {
            actions.add("reconstructFormattingElements");
        }

        @Override
        public void pushActiveFormattingElements(Element el) {
            actions.add("pushActiveFormattingElements:" + el.nodeName());
            formattingElements.add(el);
        }

        @Override
        public Element getActiveFormattingElement(String name) {
            for (Element e : formattingElements) {
                if (e.nodeName().equals(name))
                    return e;
            }
            return null;
        }

        @Override
        public void removeFromActiveFormattingElements(Element el) {
            actions.add("removeActiveFormatting:" + el.nodeName());
            formattingElements.remove(el);
        }

        @Override
        public void processStartTag(String name, Attributes attrs) {
            actions.add("processStartTag:" + name);
        }

        @Override
        public Element getFormElement() {
            return formElement;
        }

        @Override
        public void setFormElement(Element form) {
            formElement = form;
            actions.add("setFormElement:" + (form != null ? form.nodeName() : "null"));
        }

        @Override
        public void newPendingTableCharacters() {
            pendingTableChars.clear();
            actions.add("newPendingTableCharacters");
        }

        @Override
        public ArrayList<String> getPendingTableCharacters() {
            return pendingTableChars;
        }

        @Override
        public void setFosterInserts(boolean fi) {
            actions.add("fosterInserts:" + fi);
            fosterInserts = fi;
        }

        @Override
        public HtmlTreeBuilderState originalState() {
            return null; // not used in our tests
        }
    }

    // ---------- Setup / Teardown ----------
    private MockTreeBuilder tb;

    @Before
    public void setUp() {
        tb = new MockTreeBuilder();
    }

    @After
    public void tearDown() {
        tb = null;
    }

    // ---------- Tests for Initial state ----------
    @Test
    public void testInitialStateWhitespaceReturnsTrue() {
        Token.Character ws = new Token.Character();
        ws.data("  ");
        boolean result = HtmlTreeBuilderState.Initial.process(ws, tb);
        assertTrue("Whitespace should return true", result);
        assertTrue("No transition should occur", tb.actions.isEmpty());
    }

    @Test
    public void testInitialStateCommentInsertsAndReturnsTrue() {
        Token.Comment comment = new Token.Comment();
        comment.data("test comment");
        boolean result = HtmlTreeBuilderState.Initial.process(comment, tb);
        assertTrue("Comment should return true", result);
        assertEquals(1, tb.actions.size());
        assertEquals("insertComment:test comment", tb.actions.get(0));
    }

    @Test
    public void testInitialStateDoctypeTransitionsToBeforeHtml() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);
        assertTrue("Doctype should return true", result);
        // Should have appended child to document and transition
        assertTrue("Should contain transition:BeforeHtml", tb.actions.stream().anyMatch(a -> a.equals("transition:BeforeHtml")));
        assertEquals(1, tb.getDocument().childNodeSize()); // DocumentType added
    }

    @Test
    public void testInitialStateOtherTokenTransitionsAndReProcesses() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        boolean result = HtmlTreeBuilderState.Initial.process(startTag, tb);
        assertTrue("StartTag should return true", result);
        // Should transition to BeforeHtml and call tb.process
        assertTrue(tb.actions.contains("transition:BeforeHtml"));
        assertTrue(tb.actions.contains("process:StartTag"));
    }

    // ---------- Tests for BeforeHtml state ----------
    @Test
    public void testBeforeHtmlWhitespaceReturnsTrue() {
        Token.Character ws = new Token.Character();
        ws.data("  ");
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(ws, tb);
        assertTrue(result);
        assertTrue(tb.actions.isEmpty());
    }

    @Test
    public void testBeforeHtmlStartTagHtmlTransitionsToBeforeHead() {
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(htmlTag, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("insertStartTag:html"));
        assertTrue(tb.actions.contains("transition:BeforeHead"));
    }

    @Test
    public void testBeforeHtmlEndTagInSetCallsAnythingElse() {
        Token.EndTag brEnd = new Token.EndTag();
        brEnd.name("br");
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(brEnd, tb);
        assertTrue(result);
        // anythingElse calls insertStartTag("html"), transition, and tb.process
        assertTrue(tb.actions.contains("insertStartTag:html"));
        assertTrue(tb.actions.contains("transition:BeforeHead"));
        assertTrue(tb.actions.contains("process:EndTag"));
    }

    @Test
    public void testBeforeHtmlDoctypeReturnsFalseWithError() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(doctype, tb);
        assertFalse("Doctype in BeforeHtml should return false", result);
        assertTrue(tb.actions.contains("error:BeforeHtml"));
    }

    // ---------- Tests for BeforeHead state ----------
    @Test
    public void testBeforeHeadStartTagHeadSetsHeadAndTransitions() {
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");
        boolean result = HtmlTreeBuilderState.BeforeHead.process(headTag, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("insertStartTag:head"));
        assertTrue(tb.actions.contains("setHeadElement:head"));
        assertTrue(tb.actions.contains("transition:InHead"));
    }

    @Test
    public void testBeforeHeadEndTagBodyHtmlBrCallsProcessStartTag() {
        Token.EndTag bodyEnd = new Token.EndTag();
        bodyEnd.name("body");
        boolean result = HtmlTreeBuilderState.BeforeHead.process(bodyEnd, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("processStartTag:head"));
        assertTrue(tb.actions.contains("process:EndTag"));
    }

    @Test
    public void testBeforeHeadDoctypeReturnsFalse() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        boolean result = HtmlTreeBuilderState.BeforeHead.process(doctype, tb);
        assertFalse(result);
        assertTrue(tb.actions.contains("error:BeforeHead"));
    }

    // ---------- Tests for InHead state ----------
    @Test
    public void testInHeadStartTagBaseInsertsEmpty() {
        Token.StartTag baseTag = new Token.StartTag();
        baseTag.name("base");
        boolean result = HtmlTreeBuilderState.InHead.process(baseTag, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("insertEmpty:base"));
    }

    @Test
    public void testInHeadEndTagHeadPopsAndTransitions() {
        Token.EndTag headEnd = new Token.EndTag();
        headEnd.name("head");
        boolean result = HtmlTreeBuilderState.InHead.process(headEnd, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("pop:head")); // note: head not in stack yet, but mock pop logs anyway
        assertTrue(tb.actions.contains("transition:AfterHead"));
    }

    @Test
    public void testInHeadDoctypeLogsErrorAndReturnsFalse() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        boolean result = HtmlTreeBuilderState.InHead.process(doctype, tb);
        assertFalse(result);
        assertTrue(tb.actions.contains("error:InHead"));
    }

    @Test
    public void testInHeadStartTagTitleHandlesRcData() {
        Token.StartTag titleTag = new Token.StartTag();
        titleTag.name("title");
        boolean result = HtmlTreeBuilderState.InHead.process(titleTag, tb);
        assertTrue(result);
        // handleRcData should have called transition(Text), markInsertionMode, insert
        assertTrue(tb.actions.contains("transition:Text"));
        assertTrue(tb.actions.contains("markInsertionMode"));
        assertTrue(tb.actions.contains("insertStartTag:title"));
    }

    // ---------- InBody: start tag "a" when no active formatting element ----------
    @Test
    public void testInBodyStartTagANoActiveFormattingElement() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag aTag = new Token.StartTag();
        aTag.name("a");
        boolean result = HtmlTreeBuilderState.InBody.process(aTag, tb);
        assertTrue(result);
        assertTrue(tb.actions.contains("reconstructFormattingElements"));
        assertTrue(tb.actions.contains("insertStartTag:a"));
        assertTrue(tb.actions.contains("pushActiveFormattingElements:a"));
    }

    // ---------- InBody: end tag "span" calls anyOtherEndTag ----------
    @Test
    public void testInBodyEndTagSpanCallsAnyOtherEndTag() {
        tb.state = HtmlTreeBuilderState.InBody;
        // ensure stack has a "span" element at top
        Element span = new Element(Tag.valueOf("span", ParseSettings.preserveCase), "");
        tb.getStack().add(span);
        Token.EndTag spanEnd = new Token.EndTag();
        spanEnd.name("span");
        boolean result = HtmlTreeBuilderState.InBody.process(spanEnd, tb);
        assertTrue(result);
        // anyOtherEndTag should find span in stack, generate implied end tags, pop to close
        assertTrue(tb.actions.contains("pop:span"));
    }

    // ---------- Helper method for list of string assertions ----------
    private void assertContains(List<String> actions, String expectedAction) {
        assertTrue("Expected action \"" + expectedAction + "\" not found in " + actions,
                actions.contains(expectedAction));
    }
}