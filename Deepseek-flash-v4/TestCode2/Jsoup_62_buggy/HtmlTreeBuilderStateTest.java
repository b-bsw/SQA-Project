package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {
    // --- Stub classes ---
    static class Token {
        enum TokenType { Character, Comment, Doctype, StartTag, EndTag, EOF }
        TokenType type;
        String data;
        String normalName;
        boolean forceQuirks;
        String pubSysKey, publicId, systemId;
        Attributes attributes = new Attributes();

        static Token character(String data) {
            Token t = new Token();
            t.type = TokenType.Character;
            t.data = data;
            return t;
        }
        static Token comment(String data) {
            Token t = new Token();
            t.type = TokenType.Comment;
            t.data = data;
            return t;
        }
        static Token doctype(String name, boolean forceQuirks) {
            Token t = new Token();
            t.type = TokenType.Doctype;
            t.normalName = name;
            t.forceQuirks = forceQuirks;
            return t;
        }
        static Token startTag(String name) {
            Token t = new Token();
            t.type = TokenType.StartTag;
            t.normalName = name;
            return t;
        }
        static Token endTag(String name) {
            Token t = new Token();
            t.type = TokenType.EndTag;
            t.normalName = name;
            return t;
        }
        static Token eof() {
            Token t = new Token();
            t.type = TokenType.EOF;
            return t;
        }
        boolean isCharacter() { return type == TokenType.Character; }
        boolean isComment() { return type == TokenType.Comment; }
        boolean isDoctype() { return type == TokenType.Doctype; }
        boolean isStartTag() { return type == TokenType.StartTag; }
        boolean isEndTag() { return type == TokenType.EndTag; }
        boolean isEOF() { return type == TokenType.EOF; }
        Token asCharacter() { return this; }
        Token asComment() { return this; }
        Token asDoctype() { return this; }
        Token asStartTag() { return this; }
        Token asEndTag() { return this; }
    }

    static class Attributes implements Iterable<Attribute> {
        List<Attribute> attrs = new ArrayList<>();
        void put(Attribute attr) { attrs.add(attr); }
        String get(String key) {
            for (Attribute a : attrs) if (a.getKey().equals(key)) return a.getValue();
            return null;
        }
        boolean hasKey(String key) { return get(key) != null; }
        public java.util.Iterator<Attribute> iterator() { return attrs.iterator(); }
    }

    static class Attribute {
        String key, value;
        Attribute(String k, String v) { key = k; value = v; }
        String getKey() { return key; }
        String getValue() { return value; }
    }

    static class Element {
        String tagName;
        Element parent;
        List<Node> childNodes = new ArrayList<>();
        Attributes attributes = new Attributes();
        Tag tag;
        String baseUri;
        Element(Tag tag, String baseUri) {
            this.tag = tag;
            this.tagName = tag.getName();
            this.baseUri = baseUri;
        }
        String nodeName() { return tagName; }
        boolean hasAttr(String key) { return attributes.hasKey(key); }
        void attr(String key, String value) { attributes.put(new Attribute(key, value)); }
        void appendChild(Node child) { childNodes.add(child); }
        Node[] childNodes() { return childNodes.toArray(new Node[0]); }
        int childNodeSize() { return childNodes.size(); }
        Element parent() { return parent; }
        void remove() { if (parent != null) parent.childNodes.remove(this); }
        void setParent(Element p) { this.parent = p; }
    }

    static class Node {
        Element element;
        Node(Element e) { this.element = e; }
    }

    static class Tag {
        String name;
        static Tag valueOf(String name, ParseSettings settings) { return new Tag(name); }
        Tag(String n) { name = n; }
        String getName() { return name; }
    }

    enum ParseSettings { preserveCase }

    static class Document {
        enum QuirksMode { quirks, noQuirks, limitedQuirks }
        QuirksMode quirksMode = QuirksMode.noQuirks;
        void quirksMode(QuirksMode m) { this.quirksMode = m; }
        QuirksMode quirksMode() { return quirksMode; }
        void appendChild(DocumentType dt) {}
    }

    static class DocumentType {
        DocumentType(String name, String pubSysKey, String publicId, String systemId, String baseUri) {}
    }

    static class TreeBuilder {}

    static class HtmlTreeBuilder extends TreeBuilder {
        Document doc = new Document();
        ParseSettings settings;
        Element headElement;
        Element formElement;
        boolean fosterInserts;
        boolean framesetOk = true;
        ArrayList<Element> stack = new ArrayList<>();
        ArrayList<Element> formattingElements = new ArrayList<>();
        List<String> pendingTableCharacters = new ArrayList<>();
        HtmlTreeBuilderState state;
        HtmlTreeBuilderState originalState;
        boolean fragmentParsing;
        Tokeniser tokeniser = new Tokeniser();

        HtmlTreeBuilder() {
            Element html = new Element(new Tag("html"), "");
            stack.add(html);
        }

        void insert(Token t) {}
        void insert(Token.Character c) {}
        void insert(Token.Comment c) {}
        void insert(Token.StartTag start) {}
        void insert(Token.EndTag end) {}
        Element insertEmpty(Token.StartTag start) { return new Element(new Tag(start.normalName), ""); }
        void insertStartTag(String name) {}
        void processStartTag(String name) {}
        void insertForm(Token.StartTag start, boolean connect) {}
        Element getFormElement() { return formElement; }
        void setFormElement(Element e) { formElement = e; }
        Element getHeadElement() { return headElement; }
        void setHeadElement(Element e) { headElement = e; }
        Document getDocument() { return doc; }
        boolean process(Token t) { return state.process(t, this); }
        boolean process(Token t, HtmlTreeBuilderState s) { return s.process(t, this); }
        void transition(HtmlTreeBuilderState s) { state = s; }
        void error(HtmlTreeBuilderState s) {}
        void pop() { if (!stack.isEmpty()) stack.remove(stack.size()-1); }
        void push(Element e) { stack.add(e); }
        Element currentElement() { return stack.isEmpty() ? null : stack.get(stack.size()-1); }
        void removeFromStack(Element e) { stack.remove(e); }
        void insertOnStackAfter(Element after, Element e) {}
        Element getFromStack(String name) {
            for (int i=stack.size()-1; i>=0; i--) if (stack.get(i).nodeName().equals(name)) return stack.get(i);
            return null;
        }
        Element aboveOnStack(Element e) {
            int idx = stack.indexOf(e);
            if (idx > 0) return stack.get(idx-1);
            return null;
        }
        ArrayList<Element> getStack() { return stack; }
        void generateImpliedEndTags() {}
        void generateImpliedEndTags(String except) {}
        void popStackToClose(String name) {
            for (int i=stack.size()-1; i>=0; i--) {
                if (stack.get(i).nodeName().equals(name)) { stack.subList(i, stack.size()).clear(); break; }
            }
        }
        void popStackToBefore(String name) {
            for (int i=stack.size()-1; i>=0; i--) {
                if (stack.get(i).nodeName().equals(name)) break;
                stack.remove(i);
            }
        }
        void clearStackToTableContext() {}
        void clearStackToTableBodyContext() {}
        void clearStackToTableRowContext() {}
        void reconstructFormattingElements() {}
        void resetInsertionMode() {}
        boolean inScope(String name) { return false; }
        boolean inScope(String[] names) { return false; }
        boolean inListItemScope(String name) { return false; }
        boolean inButtonScope(String name) { return false; }
        boolean inTableScope(String name) { return false; }
        boolean inSelectScope(String name) { return false; }
        boolean isSpecial(Element el) { return false; }
        void framesetOk(boolean ok) { framesetOk = ok; }
        boolean framesetOk() { return framesetOk; }
        void setFosterInserts(boolean b) { fosterInserts = b; }
        void maybeSetBaseUri(Element el) {}
        void markInsertionMode() {}
        HtmlTreeBuilderState originalState() { return originalState; }
        boolean isFragmentParsing() { return fragmentParsing; }
        void newPendingTableCharacters() { pendingTableCharacters = new ArrayList<>(); }
        List<String> getPendingTableCharacters() { return pendingTableCharacters; }
        void pushActiveFormattingElements(Element e) { formattingElements.add(e); }
        Element getActiveFormattingElement(String name) {
            for (Element e : formattingElements) if (e.nodeName().equals(name)) return e;
            return null;
        }
        void removeFromActiveFormattingElements(Element e) { formattingElements.remove(e); }
        void replaceActiveFormattingElement(Element old, Element ne) {
            int idx = formattingElements.indexOf(old);
            if (idx>=0) formattingElements.set(idx, ne);
        }
        void replaceOnStack(Element old, Element ne) {
            int idx = stack.indexOf(old);
            if (idx>=0) stack.set(idx, ne);
        }
        void insertMarkerToFormattingElements() { formattingElements.add(null); }
        void clearFormattingElementsToLastMarker() {
            while (!formattingElements.isEmpty() && formattingElements.get(formattingElements.size()-1) != null)
                formattingElements.remove(formattingElements.size()-1);
            if (!formattingElements.isEmpty()) formattingElements.remove(formattingElements.size()-1);
        }
        boolean isInActiveFormattingElements(Element e) { return formattingElements.contains(e); }
        boolean onStack(Element e) { return stack.contains(e); }

        class Tokeniser {
            void transition(TokeniserState s) {}
        }
        enum TokeniserState { ScriptData, Rcdata, Rawtext, PLAINTEXT }
    }

    // --- Fixture ---
    HtmlTreeBuilder tb;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        tb.state = HtmlTreeBuilderState.Initial;
    }

    // --- Initial state ---
    @Test
    public void testInitialWhitespace() {
        assertTrue(HtmlTreeBuilderState.Initial.process(Token.character(" "), tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state);
    }

    @Test
    public void testInitialComment() {
        assertTrue(HtmlTreeBuilderState.Initial.process(Token.comment("x"), tb));
    }

    @Test
    public void testInitialDoctype() {
        assertTrue(HtmlTreeBuilderState.Initial.process(Token.doctype("html", false), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state);
    }

    @Test
    public void testInitialDoctypeForceQuirks() {
        assertTrue(HtmlTreeBuilderState.Initial.process(Token.doctype("html", true), tb));
        assertEquals(Document.QuirksMode.quirks, tb.doc.quirksMode());
    }

    @Test
    public void testInitialOtherToken() {
        assertTrue(HtmlTreeBuilderState.Initial.process(Token.startTag("div"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state);
    }

    // --- BeforeHtml state ---
    @Test
    public void testBeforeHtmlDoctype() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(Token.doctype("x", false), tb));
    }

    @Test
    public void testBeforeHtmlComment() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(Token.comment("c"), tb));
    }

    @Test
    public void testBeforeHtmlWhitespace() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(Token.character(" "), tb));
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(Token.startTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state);
    }

    @Test
    public void testBeforeHtmlEndTagAllowed() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(Token.endTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state);
    }

    @Test
    public void testBeforeHtmlEndTagDisallowed() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(Token.endTag("div"), tb));
    }

    @Test
    public void testBeforeHtmlAnythingElse() {
        tb.state = HtmlTreeBuilderState.BeforeHtml;
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(Token.startTag("p"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state);
    }

    // --- InHead state ---
    @Test
    public void testInHeadWhitespace() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.character(" "), tb));
    }

    @Test
    public void testInHeadComment() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.comment("c"), tb));
    }

    @Test
    public void testInHeadDoctype() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertFalse(HtmlTreeBuilderState.InHead.process(Token.doctype("x", false), tb));
    }

    @Test
    public void testInHeadStartTagHtml() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.startTag("html"), tb));
    }

    @Test
    public void testInHeadStartTagBase() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.startTag("base"), tb));
    }

    @Test
    public void testInHeadStartTagMeta() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.startTag("meta"), tb));
    }

    @Test
    public void testInHeadStartTagTitle() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.startTag("title"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state);
    }

    @Test
    public void testInHeadStartTagScript() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.startTag("script"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state);
    }

    @Test
    public void testInHeadEndTagHead() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.endTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state);
    }

    @Test
    public void testInHeadEndTagBody() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertTrue(HtmlTreeBuilderState.InHead.process(Token.endTag("body"), tb));
    }

    @Test
    public void testInHeadEndTagOther() {
        tb.state = HtmlTreeBuilderState.InHead;
        assertFalse(HtmlTreeBuilderState.InHead.process(Token.endTag("div"), tb));
    }

    // --- InBody state ---
    @Test
    public void testInBodyCharacterNull() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertFalse(HtmlTreeBuilderState.InBody.process(Token.character("\u0000"), tb));
    }

    @Test
    public void testInBodyCharacterWhitespaceFramesetOk() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.framesetOk = true;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.character(" "), tb));
        assertTrue(tb.framesetOk());
    }

    @Test
    public void testInBodyCharacterNonWhitespace() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.character("a"), tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyStartTagA() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("a"), tb));
        assertNotNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyStartTagSpan() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("span"), tb));
    }

    @Test
    public void testInBodyStartTagP() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("p"), tb));
    }

    @Test
    public void testInBodyStartTagLi() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("li"), tb));
    }

    @Test
    public void testInBodyStartTagForm() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("form"), tb));
    }

    @Test
    public void testInBodyStartTagTable() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.startTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state);
    }

    @Test
    public void testInBodyEndTagBodyInScope() {
        HtmlTreeBuilder customTb = new HtmlTreeBuilder() {
            @Override boolean inScope(String name) { return name.equals("body"); }
        };
        customTb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.endTag("body"), customTb));
        assertEquals(HtmlTreeBuilderState.AfterBody, customTb.state);
    }

    @Test
    public void testInBodyEndTagHtml() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.InBody.process(Token.endTag("html"), tb));
    }

    @Test
    public void testInBodyEndTagFormNoForm() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.setFormElement(null);
        assertFalse(HtmlTreeBuilderState.InBody.process(Token.endTag("form"), tb));
    }

    @Test
    public void testInBodyEndTagBr() {
        tb.state = HtmlTreeBuilderState.InBody;
        assertFalse(HtmlTreeBuilderState.InBody.process(Token.endTag("br"), tb));
    }

    // --- InTable state ---
    @Test
    public void testInTableCharacter() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.character("a"), tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state);
    }

    @Test
    public void testInTableComment() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.comment("c"), tb));
    }

    @Test
    public void testInTableDoctype() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertFalse(HtmlTreeBuilderState.InTable.process(Token.doctype("x", false), tb));
    }

    @Test
    public void testInTableStartTagCaption() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.startTag("caption"), tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state);
    }

    @Test
    public void testInTableStartTagColgroup() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.startTag("colgroup"), tb));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state);
    }

    @Test
    public void testInTableStartTagTbody() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.startTag("tbody"), tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state);
    }

    @Test
    public void testInTableEndTagTableNotInScope() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertFalse(HtmlTreeBuilderState.InTable.process(Token.endTag("table"), tb));
    }

    @Test
    public void testInTableEndTagTableInScope() {
        HtmlTreeBuilder customTb = new HtmlTreeBuilder() {
            @Override boolean inTableScope(String name) { return name.equals("table"); }
        };
        customTb.state = HtmlTreeBuilderState.InTable;
        assertTrue(HtmlTreeBuilderState.InTable.process(Token.endTag("table"), customTb));
    }

    @Test
    public void testInTableEndTagInvalid() {
        tb.state = HtmlTreeBuilderState.InTable;
        assertFalse(HtmlTreeBuilderState.InTable.process(Token.endTag("caption"), tb));
    }

    // --- InTableText state ---
    @Test
    public void testInTableTextNullCharacter() {
        tb.state = HtmlTreeBuilderState.InTableText;
        assertFalse(HtmlTreeBuilderState.InTableText.process(Token.character("\u0000"), tb));
    }

    // --- AfterBody state ---
    @Test
    public void testAfterBodyWhitespace() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertTrue(HtmlTreeBuilderState.AfterBody.process(Token.character(" "), tb));
    }

    @Test
    public void testAfterBodyComment() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertTrue(HtmlTreeBuilderState.AfterBody.process(Token.comment("c"), tb));
    }

    @Test
    public void testAfterBodyDoctype() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertFalse(HtmlTreeBuilderState.AfterBody.process(Token.doctype("x", false), tb));
    }

    @Test
    public void testAfterBodyStartTagHtml() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertTrue(HtmlTreeBuilderState.AfterBody.process(Token.startTag("html"), tb));
    }

    @Test
    public void testAfterBodyEndTagHtml() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertTrue(HtmlTreeBuilderState.AfterBody.process(Token.endTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state);
    }

    @Test
    public void testAfterBodyEOF() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        assertTrue(HtmlTreeBuilderState.AfterBody.process(Token.eof(), tb));
    }

    // --- Text state ---
    @Test
    public void testTextCharacter() {
        tb.state = HtmlTreeBuilderState.Text;
        assertTrue(HtmlTreeBuilderState.Text.process(Token.character("a"), tb));
    }

    @Test
    public void testTextEOF() {
        tb.state = HtmlTreeBuilderState.Text;
        tb.originalState = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.Text.process(Token.eof(), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state);
    }

    @Test
    public void testTextEndTag() {
        tb.state = HtmlTreeBuilderState.Text;
        tb.originalState = HtmlTreeBuilderState.InBody;
        assertTrue(HtmlTreeBuilderState.Text.process(Token.endTag("x"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state);
    }

    // --- InHeadNoscript state ---
    @Test
    public void testInHeadNoscriptDoctype() {
        tb.state = HtmlTreeBuilderState.InHeadNoscript;
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(Token.doctype("x", false), tb));
    }

    @Test
    public void testInHeadNoscriptStartTagHtml() {
        tb.state = HtmlTreeBuilderState.InHeadNoscript;
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(Token.startTag("html"), tb));
    }

    // --- isWhitespace helper ---
    @Test
    public void testIsWhitespaceStringTrue() {
        assertTrue(HtmlTreeBuilderState.isWhitespace(" "));
        assertTrue(HtmlTreeBuilderState.isWhitespace("\t\n\r"));
        assertTrue(HtmlTreeBuilderState.isWhitespace("   "));
    }

    @Test
    public void testIsWhitespaceStringFalse() {
        assertFalse(HtmlTreeBuilderState.isWhitespace(" a"));
        assertFalse(HtmlTreeBuilderState.isWhitespace("a "));
    }

    @Test
    public void testIsWhitespaceStringEmpty() {
        assertTrue(HtmlTreeBuilderState.isWhitespace(""));
    }

    @Test
    public void testIsWhitespaceTokenCharacterWhitespace() {
        assertTrue(HtmlTreeBuilderState.isWhitespace(Token.character(" ")));
    }

    @Test
    public void testIsWhitespaceTokenCharacterNonWhitespace() {
        assertFalse(HtmlTreeBuilderState.isWhitespace(Token.character("a")));
    }

    @Test
    public void testIsWhitespaceTokenNonCharacter() {
        assertFalse(HtmlTreeBuilderState.isWhitespace(Token.startTag("div")));
    }
}