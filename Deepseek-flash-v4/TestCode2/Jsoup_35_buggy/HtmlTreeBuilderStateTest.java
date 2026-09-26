package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.*;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {
    private static class StubTreeBuilder extends HtmlTreeBuilder {
        public HtmlTreeBuilderState currentState;
        public Document doc;
        public Element headElement;
        public Element formElement;
        public boolean framesetOk;
        public boolean fosterInserts;
        public boolean fragmentParsing;
        public LinkedList<Element> stack;
        public DescendableLinkedList<Element> formattingElements;
        public LinkedList<Token.Character> pendingTableCharacters;
        public HtmlTreeBuilderState originalState;
        
        public StubTreeBuilder() {
            doc = new Document("");
            stack = new LinkedList<>();
            formattingElements = new DescendableLinkedList<>();
            pendingTableCharacters = new LinkedList<>();
            currentState = null;
            headElement = null;
            formElement = null;
            framesetOk = true;
            fosterInserts = false;
            fragmentParsing = false;
            originalState = null;
        }
        
        @Override
        public boolean process(Token token) {
            return currentState.process(token, this);
        }
        
        @Override
        public void transition(HtmlTreeBuilderState state) {
            currentState = state;
        }
        
        @Override
        public Document getDocument() { return doc; }
        
        @Override
        public String getBaseUri() { return ""; }
        
        @Override
        public void insert(Token.Comment commentToken) {
            // stub
        }
        
        @Override
        public void insert(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.name()), "");
            stack.add(el);
        }
        
        @Override
        public Element insert(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.name()), "");
            stack.add(el);
            return el;
        }
        
        @Override
        public Element insert(String tagName) {
            Element el = new Element(Tag.valueOf(tagName), "");
            stack.add(el);
            return el;
        }
        
        @Override
        public void insert(Token.Character characterToken) {
            // stub
        }
        
        @Override
        public Element insertEmpty(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.name()), "");
            stack.add(el);
            return el;
        }
        
        @Override
        public void setHeadElement(Element head) { headElement = head; }
        
        @Override
        public Element getHeadElement() { return headElement; }
        
        @Override
        public void setFormElement(Element form) { formElement = form; }
        
        @Override
        public Element getFormElement() { return formElement; }
        
        @Override
        public boolean framesetOk() { return framesetOk; }
        
        @Override
        public void framesetOk(boolean ok) { framesetOk = ok; }
        
        @Override
        public void setFosterInserts(boolean inserts) { fosterInserts = inserts; }
        
        @Override
        public LinkedList<Element> getStack() { return stack; }
        
        @Override
        public Element currentElement() { return stack.isEmpty() ? null : stack.getLast(); }
        
        @Override
        public void push(Element el) { stack.add(el); }
        
        @Override
        public void pop() { if (!stack.isEmpty()) stack.removeLast(); }
        
        @Override
        public void removeFromStack(Element el) { stack.remove(el); }
        
        @Override
        public void removeFromStack(Element el) { stack.remove(el); }
        
        @Override
        public void insertOnStackAfter(Element after, Element el) {
            int idx = stack.indexOf(after);
            if (idx >= 0) stack.add(idx + 1, el);
        }
        
        @Override
        public Element aboveOnStack(Element el) {
            int idx = stack.indexOf(el);
            if (idx > 0) return stack.get(idx - 1);
            return null;
        }
        
        @Override
        public boolean onStack(Element el) { return stack.contains(el); }
        
        @Override
        public void replaceOnStack(Element old, Element neu) {
            int idx = stack.indexOf(old);
            if (idx >= 0) stack.set(idx, neu);
        }
        
        @Override
        public boolean isSpecial(Element el) { return false; }
        
        @Override
        public boolean inScope(String target) { return false; }
        
        @Override
        public boolean inScope(String[] targets) { return false; }
        
        @Override
        public boolean inButtonScope(String target) { return false; }
        
        @Override
        public boolean inListItemScope(String target) { return false; }
        
        @Override
        public boolean inTableScope(String target) { return false; }
        
        @Override
        public boolean inSelectScope(String target) { return false; }
        
        @Override
        public void generateImpliedEndTags() {}
        
        @Override
        public void generateImpliedEndTags(String exclude) {}
        
        @Override
        public void popStackToClose(String elName) {
            while (!stack.isEmpty() && !stack.getLast().nodeName().equals(elName))
                stack.removeLast();
            if (!stack.isEmpty()) stack.removeLast();
        }
        
        @Override
        public void popStackToClose(String... elNames) {
            while (!stack.isEmpty()) {
                String last = stack.getLast().nodeName();
                boolean match = false;
                for (String n : elNames) if (last.equals(n)) { match = true; break; }
                if (match) break;
                stack.removeLast();
            }
            if (!stack.isEmpty()) stack.removeLast();
        }
        
        @Override
        public void clearStackToTableContext() {
            while (!stack.isEmpty() && !stack.getLast().nodeName().equals("table"))
                stack.removeLast();
        }
        
        @Override
        public void clearStackToTableBodyContext() {
            while (!stack.isEmpty() && !stack.getLast().nodeName().equals("tbody") && 
                   !stack.getLast().nodeName().equals("tfoot") && !stack.getLast().nodeName().equals("thead"))
                stack.removeLast();
        }
        
        @Override
        public void clearStackToTableRowContext() {
            while (!stack.isEmpty() && !stack.getLast().nodeName().equals("tr"))
                stack.removeLast();
        }
        
        @Override
        public void reconstructFormattingElements() {}
        
        @Override
        public void pushActiveFormattingElements(Element el) {
            formattingElements.add(el);
        }
        
        @Override
        public void removeFromActiveFormattingElements(Element el) {
            formattingElements.remove(el);
        }
        
        @Override
        public Element getActiveFormattingElement(String nodeName) {
            for (Element e : formattingElements)
                if (e.nodeName().equals(nodeName)) return e;
            return null;
        }
        
        @Override
        public boolean isInActiveFormattingElements(Element el) {
            return formattingElements.contains(el);
        }
        
        @Override
        public void replaceActiveFormattingElement(Element old, Element neu) {
            int idx = formattingElements.indexOf(old);
            if (idx >= 0) formattingElements.set(idx, neu);
        }
        
        @Override
        public void insertMarkerToFormattingElements() {
            formattingElements.add(null);
        }
        
        @Override
        public void clearFormattingElementsToLastMarker() {
            while (!formattingElements.isEmpty() && formattingElements.getLast() != null)
                formattingElements.removeLast();
            if (!formattingElements.isEmpty()) formattingElements.removeLast();
        }
        
        @Override
        public void markInsertionMode() {}
        
        @Override
        public void resetInsertionMode() {}
        
        @Override
        public boolean isFragmentParsing() { return fragmentParsing; }
        
        @Override
        public HtmlTreeBuilderState state() { return currentState; }
        
        @Override
        public HtmlTreeBuilderState originalState() { return originalState; }
        
        @Override
        public void newPendingTableCharacters() { pendingTableCharacters.clear(); }
        
        @Override
        public LinkedList<Token.Character> getPendingTableCharacters() { return pendingTableCharacters; }
        
        @Override
        public void maybeSetBaseUri(Element el) {}
        
        @Override
        public void error(HtmlTreeBuilderState state) {}
        
        @Override
        public void insertForm(Token.StartTag startTag, boolean bind) {
            Element form = new Element(Tag.valueOf("form"), "");
            stack.add(form);
            if (bind) formElement = form;
        }
        
        @Override
        public void insertInFosterParent(Node node) {}
        
        @Override
        public Element getFromStack(String nodeName) {
            for (Element e : stack) if (e.nodeName().equals(nodeName)) return e;
            return null;
        }
        
        @Override
        public void setOriginalState() {}
        
        @Override
        public TreeBuilder getTreeBuilder() { return this; }
    }
    
    private StubTreeBuilder tb;
    private HtmlTreeBuilderState state;
    
    @Before
    public void setUp() {
        tb = new StubTreeBuilder();
    }
    
    // Helper to create tokens
    private Token.Character whitespaceToken() {
        return new Token.Character(" ");
    }
    
    private Token.Character nonWhitespaceToken() {
        return new Token.Character("a");
    }
    
    private Token.Character nullStringToken() {
        return new Token.Character("\u0000");
    }
    
    private Token.Comment commentToken() {
        return new Token.Comment("test");
    }
    
    private Token.Doctype doctypeToken(boolean forceQuirks) {
        Token.Doctype dt = new Token.Doctype();
        dt.setName("html");
        dt.setPublicIdentifier("");
        dt.setSystemIdentifier("");
        if (forceQuirks) dt.setForceQuirks(true);
        return dt;
    }
    
    private Token.StartTag startTag(String name) {
        return new Token.StartTag(name);
    }
    
    private Token.EndTag endTag(String name) {
        return new Token.EndTag(name);
    }
    
    private Token.EOF eofToken() {
        return new Token.EOF();
    }
    
    // Test Initial state
    @Test
    public void testInitialWhitespace() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        assertTrue(state.process(whitespaceToken(), tb));
    }
    
    @Test
    public void testInitialComment() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        assertTrue(state.process(commentToken(), tb));
    }
    
    @Test
    public void testInitialDoctypeNoQuirks() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        Token.Doctype dt = doctypeToken(false);
        assertTrue(state.process(dt, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.currentState);
    }
    
    @Test
    public void testInitialDoctypeForceQuirks() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        Token.Doctype dt = doctypeToken(true);
        assertTrue(state.process(dt, tb));
        assertEquals(Document.QuirksMode.quirks, tb.doc.quirksMode());
    }
    
    @Test
    public void testInitialOther() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        // Process a start tag, which should transition to BeforeHtml and reprocess
        assertTrue(state.process(startTag("p"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.currentState);
    }
    
    // Test BeforeHtml state
    @Test
    public void testBeforeHtmlDoctype() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertFalse(state.process(doctypeToken(false), tb));
    }
    
    @Test
    public void testBeforeHtmlComment() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertTrue(state.process(commentToken(), tb));
    }
    
    @Test
    public void testBeforeHtmlWhitespace() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertTrue(state.process(whitespaceToken(), tb));
    }
    
    @Test
    public void testBeforeHtmlStartTagHtml() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertTrue(state.process(startTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.currentState);
    }
    
    @Test
    public void testBeforeHtmlEndTagValid() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertTrue(state.process(endTag("br"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.currentState);
    }
    
    @Test
    public void testBeforeHtmlEndTagInvalid() {
        state = HtmlTreeBuilderState.BeforeHtml;
        tb.currentState = state;
        assertFalse(state.process(endTag("div"), tb));
    }
    
    // Test InHead state (partial)
    @Test
    public void testInHeadWhitespace() {
        state = HtmlTreeBuilderState.InHead;
        tb.currentState = state;
        assertTrue(state.process(whitespaceToken(), tb));
    }
    
    @Test
    public void testInHeadStartTagTitle() {
        state = HtmlTreeBuilderState.InHead;
        tb.currentState = state;
        // Should handle title via handleRcData, which transitions to Text
        assertTrue(state.process(startTag("title"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.currentState);
    }
    
    @Test
    public void testInHeadEndTagHead() {
        state = HtmlTreeBuilderState.InHead;
        tb.currentState = state;
        tb.stack.add(new Element(Tag.valueOf("head"), ""));
        assertTrue(state.process(endTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.currentState);
    }
    
    // Test InBody state (a few key branches)
    @Test
    public void testInBodyCharacterNull() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        assertFalse(state.process(nullStringToken(), tb));
    }
    
    @Test
    public void testInBodyCharacterWhitespace() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        assertTrue(state.process(whitespaceToken(), tb));
    }
    
    @Test
    public void testInBodyStartTagHtml() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        tb.stack.add(new Element(Tag.valueOf("html"), ""));
        assertTrue(state.process(startTag("html"), tb));
    }
    
    @Test
    public void testInBodyStartTagFormWithFormElement() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        tb.formElement = new Element(Tag.valueOf("form"), "");
        assertFalse(state.process(startTag("form"), tb));
    }
    
    @Test
    public void testInBodyStartTagLi() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        // Simulate stack with an li element
        Element li = new Element(Tag.valueOf("li"), "");
        tb.stack.add(li);
        assertTrue(state.process(startTag("li"), tb));
    }
    
    @Test
    public void testInBodyEndTagBodyNotInScope() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        // Not in scope will return false
        assertFalse(state.process(endTag("body"), tb));
    }
    
    @Test
    public void testInBodyEndTagPNotInButtonScope() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        assertTrue(state.process(endTag("p"), tb));
    }
    
    // Test Text state
    @Test
    public void testTextCharacter() {
        state = HtmlTreeBuilderState.Text;
        tb.currentState = state;
        assertTrue(state.process(whitespaceToken(), tb));
    }
    
    @Test
    public void testTextEOF() {
        state = HtmlTreeBuilderState.Text;
        tb.currentState = state;
        tb.originalState = HtmlTreeBuilderState.InBody;
        tb.stack.add(new Element(Tag.valueOf("div"), ""));
        assertTrue(state.process(eofToken(), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.currentState);
    }
    
    @Test
    public void testTextEndTag() {
        state = HtmlTreeBuilderState.Text;
        tb.currentState = state;
        tb.originalState = HtmlTreeBuilderState.InBody;
        tb.stack.add(new Element(Tag.valueOf("title"), ""));
        assertTrue(state.process(endTag("title"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.currentState);
    }
    
    // Test InTable state
    @Test
    public void testInTableDoctype() {
        state = HtmlTreeBuilderState.InTable;
        tb.currentState = state;
        assertFalse(state.process(doctypeToken(false), tb));
    }
    
    @Test
    public void testInTableStartTagCaption() {
        state = HtmlTreeBuilderState.InTable;
        tb.currentState = state;
        tb.stack.add(new Element(Tag.valueOf("table"), ""));
        assertTrue(state.process(startTag("caption"), tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.currentState);
    }
    
    @Test
    public void testInTableEndTagTableNotInScope() {
        state = HtmlTreeBuilderState.InTable;
        tb.currentState = state;
        assertFalse(state.process(endTag("table"), tb));
    }
    
    // Test isWhitespace helper (private but tested via process)
    @Test
    public void testIsWhitespaceWithNonWhitespace() {
        state = HtmlTreeBuilderState.Initial;
        tb.currentState = state;
        // Whitespace case already tested, now non-whitespace should go to else branch
        // For Initial, a non-whitespace non-comment non-doctype causes transition
        tb.currentState = state;
        assertTrue(state.process(nonWhitespaceToken(), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.currentState);
    }
    
    // Additional test for InBody endTag with formatting elements (a)
    @Test
    public void testInBodyEndTagA() {
        state = HtmlTreeBuilderState.InBody;
        tb.currentState = state;
        Element a = new Element(Tag.valueOf("a"), "");
        tb.stack.add(a);
        tb.formattingElements.add(a);
        assertTrue(state.process(endTag("a"), tb));
    }
    
    // Test InSelect
    @Test
    public void testInSelectCharacterNull() {
        state = HtmlTreeBuilderState.InSelect;
        tb.currentState = state;
        assertFalse(state.process(nullStringToken(), tb));
    }
    
    @Test
    public void testInSelectEndTagSelectNotInScope() {
        state = HtmlTreeBuilderState.InSelect;
        tb.currentState = state;
        assertFalse(state.process(endTag("select"), tb));
    }
}