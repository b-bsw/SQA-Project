package org.jsoup.parser;
import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import java.util.ArrayList;
import java.util.List;
import java.io.Reader;
import java.io.StringReader;

public class HtmlTreeBuilderStateTest {

    static class StubHtmlTreeBuilder extends HtmlTreeBuilder {
        HtmlTreeBuilderState state;
        Document document = new Document("");
        Element headElement;
        Element formElement;
        ArrayList<Element> stack = new ArrayList<>();
        ArrayList<Element> activeFormattingElements = new ArrayList<>();
        boolean fosterInserts;
        boolean framesetOk = true;
        ArrayList<String> pendingTableCharacters = new ArrayList<>();
        String baseUri = "";
        ParseSettings settings = ParseSettings.preserveCase;
        Tokeniser tokeniser = new Tokeniser(null, null) {
            @Override public void transition(TokeniserState s) {}
            @Override public void advanceTransition(TokeniserState s) {}
        };
        Reader reader = new StringReader("");
        List<String> errors = new ArrayList<>();

        StubHtmlTreeBuilder() {
            Element html = new Element(Tag.valueOf("html", settings), baseUri);
            stack.add(html);
            document.appendChild(html);
        }

        @Override public void transition(HtmlTreeBuilderState s) { this.state = s; }
        @Override public HtmlTreeBuilderState state() { return state; }
        @Override public Document getDocument() { return document; }
        @Override public Element getHeadElement() { return headElement; }
        @Override public void setHeadElement(Element e) { headElement = e; }
        @Override public Element getFormElement() { return formElement; }
        @Override public void setFormElement(Element e) { formElement = e; }
        @Override public ArrayList<Element> getStack() { return stack; }
        @Override public Element currentElement() { return stack.isEmpty()?null:stack.get(stack.size()-1); }
        @Override public void push(Element e) { stack.add(e); }
        @Override public Element pop() { return stack.isEmpty()?null:stack.remove(stack.size()-1); }
        @Override public void removeFromStack(Element e) { stack.remove(e); }
        @Override public boolean onStack(Element e) { return stack.contains(e); }
        @Override public Element aboveOnStack(Element e) { int i = stack.indexOf(e); return i>0?stack.get(i-1):null; }
        @Override public void insertOnStackAfter(Element after, Element toInsert) {
            int i = stack.indexOf(after);
            if (i>=0) stack.add(i+1, toInsert);
        }
        @Override public void insert(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.normalName(), settings), baseUri);
            for (Attribute attr : startTag.getAttributes()) {
                el.attributes().put(attr);
            }
            push(el);
        }
        @Override public Element insertEmpty(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.normalName(), settings), baseUri);
            for (Attribute attr : startTag.getAttributes()) {
                el.attributes().put(attr);
            }
            push(el);
            pop();
            return el;
        }
        @Override public void insert(Token.Character c) {
            Element current = currentElement();
            if (current != null) {
                current.appendChild(new TextNode(c.getData(), baseUri));
            }
        }
        @Override public void insert(Token.Comment commentToken) {
            Element current = currentElement();
            Comment c = new Comment(commentToken.getData(), baseUri);
            if (current != null) {
                current.appendChild(c);
            } else {
                document.appendChild(c);
            }
        }
        @Override public boolean process(Token token) {
            return state.process(token, this);
        }
        @Override public boolean process(Token token, HtmlTreeBuilderState s) {
            return s.process(token, this);
        }
        @Override public void error(HtmlTreeBuilderState s) {
            errors.add("Error at " + s);
        }
        @Override public void reconstructFormattingElements() {}
        @Override public void generateImpliedEndTags() {}
        @Override public void generateImpliedEndTags(String name) {}
        @Override public void popStackToClose(String name) {
            while (!stack.isEmpty() && !currentElement().nodeName().equals(name)) {
                pop();
            }
            if (!stack.isEmpty() && currentElement().nodeName().equals(name)) {
                pop();
            }
        }
        @Override public boolean inScope(String targetName) {
            for (int i = stack.size()-1; i >=0; i--) {
                Element el = stack.get(i);
                String name = el.nodeName();
                if (name.equals(targetName)) return true;
                if (isSpecial(el)) break;
            }
            return false;
        }
        @Override public boolean inButtonScope(String targetName) {
            for (int i = stack.size()-1; i >=0; i--) {
                Element el = stack.get(i);
                String name = el.nodeName();
                if (name.equals(targetName)) return true;
                if (name.equals("button")) return false;
                if (isSpecial(el)) break;
            }
            return false;
        }
        @Override public boolean inTableScope(String targetName) {
            for (int i = stack.size()-1; i >=0; i--) {
                Element el = stack.get(i);
                if (el.nodeName().equals(targetName)) return true;
                if (el.nodeName().equals("table") || el.nodeName().equals("template")) break;
            }
            return false;
        }
        @Override public boolean inSelectScope(String targetName) {
            for (int i = stack.size()-1; i >=0; i--) {
                Element el = stack.get(i);
                if (el.nodeName().equals(targetName)) return true;
                if (!StringUtil.inSorted(el.nodeName(), "optgroup", "option")) break;
            }
            return false;
        }
        @Override public boolean isSpecial(Element el) {
            String name = el.nodeName();
            return StringUtil.inSorted(name, "address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp");
        }
        @Override public void newPendingTableCharacters() { pendingTableCharacters.clear(); }
        @Override public ArrayList<String> getPendingTableCharacters() { return pendingTableCharacters; }
        @Override public boolean isFragmentParsing() { return false; }
        @Override public void setFosterInserts(boolean f) { fosterInserts = f; }
        @Override public boolean framesetOk() { return framesetOk; }
        @Override public void framesetOk(boolean f) { framesetOk = f; }
        @Override public String getBaseUri() { return baseUri; }
        @Override public void pushActiveFormattingElements(Element e) { activeFormattingElements.add(e); }
        @Override public void removeFromActiveFormattingElements(Element e) { activeFormattingElements.remove(e); }
        @Override public Element getActiveFormattingElement(String name) {
            for (int i = activeFormattingElements.size()-1; i>=0; i--) {
                Element e = activeFormattingElements.get(i);
                if (e.nodeName().equals(name)) return e;
            }
            return null;
        }
        @Override public void insertMarkerToFormattingElements() { activeFormattingElements.add(null); }
        @Override public void clearFormattingElementsToLastMarker() {
            while (!activeFormattingElements.isEmpty()) {
                Element last = activeFormattingElements.remove(activeFormattingElements.size()-1);
                if (last == null) break;
            }
        }
        @Override public boolean isInActiveFormattingElements(Element e) { return activeFormattingElements.contains(e); }
        @Override public void replaceActiveFormattingElement(Element old, Element newE) {
            int i = activeFormattingElements.indexOf(old);
            if (i>=0) activeFormattingElements.set(i, newE);
        }
        @Override public void replaceOnStack(Element old, Element newE) {
            int i = stack.indexOf(old);
            if (i>=0) stack.set(i, newE);
        }
        @Override public void resetInsertionMode() {}
        @Override public Element getFromStack(String name) {
            for (int i = stack.size()-1; i>=0; i--) {
                if (stack.get(i).nodeName().equals(name)) return stack.get(i);
            }
            return null;
        }
        @Override public void removeFromActiveFormattingElements(Element e) { activeFormattingElements.remove(e); }
        @Override public void processStartTag(String name) {
            Token.StartTag start = new Token.StartTag();
            start.name(name);
            process(start);
        }
        @Override public void processEndTag(String name) {
            Token.EndTag end = new Token.EndTag();
            end.name(name);
            process(end);
        }
        @Override public void insertForm(Token.StartTag startTag, boolean b) {
            Element form = new Element(Tag.valueOf("form", settings), baseUri);
            push(form);
            setFormElement(form);
        }
        @Override public void maybeSetBaseUri(Element el) {}
        @Override public void markInsertionMode() {}
        @Override public void clearStackToTableContext() {}
        @Override public void clearStackToTableBodyContext() {}
        @Override public void clearStackToTableRowContext() {}
        @Override public void read() {}
        @Override public void setHeadElement(Element e) { headElement = e; }
        @Override public Element getHeadElement() { return headElement; }
    }

    private StubHtmlTreeBuilder stub;

    @org.junit.Before
    public void setUp() {
        stub = new StubHtmlTreeBuilder();
    }

    // ---- Initial State ----
    @Test
    public void testInitialWhitespace() {
        stub.state = HtmlTreeBuilderState.Initial;
        Token.Character ws = new Token.Character();
        ws.data(" ");
        assertTrue(stub.state.process(ws, stub));
        assertEquals(HtmlTreeBuilderState.Initial, stub.state);
        assertTrue(stub.getDocument().childNodes().isEmpty());
    }

    @Test
    public void testInitialComment() {
        stub.state = HtmlTreeBuilderState.Initial;
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        assertTrue(stub.state.process(comment, stub));
        assertEquals(HtmlTreeBuilderState.Initial, stub.state);
        assertNotNull(stub.getDocument().childNodes().get(0));
        assertTrue(stub.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInitialDoctypeNormal() {
        stub.state = HtmlTreeBuilderState.Initial;
        Token.Doctype dt = new Token.Doctype();
        dt.name("html");
        dt.pubSysKey = null;
        dt.forceQuirks = false;
        assertTrue(stub.state.process(dt, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, stub.state);
        assertTrue(stub.getDocument().childNodes().get(0) instanceof DocumentType);
        assertEquals(Document.QuirksMode.noQuirks, stub.getDocument().quirksMode());
    }

    @Test
    public void testInitialDoctypeForceQuirks() {
        stub.state = HtmlTreeBuilderState.Initial;
        Token.Doctype dt = new Token.Doctype();
        dt.name("html");
        dt.forceQuirks = true;
        assertTrue(stub.state.process(dt, stub));
        assertEquals(Document.QuirksMode.quirks, stub.getDocument().quirksMode());
    }

    // ---- BeforeHtml State ----
    @Test
    public void testBeforeHtmlWhitespace() {
        stub.state = HtmlTreeBuilderState.BeforeHtml;
        Token.Character ws = new Token.Character().data(" ");
        assertTrue(stub.state.process(ws, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, stub.state);
    }

    @Test
    public void testBeforeHtmlComment() {
        stub.state = HtmlTreeBuilderState.BeforeHtml;
        Token.Comment comment = new Token.Comment().data("x");
        assertTrue(stub.state.process(comment, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, stub.state);
    }

    @Test
    public void testBeforeHtmlDoctype() {
        stub.state = HtmlTreeBuilderState.BeforeHtml;
        Token.Doctype dt = new Token.Doctype().name("x");
        assertFalse(stub.state.process(dt, stub));
        assertEquals(1, stub.errors.size());
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        stub.state = HtmlTreeBuilderState.BeforeHtml;
        Token.StartTag start = new Token.StartTag().name("html");
        assertTrue(stub.state.process(start, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHead, stub.state);
        assertEquals("html", stub.currentElement().nodeName());
    }

    // ---- BeforeHead State ----
    @Test
    public void testBeforeHeadWhitespace() {
        stub.state = HtmlTreeBuilderState.BeforeHead;
        Token.Character ws = new Token.Character().data(" ");
        assertTrue(stub.state.process(ws, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHead, stub.state);
    }

    @Test
    public void testBeforeHeadStartTagHtml() {
        stub.state = HtmlTreeBuilderState.BeforeHead;
        Token.StartTag start = new Token.StartTag().name("html");
        assertTrue(stub.state.process(start, stub));
        assertEquals(HtmlTreeBuilderState.BeforeHead, stub.state);
    }

    @Test
    public void testBeforeHeadStartTagHead() {
        stub.state = HtmlTreeBuilderState.BeforeHead;
        Token.StartTag start = new Token.StartTag().name("head");
        assertTrue(stub.state.process(start, stub));
        assertEquals(HtmlTreeBuilderState.InHead, stub.state);
        assertNotNull(stub.getHeadElement());
    }

    @Test
    public void testBeforeHeadEndTagHead() {
        stub.state = HtmlTreeBuilderState.BeforeHead;
        Token.EndTag end = new Token.EndTag().name("head");
        assertTrue(stub.state.process(end, stub));
        // should have processed startTag head then process endTag head recursively
        // check state after recursion: after processEndTag head -> InHead endTag head -> AfterHead
        assertEquals(HtmlTreeBuilderState.AfterHead, stub.state);
    }

    @Test
    public void testBeforeHeadOtherEndTag() {
        stub.state = HtmlTreeBuilderState.BeforeHead;
        Token.EndTag end = new Token.EndTag().name("span");
        assertFalse(stub.state.process(end, stub));
        assertEquals(1, stub.errors.size());
    }

    // ---- InHead State ----
    @Test
    public void testInHeadWhitespace() {
        stub.state = HtmlTreeBuilderState.InHead;
        Token.Character ws = new Token.Character().data(" ");
        assertTrue(stub.state.process(ws, stub));
        assertEquals(HtmlTreeBuilderState.InHead, stub.state);
    }

    @Test
    public void testInHeadStartTagMeta() {
        stub.state = HtmlTreeBuilderState.InHead;
        Token.StartTag meta = new Token.StartTag().name("meta").attr("name", "description");
        assertTrue(stub.state.process(meta, stub));
        assertEquals(HtmlTreeBuilderState.InHead, stub.state);
    }

    @Test
    public void testInHeadEndTagHead() {
        stub.state = HtmlTreeBuilderState.InHead;
        Token.EndTag end = new Token.EndTag().name("head");
        assertTrue(stub.state.process(end, stub));
        assertEquals(HtmlTreeBuilderState.AfterHead, stub.state);
    }

    @Test
    public void testInHeadEndTagBody() {
        stub.state = HtmlTreeBuilderState.InHead;
        Token.EndTag end = new Token.EndTag().name("body");
        assertTrue(stub.state.process(end, stub));
        assertEquals(HtmlTreeBuilderState.AfterHead, stub.state);
    }

    @Test
    public void testInHeadStartTagHead() {
        stub.state = HtmlTreeBuilderState.InHead;
        Token.StartTag head = new Token.StartTag().name("head");
        assertFalse(stub.state.process(head, stub));
        assertEquals(1, stub.errors.size());
    }

    // ---- InBody State ----
    @Test
    public void testInBodyCharacterWhitespace() {
        stub.state = HtmlTreeBuilderState.InBody;
        stub.framesetOk = true;
        Token.Character ws = new Token.Character().data(" ");
        assertTrue(stub.state.process(ws, stub));
        assertEquals(HtmlTreeBuilderState.InBody, stub.state);
        assertTrue(stub.framesetOk());
    }

    @Test
    public void testInBodyCharacterNonWhitespace() {
        stub.state = HtmlTreeBuilderState.InBody;
        stub.framesetOk = true;
        Token.Character c = new Token.Character().data("x");
        assertTrue(stub.state.process(c, stub));
        assertFalse(stub.framesetOk());
    }

    @Test
    public void testInBodyStartTagP() {
        stub.state = HtmlTreeBuilderState.InBody;
        // ensure p is in button scope so that processEndTag p is called before insert
        Element p = new Element(Tag.valueOf("p", ParseSettings.preserveCase), "base");
        stub.push(p);
        stub.pushActiveFormattingElements(p); // not required but okay
        Token.StartTag start = new Token.StartTag().name("p");
        assertTrue(stub.state.process(start, stub));
        // p should be popped then new p inserted
        assertTrue(stub.currentElement().nodeName().equals("p"));
    }

    @Test
    public void testInBodyStartTagFormExisting() {
        stub.state = HtmlTreeBuilderState.InBody;
        stub.setFormElement(new Element(Tag.valueOf("form", ParseSettings.preserveCase), ""));
        Token.StartTag form = new Token.StartTag().name("form");
        assertFalse(stub.state.process(form, stub));
        assertEquals(1, stub.errors.size());
    }

    @Test
    public void testInBodyStartTagFormNoExisting() {
        stub.state = HtmlTreeBuilderState.InBody;
        Token.StartTag form = new Token.StartTag().name("form");
        assertTrue(stub.state.process(form, stub));
        assertNotNull(stub.getFormElement());
    }

    @Test
    public void testInBodyStartTagTable() {
        stub.state = HtmlTreeBuilderState.InBody;
        Token.StartTag table = new Token.StartTag().name("table");
        assertTrue(stub.state.process(table, stub));
        assertEquals(HtmlTreeBuilderState.InTable, stub.state);
    }

    @Test
    public void testInBodyEndTagBodyInScope() {
        stub.state = HtmlTreeBuilderState.InBody;
        // ensure body is in scope
        Element body = new Element(Tag.valueOf("body", ParseSettings.preserveCase), "");
        stub.push(body);
        Token.EndTag end = new Token.EndTag().name("body");
        assertTrue(stub.state.process(end, stub));
        assertEquals(HtmlTreeBuilderState.AfterBody, stub.state);
    }

    @Test
    public void testInBodyEndTagPNotInScope() {
        stub.state = HtmlTreeBuilderState.InBody;
        Token.EndTag end = new Token.EndTag().name("p");
        assertTrue(stub.state.process(end, stub));
        // should have processed startTag p then process endTag p again -> eventually p inserted and closed
        assertTrue(stub.currentElement().nodeName().equals("p") || stub.currentElement().nodeName().equals("html"));
    }

    // ---- Text State ----
    @Test
    public void testTextCharacter() {
        stub.state = HtmlTreeBuilderState.Text;
        Token.Character c = new Token.Character().data("text");
        assertTrue(stub.state.process(c, stub));
        assertEquals(HtmlTreeBuilderState.Text, stub.state);
    }

    @Test
    public void testTextEndTag() {
        stub.state = HtmlTreeBuilderState.Text;
        stub.originalState = HtmlTreeBuilderState.InHead;
        Token.EndTag end = new Token.EndTag().name("script");
        assertTrue(stub.state.process(end, stub));
        assertEquals(HtmlTreeBuilderState.InHead, stub.state);
    }

    @Test
    public void testTextEOF() {
        stub.state = HtmlTreeBuilderState.Text;
        stub.originalState = HtmlTreeBuilderState.InHead;
        Token.EOF eof = new Token.EOF();
        assertTrue(stub.state.process(eof, stub));
        assertEquals(HtmlTreeBuilderState.InHead, stub.state);
        assertEquals(1, stub.errors.size());
    }

    // ---- InTable State ----
    @Test
    public void testInTableStartTagCaption() {
        stub.state = HtmlTreeBuilderState.InTable;
        Token.StartTag caption = new Token.StartTag().name("caption");
        assertTrue(stub.state.process(caption, stub));
        assertEquals(HtmlTreeBuilderState.InCaption, stub.state);
    }

    @Test
    public void testInTableEndTagTableInScope() {
        stub.state = HtmlTreeBuilderState.InTable;
        // push table to stack for inTableScope to succeed
        Element table = new Element(Tag.valueOf("table", ParseSettings.preserveCase), "");
        stub.push(table);
        Token.EndTag end = new Token.EndTag().name("table");
        assertTrue(stub.state.process(end, stub));
        // after pop, resetInsertionMode -> should be InBody
        assertEquals(HtmlTreeBuilderState.InBody, stub.state);
    }

    @Test
    public void testInTableEndTagBody() {
        stub.state = HtmlTreeBuilderState.InTable;
        Token.EndTag end = new Token.EndTag().name("body");
        assertFalse(stub.state.process(end, stub));
        assertEquals(1, stub.errors.size());
    }

    @Test
    public void testInTableStartTagInputHidden() {
        stub.state = HtmlTreeBuilderState.InTable;
        Token.StartTag input = new Token.StartTag().name("input")
            .attr("type", "hidden");
        assertTrue(stub.state.process(input, stub));
        assertEquals(HtmlTreeBuilderState.InTable, stub.state);
    }

    @Test
    public void testInTableCharacter() {
        stub.state = HtmlTreeBuilderState.InTable;
        Token.Character c = new Token.Character().data(" ");
        assertTrue(stub.state.process(c, stub));
        assertEquals(HtmlTreeBuilderState.InTableText, stub.state);
    }

    // ---- InSelect State ----
    @Test
    public void testInSelectCharacter() {
        stub.state = HtmlTreeBuilderState.InSelect;
        Token.Character c = new Token.Character().data("a");
        assertTrue(stub.state.process(c, stub));
        assertEquals(HtmlTreeBuilderState.InSelect, stub.state);
    }

    @Test
    public void testInSelectStartTagOption() {
        stub.state = HtmlTreeBuilderState.InSelect;
        Token.StartTag option = new Token.StartTag().name("option");
        assertTrue(stub.state.process(option, stub));
        assertEquals("option", stub.currentElement().nodeName());
    }

    @Test
    public void testInSelectStartTagSelect() {
        stub.state = HtmlTreeBuilderState.InSelect;
        // make sure select is in scope so processEndTag("select") works
        Element select = new Element(Tag.valueOf("select", ParseSettings.preserveCase), "");
        stub.push(select);
        Token.StartTag start = new Token.StartTag().name("select");
        assertTrue(stub.state.process(start, stub));
        assertEquals(HtmlTreeBuilderState.InBody, stub.state); // after resetInsertionMode
    }

    @Test
    public void testInSelectEndTagOption() {
        stub.state = HtmlTreeBuilderState.InSelect;
        Element option = new Element(Tag.valueOf("option", ParseSettings.preserveCase), "");
        stub.push(option);
        Token.EndTag end = new Token.EndTag().name("option");
        assertTrue(stub.state.process(end, stub));
        assertFalse(stub.currentElement().nodeName().equals("option"));
    }

    @Test
    public void testInSelectEndTagSelect() {
        stub.state = HtmlTreeBuilderState.InSelect;
        Element select = new Element(Tag.valueOf("select", ParseSettings.preserveCase), "");
        stub.push(select);
        Token.EndTag end = new Token.EndTag().name("select");
        assertTrue(stub.state.process(end, stub));
        assertEquals(HtmlTreeBuilderState.InBody, stub.state);
    }

    @Test
    public void testInSelectStartTagInput() {
        stub.state = HtmlTreeBuilderState.InSelect;
        Element select = new Element(Tag.valueOf("select", ParseSettings.preserveCase), "");
        stub.push(select);
        Token.StartTag input = new Token.StartTag().name("input");
        assertTrue(stub.state.process(input, stub));
        assertEquals(1, stub.errors.size());
        assertEquals(HtmlTreeBuilderState.InBody, stub.state);
    }
}