package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.parser.Token.*;
import org.jsoup.nodes.*;
import static org.junit.Assert.*;

public class TreeBuilderStateTest {

    private MockTreeBuilder tb;

    @Before
    public void setUp() {
        tb = new MockTreeBuilder();
    }

    // --- Inner class to mock TreeBuilder ---
    private static class MockTreeBuilder extends TreeBuilder {
        String lastTransition;
        boolean errorCalled;
        boolean framesetOk = true;
        Element headElement;
        Element formElement;
        LinkedList<Element> stack = new LinkedList<>();
        LinkedList<Token> processedTokens = new LinkedList<>();
        StringBuilder insertedText = new StringBuilder();
        Element insertedStart;
        boolean fosterInserts;

        MockTreeBuilder() {
            super("");
            // Start with a document and html element on stack
            Document doc = new Document("");
            Element html = new Element(Tag.valueOf("html"), "");
            doc.appendChild(html);
            stack.add(html);
        }

        @Override
        void transition(TreeBuilderState state) {
            lastTransition = state.name();
        }

        @Override
        void error(TreeBuilderState state) {
            errorCalled = true;
        }

        @Override
        Element insert(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.name()), baseUri);
            stack.add(el);
            insertedStart = el;
            return el;
        }

        @Override
        Element insertEmpty(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.name()), baseUri);
            stack.getLast().appendChild(el);
            return el;
        }

        @Override
        void insert(Token.Comment comment) {
            // no-op
        }

        @Override
        void insert(Token.Character character) {
            insertedText.append(character.getData());
        }

        @Override
        boolean process(Token token) {
            processedTokens.add(token);
            return true;
        }

        @Override
        boolean process(Token token, TreeBuilderState state) {
            processedTokens.add(token);
            return true;
        }

        @Override
        Document getDocument() {
            return (Document) stack.getFirst().ownerDocument();
        }

        @Override
        String getBaseUri() {
            return "";
        }

        @Override
        LinkedList<Element> getStack() {
            return stack;
        }

        @Override
        Element currentElement() {
            return stack.getLast();
        }

        @Override
        boolean framesetOk() {
            return framesetOk;
        }

        @Override
        void framesetOk(boolean ok) {
            framesetOk = ok;
        }

        @Override
        void setHeadElement(Element head) {
            headElement = head;
        }

        @Override
        Element getHeadElement() {
            return headElement;
        }

        @Override
        void setFormElement(Element form) {
            formElement = form;
        }

        @Override
        Element getFormElement() {
            return formElement;
        }

        @Override
        void setFosterInserts(boolean inserts) {
            fosterInserts = inserts;
        }

        @Override
        void reconstructFormattingElements() {
            // stub
        }

        @Override
        boolean inButtonScope(String target) {
            return false;
        }

        @Override
        boolean inScope(String target) {
            return false;
        }

        @Override
        boolean inScope(String[] targets) {
            return false;
        }

        @Override
        boolean inListItemScope(String target) {
            return false;
        }

        @Override
        boolean inTableScope(String target) {
            return false;
        }

        @Override
        void generateImpliedEndTags() {
            // stub
        }

        @Override
        void generateImpliedEndTags(String except) {
            // stub
        }

        @Override
        void popStackToClose(String elName) {
            while (!stack.isEmpty() && !stack.getLast().nodeName().equals(elName))
                stack.removeLast();
            if (!stack.isEmpty()) stack.removeLast();
        }

        @Override
        void popStackToClose(String... elNames) {
            java.util.Set<String> set = new java.util.HashSet<>(java.util.Arrays.asList(elNames));
            while (!stack.isEmpty() && !set.contains(stack.getLast().nodeName()))
                stack.removeLast();
            if (!stack.isEmpty()) stack.removeLast();
        }

        @Override
        boolean isSpecial(Element el) {
            return StringUtil.in(el.nodeName(),
                    "address", "applet", "area", "article", "aside", "base", "basefont", "bgsound",
                    "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command",
                    "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure",
                    "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head",
                    "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link",
                    "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object",
                    "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary",
                    "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp");
        }

        @Override
        void pushActiveFormattingElements(Element el) {
            // stub
        }

        @Override
        Element getActiveFormattingElement(String name) {
            return null;
        }

        @Override
        void removeFromActiveFormattingElements(Element el) {
            // stub
        }

        @Override
        void insertMarkerToFormattingElements() {
            // stub
        }

        @Override
        void clearFormattingElementsToLastMarker() {
            // stub
        }

        @Override
        Element aboveOnStack(Element el) {
            int idx = stack.indexOf(el);
            return idx > 0 ? stack.get(idx-1) : null;
        }

        @Override
        boolean onStack(Element el) {
            return stack.contains(el);
        }

        @Override
        void replaceActiveFormattingElement(Element old, Element replacement) {
            // stub
        }

        @Override
        void replaceOnStack(Element old, Element replacement) {
            int idx = stack.indexOf(old);
            if (idx >= 0) stack.set(idx, replacement);
        }

        @Override
        void insertOnStackAfter(Element before, Element after) {
            int idx = stack.indexOf(before);
            if (idx >= 0) stack.add(idx+1, after);
        }

        @Override
        void removeFromStack(Element el) {
            stack.remove(el);
        }

        @Override
        Element getFromStack(String name) {
            for (Element e : stack) if (e.nodeName().equals(name)) return e;
            return null;
        }

        @Override
        void newPendingTableCharacters() {
            // stub
        }

        @Override
        java.util.List<Token.Character> getPendingTableCharacters() {
            return new java.util.ArrayList<>();
        }

        @Override
        void resetInsertionMode() {
            // stub
        }

        @Override
        void clearStackToTableContext() {
            // stub
        }

        @Override
        void clearStackToTableBodyContext() {
            // stub
        }

        @Override
        void clearStackToTableRowContext() {
            // stub
        }

        @Override
        boolean isFragmentParsing() {
            return false;
        }

        @Override
        void markInsertionMode() {
            // stub
        }

        @Override
        TreeBuilderState originalState() {
            return TreeBuilderState.InBody;
        }

        @Override
        TreeBuilderState state() {
            return TreeBuilderState.InBody;
        }

        @Override
        void pop() {
            if (!stack.isEmpty()) stack.removeLast();
        }

        @Override
        void push(Element el) {
            stack.add(el);
        }

        // Tokeniser reference not needed; we stub
        org.jsoup.parser.Tokeniser tokeniser = new org.jsoup.parser.Tokeniser(null, null) {};
        @Override
        void insertInFosterParent(Node node) {
            // stub
        }
    }

    // ==================== Test methods ====================

    @Test
    public void testInitialWhitespace() {
        Token t = new Token.Character(" ");
        assertTrue(TreeBuilderState.Initial.process(t, tb));
        assertNull(tb.lastTransition);
        assertFalse(tb.errorCalled);
    }

    @Test
    public void testInitialComment() {
        Token t = new Token.Comment("test");
        assertTrue(TreeBuilderState.Initial.process(t, tb));
        assertNull(tb.lastTransition);
    }

    @Test
    public void testInitialDoctype() {
        Token.Doctype d = new Token.Doctype();
        d.setName("html");
        d.setForceQuirks(false);
        assertTrue(TreeBuilderState.Initial.process(d, tb));
        assertEquals("BeforeHtml", tb.lastTransition);
    }

    @Test
    public void testInitialOtherTransitionsToBeforeHtmlAndReprocess() {
        Token t = new Token.StartTag("p");
        assertTrue(TreeBuilderState.Initial.process(t, tb));
        assertEquals("BeforeHtml", tb.lastTransition);
        assertFalse(tb.processedTokens.isEmpty()); // reprocessed token
    }

    @Test
    public void testBeforeHtmlDoctypeReturnsFalse() {
        Token t = new Token.Doctype();
        assertFalse(TreeBuilderState.BeforeHtml.process(t, tb));
        assertTrue(tb.errorCalled);
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        Token t = new Token.StartTag("html");
        assertTrue(TreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals("BeforeHead", tb.lastTransition);
    }

    @Test
    public void testBeforeHtmlEndTagBr() {
        Token t = new Token.EndTag("br");
        assertTrue(TreeBuilderState.BeforeHtml.process(t, tb));
        // should call anythingElse -> insert "html", transition BeforeHead, reprocess
        assertEquals("BeforeHead", tb.lastTransition);
    }

    @Test
    public void testInBodyCharacterNull() {
        // Character with nullString (0x0000)
        Token.Character c = new Token.Character("\u0000");
        assertTrue(TreeBuilderState.InBody.process(c, tb));
        assertTrue(tb.errorCalled);
    }

    @Test
    public void testInBodyStartTagDiv() {
        Token t = new Token.StartTag("div");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        assertNotNull(tb.insertedStart);
        assertEquals("div", tb.insertedStart.nodeName());
    }

    @Test
    public void testInBodyEndTagDiv() {
        // Push a div first so stack has it
        tb.insert(new Token.StartTag("div"));
        tb.getStack().add(new Element(Tag.valueOf("div"), ""));
        Token t = new Token.EndTag("div");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        // Div should be popped
        assertFalse(tb.getStack().getLast().nodeName().equals("div"));
    }

    @Test
    public void testInTableStartTagCaption() {
        Token t = new Token.StartTag("caption");
        assertTrue(TreeBuilderState.InTable.process(t, tb));
        assertEquals("InCaption", tb.lastTransition);
    }

    @Test
    public void testInTableEndTagTable() {
        // Ensure table is in scope
        tb.getStack().add(new Element(Tag.valueOf("table"), ""));
        Token t = new Token.EndTag("table");
        assertTrue(TreeBuilderState.InTable.process(t, tb));
        // Table popped
        assertFalse(tb.getStack().getLast().nodeName().equals("table"));
    }

    @Test
    public void testInSelectCharacter() {
        Token.Character c = new Token.Character("a");
        assertTrue(TreeBuilderState.InSelect.process(c, tb));
        assertEquals("a", tb.insertedText.toString());
    }

    @Test
    public void testInSelectStartTagOption() {
        Token t = new Token.StartTag("option");
        assertTrue(TreeBuilderState.InSelect.process(t, tb));
        // Should process end tag "option" first then insert new option
        assertEquals("option", tb.insertedStart.nodeName());
    }

    @Test
    public void testInSelectEndTagSelect() {
        tb.getStack().add(new Element(Tag.valueOf("select"), ""));
        Token t = new Token.EndTag("select");
        assertTrue(TreeBuilderState.InSelect.process(t, tb));
        assertFalse(tb.getStack().getLast().nodeName().equals("select"));
    }

    @Test
    public void testInSelectStartTagInput() {
        Token t = new Token.StartTag("input");
        assertTrue(TreeBuilderState.InSelect.process(t, tb));
        // Should error, end select, reprocess input
        assertTrue(tb.errorCalled);
        assertFalse(tb.getStack().contains(new Element(Tag.valueOf("select"), ""))); // select popped
    }

    @Test
    public void testBeforeHeadStartTagHead() {
        Token t = new Token.StartTag("head");
        assertTrue(TreeBuilderState.BeforeHead.process(t, tb));
        assertEquals("InHead", tb.lastTransition);
        assertNotNull(tb.headElement);
    }

    @Test
    public void testInHeadStartTagMeta() {
        Token t = new Token.StartTag("meta");
        assertTrue(TreeBuilderState.InHead.process(t, tb));
        // meta inserted empty
        assertNotNull(tb.insertedStart);
    }

    @Test
    public void testInHeadEndTagHead() {
        tb.getStack().add(new Element(Tag.valueOf("head"), ""));
        Token t = new Token.EndTag("head");
        assertTrue(TreeBuilderState.InHead.process(t, tb));
        assertEquals("AfterHead", tb.lastTransition);
    }

    @Test
    public void testAfterBodyEndTagHtml() {
        Token t = new Token.EndTag("html");
        assertTrue(TreeBuilderState.AfterBody.process(t, tb));
        assertEquals("AfterAfterBody", tb.lastTransition);
    }

    @Test
    public void testAfterBodyStartTagHtml() {
        Token t = new Token.StartTag("html");
        assertTrue(TreeBuilderState.AfterBody.process(t, tb));
        // Should process in InBody
        assertFalse(tb.processedTokens.isEmpty());
    }

    @Test
    public void testInFramesetStartTagFrame() {
        Token t = new Token.StartTag("frame");
        assertTrue(TreeBuilderState.InFrameset.process(t, tb));
        assertNotNull(tb.insertedStart);
    }

    @Test
    public void testInFramesetEndTagFrameset() {
        tb.getStack().add(new Element(Tag.valueOf("frameset"), ""));
        Token t = new Token.EndTag("frameset");
        assertTrue(TreeBuilderState.InFrameset.process(t, tb));
        assertFalse(tb.getStack().getLast().nodeName().equals("frameset"));
    }

    @Test
    public void testInBodyStartTagAWithActiveFormatting() {
        // Simulate existing formatting element for "a"
        Element a = new Element(Tag.valueOf("a"), "");
        tb.pushActiveFormattingElements(a);
        tb.getStack().add(a);
        Token t = new Token.StartTag("a");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        // Should process end tag "a" and then insert new "a"
        assertTrue(tb.errorCalled);
        assertEquals("a", tb.insertedStart.nodeName());
    }

    @Test
    public void testInBodyStartTagFormWithExistingForm() {
        tb.formElement = new Element(Tag.valueOf("form"), "");
        Token t = new Token.StartTag("form");
        assertFalse(TreeBuilderState.InBody.process(t, tb));
        assertTrue(tb.errorCalled);
    }

    @Test
    public void testInBodyStartTagImage() {
        Token t = new Token.StartTag("image");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        // image should be renamed to img and reprocessed
        assertEquals("img", tb.insertedStart.nodeName());
    }

    @Test
    public void testInBodyEndTagPWithoutPara() {
        Token t = new Token.EndTag("p");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        // Should error and start tag p inserted then end tag p reprocessed
        assertTrue(tb.errorCalled);
        assertFalse(tb.processedTokens.isEmpty());
    }

    @Test
    public void testInBodyStartTagTable() {
        Token t = new Token.StartTag("table");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        assertEquals("InTable", tb.lastTransition);
    }

    @Test
    public void testInBodyStartTagSpecialTag() {
        Token t = new Token.StartTag("script");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        // should be forwarded to InHead
        assertFalse(tb.processedTokens.isEmpty());
    }

    @Test
    public void testInBodyEndTagForm() {
        tb.formElement = new Element(Tag.valueOf("form"), "");
        tb.getStack().add(tb.formElement);
        Token t = new Token.EndTag("form");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        assertNull(tb.formElement);
    }

    @Test
    public void testInBodyEndTagListItem() {
        tb.getStack().add(new Element(Tag.valueOf("li"), ""));
        Token t = new Token.EndTag("li");
        assertTrue(TreeBuilderState.InBody.process(t, tb));
        assertFalse(tb.getStack().getLast().nodeName().equals("li"));
    }

    @Test
    public void testInTableStartTagInputHidden() {
        Token.StartTag input = new Token.StartTag("input");
        input.attributes.put("type", "hidden");
        assertTrue(TreeBuilderState.InTable.process(input, tb));
        // input should be inserted empty
        assertNotNull(tb.insertedStart);
    }

    @Test
    public void testInTableStartTagInputNotHidden() {
        Token.StartTag input = new Token.StartTag("input");
        input.attributes.put("type", "text");
        assertTrue(TreeBuilderState.InTable.process(input, tb));
        // should go to anythingElse -> process in InBody
        assertFalse(tb.processedTokens.isEmpty());
    }

    @Test
    public void testInTableEndTagBodyReturnsFalse() {
        Token t = new Token.EndTag("body");
        assertFalse(TreeBuilderState.InTable.process(t, tb));
    }
}