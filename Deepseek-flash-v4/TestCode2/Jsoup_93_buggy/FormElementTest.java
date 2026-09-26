package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    private FormElement makeForm(String innerHtml) {
        return makeForm(innerHtml, "", null);
    }

    private FormElement makeForm(String innerHtml, String baseUri, String action) {
        FormElement form = new FormElement(Tag.valueOf("form"), baseUri, new Attributes());
        if (action != null) {
            form.attr("action", action);
        }
        Elements controls = Jsoup.parse(innerHtml, baseUri).select("input,select,textarea,button");
        for (Element control : controls) {
            form.addElement(control);
        }
        return form;
    }

    private void assertData(Connection.KeyVal kv, String key, String value) {
        assertEquals(key, kv.key());
        assertEquals(value, kv.value());
    }

    @Test
    public void testAddElementChainsAndUpdatesElements() {
        FormElement form = makeForm("");
        assertNotNull(form.elements());
        assertEquals(0, form.elements().size());

        Element input = Jsoup.parse("<input name='a' value='1'>").select("input").first();
        assertSame(form, form.addElement(input));
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));

        Element div = Jsoup.parse("<div name='d' value='v'></div>").select("div").first();
        form.addElement(div);
        assertEquals(2, form.elements().size());
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataFiltersDisabledEmptyNameAndUncheckedCheckbox() {
        FormElement form = makeForm(
            "<input name='a' value='1'>"
            + "<input name='' value='skip'>"
            + "<input name='d' value='disabled' disabled>"
            + "<input type='checkbox' name='c'>"
            + "<input type='checkbox' name='c2' checked>"
            + "<input type='radio' name='r' value='x' checked>"
        );

        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
        assertData(data.get(0), "a", "1");
        assertData(data.get(1), "c2", "on");
        assertData(data.get(2), "r", "x");
    }

    @Test
    public void testFormDataHandlesSelectsAndGenericControls() {
        FormElement form = makeForm(
            "<select name='s'><option value='a'>A</option><option value='b' selected>B</option></select>"
            + "<select name='s2'><option value='x'>X</option><option value='y'>Y</option></select>"
            + "<select name='s3'></select>"
            + "<textarea name='t'>Hello</textarea>"
        );

        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
        assertData(data.get(0), "s", "b");
        assertData(data.get(1), "s2", "x");
        assertData(data.get(2), "t", "Hello");
    }

    @Test
    public void testFormDataReturnsCopy() {
        FormElement form = makeForm("<input name='a' value='1'>");
        List<Connection.KeyVal> data = form.formData();
        data.clear();
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testSubmitPreparesGetRequestWithFormData() {
        FormElement form = makeForm("<input name='a' value='1'>", "http://example.com/base/", "/submit");

        Connection connection = form.submit();
        assertNotNull(connection);
        assertEquals("GET", connection.request().method().toString());
        assertEquals("http://example.com/submit", connection.request().url().toString());
        assertEquals(1, connection.request().data().size());
        assertData(connection.request().data().iterator().next(), "a", "1");
    }

    @Test
    public void testSubmitPreparesPostRequestForLowercaseMethod() {
        FormElement form = makeForm("<input name='a' value='1'>", "", "http://example.com/submit");
        form.attr("method", "post");

        Connection connection = form.submit();
        assertEquals("POST", connection.request().method().toString());
    }

    @Test
    public void testSubmitFallsBackToBaseUriWhenNoAction() {
        FormElement form = makeForm("", "http://example.com/base/", null);
        Connection connection = form.submit();
        assertEquals("http://example.com/base/", connection.request().url().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsWhenNoActionOrBaseUri() {
        FormElement form = makeForm("");
        form.submit();
    }
}