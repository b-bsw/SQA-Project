package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import static org.junit.Assert.*;

public class FormElementTest {

    private static final String BASE_URI = "http://example.com";
    private FormElement form;

    @Before
    public void setUp() {
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        form = new FormElement(tag, BASE_URI, attrs);
    }

    @Test
    public void testElementsInitiallyEmpty() {
        assertTrue("elements should be empty initially", form.elements().isEmpty());
    }

    @Test
    public void testAddElement() {
        Element input = new Element(Tag.valueOf("input"), "", new Attributes());
        input.attr("name", "test");
        input.val("value");
        FormElement returned = form.addElement(input);
        assertSame("addElement should return this", form, returned);
        assertEquals("elements should contain added element", 1, form.elements().size());
        assertSame("element should be the one added", input, form.elements().get(0));
    }

    @Test
    public void testSubmitGetByDefault() {
        FormElement f = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        f.attr("action", "/submit");
        Connection con = f.submit();
        assertNotNull("connection should not be null", con);
        assertEquals("method should be GET", Connection.Method.GET, con.method());
        assertEquals("url should be resolved", "http://example.com/submit", con.url().toString());
    }

    @Test
    public void testSubmitNoActionUsesBaseUri() {
        FormElement f = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        Connection con = f.submit();
        assertEquals("should use baseUri as action", BASE_URI, con.url().toString());
        assertEquals("method should be GET", Connection.Method.GET, con.method());
    }

    @Test
    public void testSubmitPost() {
        FormElement f = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        f.attr("action", "/submit");
        f.attr("method", "POST");
        Connection con = f.submit();
        assertEquals("method should be POST", Connection.Method.POST, con.method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsOnMissingAction() {
        FormElement f = new FormElement(Tag.valueOf("form"), null, new Attributes());
        f.submit();
    }

    @Test
    public void testFormDataNormalInput() {
        Element input = new Element(Tag.valueOf("input"), "", new Attributes());
        input.attr("name", "username");
        input.val("john");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john", data.get(0).value());
    }

    @Test
    public void testFormDataSkipsIfNameEmpty() {
        Element input = new Element(Tag.valueOf("input"), "", new Attributes());
        input.attr("name", "");
        input.val("val");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertTrue("data should be empty when name is empty", data.isEmpty());
    }

    @Test
    public void testFormDataSkipsNonSubmittable() {
        Element div = new Element(Tag.valueOf("div"), "", new Attributes());
        div.attr("name", "test");
        div.val("value");
        form.addElement(div);
        List<Connection.KeyVal> data = form.formData();
        assertTrue("div should not be submittable", data.isEmpty());
    }

    @Test
    public void testFormDataCheckboxChecked() {
        Element checkbox = new Element(Tag.valueOf("input"), "", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "agree");
        checkbox.attr("checked", "");
        checkbox.val("yes");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("agree", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxUnchecked() {
        Element checkbox = new Element(Tag.valueOf("input"), "", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "agree");
        checkbox.val("yes");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertTrue("unchecked checkbox should be omitted", data.isEmpty());
    }

    @Test
    public void testFormDataRadioChecked() {
        Element radio = new Element(Tag.valueOf("input"), "", new Attributes());
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("checked", "");
        radio.val("male");
        form.addElement(radio);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithSelected() {
        Element select = new Element(Tag.valueOf("select"), "", new Attributes());
        select.attr("name", "color");
        Element opt1 = new Element(Tag.valueOf("option"), "", new Attributes());
        opt1.attr("value", "red");
        select.appendChild(opt1);
        Element opt2 = new Element(Tag.valueOf("option"), "", new Attributes());
        opt2.attr("value", "blue");
        opt2.attr("selected", "");
        select.appendChild(opt2);
        Element opt3 = new Element(Tag.valueOf("option"), "", new Attributes());
        opt3.attr("value", "green");
        select.appendChild(opt3);
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("blue", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithoutSelected() {
        Element select = new Element(Tag.valueOf("select"), "", new Attributes());
        select.attr("name", "color");
        Element opt1 = new Element(Tag.valueOf("option"), "", new Attributes());
        opt1.attr("value", "red");
        select.appendChild(opt1);
        Element opt2 = new Element(Tag.valueOf("option"), "", new Attributes());
        opt2.attr("value", "blue");
        select.appendChild(opt2);
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("red", data.get(0).value());
    }

    @Test
    public void testFormDataMultipleElements() {
        Element input1 = new Element(Tag.valueOf("input"), "", new Attributes());
        input1.attr("name", "a");
        input1.val("1");
        form.addElement(input1);
        Element input2 = new Element(Tag.valueOf("input"), "", new Attributes());
        input2.attr("name", "b");
        input2.val("2");
        form.addElement(input2);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("a", data.get(0).key());
        assertEquals("1", data.get(0).value());
        assertEquals("b", data.get(1).key());
        assertEquals("2", data.get(1).value());
    }

    @Test
    public void testEquals() {
        assertFalse("should not equal null", form.equals(null));
        assertTrue("should equal itself", form.equals(form));
        Attributes attrs = new Attributes();
        attrs.put("id", "form1");
        FormElement other = new FormElement(Tag.valueOf("form"), BASE_URI, attrs);
        assertFalse("different attributes should not be equal", form.equals(other));
    }
}