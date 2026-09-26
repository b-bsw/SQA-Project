package org.jsoup.select;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator.*;

import java.util.regex.Pattern;

public class EvaluatorTest {
    private Document doc;
    private Element root;
    private Element div1;
    private Element div2;
    private Element span1;
    private Element p1;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        root = doc.createElement("div");
        doc.appendChild(root);
        div1 = doc.createElement("div");
        div1.attr("id", "div1");
        div1.addClass("clsA");
        div1.attr("data-name", "test");
        root.appendChild(div1);
        div2 = doc.createElement("div");
        div2.attr("id", "div2");
        div2.addClass("clsB");
        div2.attr("data-name", "example");
        root.appendChild(div2);
        span1 = doc.createElement("span");
        span1.attr("id", "span1");
        span1.addClass("clsA");
        span1.text("some text");
        div2.appendChild(span1);
        p1 = doc.createElement("p");
        p1.attr("id", "p1");
        p1.text("ownText content");
        root.appendChild(p1);
    }

    @Test
    public void testTag() {
        Evaluator tagDiv = new Evaluator.Tag("div");
        assertTrue(tagDiv.matches(root, div1));
        assertTrue(tagDiv.matches(root, div2));
        assertFalse(tagDiv.matches(root, span1));
        Evaluator tagDivUpper = new Evaluator.Tag("DIV");
        assertTrue(tagDivUpper.matches(root, div1));
    }

    @Test
    public void testTagEndsWith() {
        Evaluator endsDiv = new Evaluator.TagEndsWith("div");
        assertTrue(endsDiv.matches(root, div1));
        assertTrue(endsDiv.matches(root, div2));
        assertFalse(endsDiv.matches(root, span1));
    }

    @Test
    public void testId() {
        Evaluator idDiv1 = new Evaluator.Id("div1");
        assertTrue(idDiv1.matches(root, div1));
        assertFalse(idDiv1.matches(root, div2));
        Evaluator idSpan = new Evaluator.Id("span1");
        assertTrue(idSpan.matches(root, span1));
    }

    @Test
    public void testClass() {
        Evaluator classA = new Evaluator.Class("clsA");
        assertTrue(classA.matches(root, div1));
        assertTrue(classA.matches(root, span1));
        assertFalse(classA.matches(root, div2));
    }

    @Test
    public void testAttribute() {
        Evaluator attrName = new Evaluator.Attribute("data-name");
        assertTrue(attrName.matches(root, div1));
        assertTrue(attrName.matches(root, div2));
        assertFalse(attrName.matches(root, span1));
    }

    @Test
    public void testAttributeStarting() {
        Evaluator startsData = new Evaluator.AttributeStarting("data-");
        assertTrue(startsData.matches(root, div1));
        assertTrue(startsData.matches(root, div2));
        assertFalse(startsData.matches(root, span1));
        Element empty = doc.createElement("empty");
        root.appendChild(empty);
        assertFalse(startsData.matches(root, empty));
        Element oneAttr = doc.createElement("one");
        oneAttr.attr("data-x", "val");
        root.appendChild(oneAttr);
        assertTrue(startsData.matches(root, oneAttr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeStartingEmpty() {
        new Evaluator.AttributeStarting("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeStartingNull() {
        new Evaluator.AttributeStarting(null);
    }

    @Test
    public void testAttributeWithValue() {
        Evaluator attrVal = new Evaluator.AttributeWithValue("data-name", "test");
        assertTrue(attrVal.matches(root, div1));
        assertFalse(attrVal.matches(root, div2));
        Evaluator attrValCase = new Evaluator.AttributeWithValue("id", "DIV1");
        assertTrue(attrValCase.matches(root, div1));
    }

    @Test
    public void testAttributeWithValueNot() {
        Evaluator notVal = new Evaluator.AttributeWithValueNot("data-name", "test");
        assertFalse(notVal.matches(root, div1));
        assertTrue(notVal.matches(root, div2));
        assertTrue(notVal.matches(root, span1));
    }

    @Test
    public void testAttributeWithValueStarting() {
        Evaluator starts = new Evaluator.AttributeWithValueStarting("data-name", "te");
        assertTrue(starts.matches(root, div1));
        assertFalse(starts.matches(root, div2));
    }

    @Test
    public void testAttributeWithValueEnding() {
        Evaluator ends = new Evaluator.AttributeWithValueEnding("data-name", "st");
        assertTrue(ends.matches(root, div1));
        assertFalse(ends.matches(root, div2));
    }

    @Test
    public void testAttributeWithValueContaining() {
        Evaluator contains = new Evaluator.AttributeWithValueContaining("data-name", "es");
        assertTrue(contains.matches(root, div1));
        assertTrue(contains.matches(root, div2));
        assertFalse(contains.matches(root, span1));
    }

    @Test
    public void testAttributeWithValueMatching() {
        Pattern p = Pattern.compile("te.*");
        Evaluator match = new Evaluator.AttributeWithValueMatching("data-name", p);
        assertTrue(match.matches(root, div1));
        assertFalse(match.matches(root, div2));
        Evaluator noMatch = new Evaluator.AttributeWithValueMatching("data-name", Pattern.compile("xyz"));
        assertFalse(noMatch.matches(root, div1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPairEmptyKey() {
        new Evaluator.AttributeWithValue("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPairEmptyValue() {
        new Evaluator.AttributeWithValue("key", "");
    }

    @Test
    public void testAllElements() {
        Evaluator all = new Evaluator.AllElements();
        assertTrue(all.matches(root, root));
        assertTrue(all.matches(root, div1));
    }

    @Test
    public void testIndexLessThan() {
        Evaluator lt1 = new Evaluator.IndexLessThan(1);
        assertTrue(lt1.matches(root, div1));
        assertFalse(lt1.matches(root, div2));
        assertFalse(lt1.matches(root, p1));
        assertFalse(lt1.matches(root, root));
    }

    @Test
    public void testIndexGreaterThan() {
        Evaluator gt1 = new Evaluator.IndexGreaterThan(1);
        assertFalse(gt1.matches(root, div1));
        assertFalse(gt1.matches(root, div2));
        assertTrue(gt1.matches(root, p1));
    }

    @Test
    public void testIndexEquals() {
        Evaluator eq1 = new Evaluator.IndexEquals(1);
        assertFalse(eq1.matches(root, div1));
        assertTrue(eq1.matches(root, div2));
        assertFalse(eq1.matches(root, p1));
    }

    @Test
    public void testIsFirstChild() {
        Evaluator firstChild = new Evaluator.IsFirstChild();
        assertTrue(firstChild.matches(root, div1));
        assertFalse(firstChild.matches(root, div2));
        assertFalse(firstChild.matches(root, root));
    }

    @Test
    public void testIsLastChild() {
        Evaluator lastChild = new Evaluator.IsLastChild();
        assertFalse(lastChild.matches(root, div1));
        assertFalse(lastChild.matches(root, div2));
        assertTrue(lastChild.matches(root, p1));
        assertFalse(lastChild.matches(root, root));
    }

    @Test
    public void testIsFirstOfType() {
        Evaluator firstOfType = new Evaluator.IsFirstOfType();
        assertTrue(firstOfType.matches(root, div1));
        assertFalse(firstOfType.matches(root, div2));
        assertTrue(firstOfType.matches(root, span1));
        assertTrue(firstOfType.matches(root, p1));
    }

    @Test
    public void testIsLastOfType() {
        Evaluator lastOfType = new Evaluator.IsLastOfType();
        assertFalse(lastOfType.matches(root, div1));
        assertTrue(lastOfType.matches(root, div2));
        assertTrue(lastOfType.matches(root, span1));
        assertTrue(lastOfType.matches(root, p1));
    }

    @Test
    public void testIsRoot() {
        Evaluator isRoot = new Evaluator.IsRoot();
        assertTrue(isRoot.matches(root, root));
        assertFalse(isRoot.matches(root, div1));
    }

    @Test
    public void testIsOnlyChild() {
        Evaluator onlyChild = new Evaluator.IsOnlyChild();
        assertTrue(onlyChild.matches(root, span1));
        assertFalse(onlyChild.matches(root, div1));
        assertFalse(onlyChild.matches(root, root));
    }

    @Test
    public void testIsOnlyOfType() {
        Evaluator onlyOfType = new Evaluator.IsOnlyOfType();
        assertTrue(onlyOfType.matches(root, span1));
        assertFalse(onlyOfType.matches(root, div1));
        assertTrue(onlyOfType.matches(root, p1));
    }

    @Test
    public void testIsEmpty() {
        Evaluator empty = new Evaluator.IsEmpty();
        Element emptyEl = doc.createElement("empty");
        root.appendChild(emptyEl);
        assertTrue(empty.matches(root, emptyEl));
        Element commentEl = doc.createElement("comment");
        commentEl.appendChild(new Comment("test comment"));
        root.appendChild(commentEl);
        assertTrue(empty.matches(root, commentEl));
        assertFalse(empty.matches(root, div1));
    }

    @Test
    public void testContainsText() {
        Evaluator contains = new Evaluator.ContainsText("some");
        assertTrue(contains.matches(root, span1));
        assertFalse(contains.matches(root, div1));
        Evaluator containsCase = new Evaluator.ContainsText("SOME");
        assertTrue(containsCase.matches(root, span1));
    }

    @Test
    public void testContainsOwnText() {
        Evaluator containsOwn = new Evaluator.ContainsOwnText("ownText");
        assertTrue(containsOwn.matches(root, p1));
        assertFalse(containsOwn.matches(root, span1));
    }

    @Test
    public void testMatches() {
        Evaluator matches = new Evaluator.Matches(Pattern.compile("some.*"));
        assertTrue(matches.matches(root, span1));
        assertFalse(matches.matches(root, div1));
        Evaluator noMatch = new Evaluator.Matches(Pattern.compile("nonexistent"));
        assertFalse(noMatch.matches(root, span1));
    }

    @Test
    public void testMatchesOwn() {
        Evaluator matchesOwn = new Evaluator.MatchesOwn(Pattern.compile("own.*"));
        assertTrue(matchesOwn.matches(root, p1));
        assertFalse(matchesOwn.matches(root, span1));
    }

    @Test
    public void testIsNthChild() {
        Evaluator nth = new Evaluator.IsNthChild(2, 1);
        assertTrue(nth.matches(root, div1));
        assertFalse(nth.matches(root, div2));
        assertTrue(nth.matches(root, p1));
        Evaluator nthConst = new Evaluator.IsNthChild(0, 2);
        assertFalse(nthConst.matches(root, div1));
        assertTrue(nthConst.matches(root, div2));
        assertFalse(nthConst.matches(root, p1));
    }

    @Test
    public void testIsNthLastChild() {
        Evaluator nthLast = new Evaluator.IsNthLastChild(2, 1);
        assertTrue(nthLast.matches(root, p1));
        assertFalse(nthLast.matches(root, div2));
        assertTrue(nthLast.matches(root, div1));
        Evaluator nthLastConst = new Evaluator.IsNthLastChild(0, 1);
        assertTrue(nthLastConst.matches(root, p1));
        assertFalse(nthLastConst.matches(root, div2));
        assertFalse(nthLastConst.matches(root, div1));
    }

    @Test
    public void testIsNthOfType() {
        Evaluator nthType = new Evaluator.IsNthOfType(1, 2);
        assertFalse(nthType.matches(root, div1));
        assertTrue(nthType.matches(root, div2));
        assertFalse(nthType.matches(root, p1));
        Evaluator nthTypeConst = new Evaluator.IsNthOfType(0, 1);
        assertTrue(nthTypeConst.matches(root, div1));
        assertFalse(nthTypeConst.matches(root, div2));
        assertTrue(nthTypeConst.matches(root, p1));
    }
}