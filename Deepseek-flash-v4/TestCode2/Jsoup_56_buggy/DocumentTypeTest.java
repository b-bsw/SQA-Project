package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.junit.Test;

public class DocumentTypeTest {

    @Test
    public void testNodeNameAndAttributes() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "base");
        assertEquals("#doctype", doctype.nodeName());
        assertEquals("html", doctype.attr("name"));
        assertEquals("pub", doctype.attr("publicId"));
        assertEquals("sys", doctype.attr("systemId"));
    }

    @Test
    public void testHtml5DoctypeLowercaseWithName() throws Exception {
        assertEquals("<!doctype html>",
                render(new DocumentType("html", null, null, "base"), Syntax.html));
    }

    @Test
    public void testBlankAttributesProduceHtml5Doctype() throws Exception {
        DocumentType doctype = new DocumentType(null, "", null, "base");
        assertEquals("<!doctype>", render(doctype, Syntax.html));
    }

    @Test
    public void testXmlSyntaxUsesUppercaseDoctype() throws Exception {
        assertEquals("<!DOCTYPE html>",
                render(new DocumentType("html", null, null, "base"), Syntax.xml));
    }

    @Test
    public void testSystemIdIsRendered() throws Exception {
        assertEquals("<!DOCTYPE html \"about:legacy-compat\">",
                render(new DocumentType("html", null, "about:legacy-compat", "base"), Syntax.html));
    }

    @Test
    public void testPublicAndSystemIdsAreRenderedTogether() throws Exception {
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">",
                render(new DocumentType("html", "pub", "sys", "base"), Syntax.html));
    }

    @Test
    public void testOuterHtmlTailAppendsNothing() throws Exception {
        DocumentType doctype = new DocumentType("html", null, null, "base");
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        StringBuilder sb = new StringBuilder("x");
        doctype.outerHtmlTail(sb, 0, out);
        assertEquals("x", sb.toString());
    }

    @Test(expected = IOException.class)
    public void testOuterHtmlHeadPropagatesIOException() throws Exception {
        DocumentType doctype = new DocumentType("html", null, null, "base");
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);

        Appendable failing = new Appendable() {
            @Override
            public Appendable append(CharSequence csq) throws IOException {
                throw new IOException("boom");
            }

            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new IOException("boom");
            }

            @Override
            public Appendable append(char c) throws IOException {
                throw new IOException("boom");
            }
        };

        doctype.outerHtmlHead(failing, 0, out);
    }

    private String render(DocumentType doctype, Syntax syntax) throws Exception {
        OutputSettings out = new OutputSettings();
        out.syntax(syntax);
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, out);
        return sb.toString();
    }
}