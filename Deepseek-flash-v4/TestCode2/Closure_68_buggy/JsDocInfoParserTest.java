package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class JsDocInfoParserTest {

    private Config config;
    private ErrorReporter errorReporter;
    private static final String SOURCE_NAME = "test.js";

    @Before
    public void setUp() {
        Set<String> annotationNames = Sets.newHashSet(
            "param", "return", "type", "extends", "implements", "const", 
            "constructor", "deprecated", "interface", "enum", "this", "override",
            "private", "public", "protected", "suppress", "modifies", "template",
            "version", "author", "see", "lends", "meaning", "throws", "define",
            "typedef", "nosideeffects", "notypecheck", "preserve", "license",
            "export", "externs", "javadispatch", "hidden", "noalias", "noshadow",
            "nocompile", "preservetry", "implicitcast", "inheritDoc", "fileoverview",
            "desc"
        );
        Set<String> suppressionNames = Sets.newHashSet("unused", "unchecked", "deprecation");
        config = new Config(annotationNames, suppressionNames, true, LanguageMode.ECMASCRIPT3, false);
        errorReporter = NullErrorReporter.forNewRhino();
    }

    @After
    public void tearDown() {
        config = null;
        errorReporter = null;
    }

    @Test
    public void testParseEmptyComment() {
        String comment = "/** */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertFalse(parser.hasParsedJSDocInfo());
    }

    @Test
    public void testParseSimpleParam() {
        String comment = "/** @param {string} name */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasParameter("name"));
        JSTypeExpression type = info.getParameterType("name");
        assertNotNull(type);
    }

    @Test
    public void testParseParamWithoutType() {
        String comment = "/** @param name */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasParameter("name"));
        assertNull(info.getParameterType("name"));
    }

    @Test
    public void testParseReturnType() {
        String comment = "/** @return {number} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasReturnType());
        assertNotNull(info.getReturnType());
    }

    @Test
    public void testParseReturnWithoutType() {
        String comment = "/** @return */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasReturnType());
        assertNotNull(info.getReturnType());
    }

    @Test
    public void testParseTypeAnnotation() {
        String comment = "/** @type {boolean} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParseConstructor() {
        String comment = "/** @constructor */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isConstructor());
    }

    @Test
    public void testParseInterface() {
        String comment = "/** @interface */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isInterface());
    }

    @Test
    public void testParseConstructorAndInterfaceConflict() {
        String comment = "/** @constructor @interface */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isInterface());
        assertFalse(info.isConstructor());
    }

    @Test
    public void testParseEnumWithType() {
        String comment = "/** @enum {string} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getEnumParameterType());
    }

    @Test
    public void testParseEnumWithoutTypeDefaultsToNumber() {
        String comment = "/** @enum */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getEnumParameterType());
    }

    @Test
    public void testParseDeprecated() {
        String comment = "/** @deprecated Use newMethod instead. */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isDeprecated());
        assertEquals("Use newMethod instead.", info.getDeprecationReason());
    }

    @Test
    public void testParseDeprecatedWithoutReason() {
        String comment = "/** @deprecated */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isDeprecated());
        assertNull(info.getDeprecationReason());
    }

    @Test
    public void testParseOverride() {
        String comment = "/** @override */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isOverride());
    }

    @Test
    public void testParsePrivateVisibility() {
        String comment = "/** @private */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(Visibility.PRIVATE, info.getVisibility());
    }

    @Test
    public void testParseProtectedVisibility() {
        String comment = "/** @protected */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(Visibility.PROTECTED, info.getVisibility());
    }

    @Test
    public void testParsePublicVisibility() {
        String comment = "/** @public */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(Visibility.PUBLIC, info.getVisibility());
    }

    @Test
    public void testParseSuppressTag() {
        String comment = "/** @suppress {unused} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.getSuppressions().contains("unused"));
    }

    @Test
    public void testParseSuppressTagMultiple() {
        String comment = "/** @suppress {unused|deprecation} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        Set<String> suppressions = info.getSuppressions();
        assertTrue(suppressions.contains("unused"));
        assertTrue(suppressions.contains("deprecation"));
    }

    @Test
    public void testParseSuppressTagUnknownWarning() {
        String comment = "/** @suppress {unknown} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.getSuppressions().contains("unknown"));
    }

    @Test
    public void testParseModifiesTag() {
        String comment = "/** @modifies {this} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.getModifies().contains("this"));
    }

    @Test
    public void testParseTemplate() {
        String comment = "/** @template T */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasTemplateTypeName());
        assertEquals("T", info.getTemplateTypeName());
    }

    @Test
    public void testParseVersion() {
        String comment = "/** @version 1.0 */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("1.0", info.getVersion());
    }

    @Test
    public void testParseAuthor() {
        String comment = "/** @author John Doe */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(1, info.getAuthors().size());
        assertEquals("John Doe", info.getAuthors().get(0));
    }

    @Test
    public void testParseSee() {
        String comment = "/** @see MyClass */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(1, info.getReferences().size());
        assertEquals("MyClass", info.getReferences().get(0));
    }

    @Test
    public void testParseExtends() {
        String comment = "/** @extends {ParentClass} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getBaseType());
    }

    @Test
    public void testParseImplements() {
        String comment = "/** @implements {Interface} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals(1, info.getImplementedInterfaces().size());
    }

    @Test
    public void testParseLends() {
        String comment = "/** @lends {obj} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("obj", info.getLendsName());
    }

    @Test
    public void testParseThis() {
        String comment = "/** @this {Foo} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getThisType());
    }

    @Test
    public void testParseDefine() {
        String comment = "/** @define {boolean} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getDefineType());
    }

    @Test
    public void testParseTypedef() {
        String comment = "/** @typedef {Object} */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getTypedefType());
    }

    @Test
    public void testParseThrowsWithType() {
        String comment = "/** @throws {Error} if something fails */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNotNull(info.getThrowsType());
    }

    @Test
    public void testParseThrowsWithoutType() {
        String comment = "/** @throws */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertNull(info.getThrowsType());
    }

    @Test
    public void testParseFileOverview() {
        String comment = "/** @fileoverview This is a file. */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("This is a file.", info.getFileOverview());
    }

    @Test
    public void testParseDesc() {
        String comment = "/** @desc Description of the function. */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("Description of the function.", info.getDescription());
    }

    @Test
    public void testParseMeaning() {
        String comment = "/** @meaning customMeaning */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("customMeaning", info.getMeaning());
    }

    @Test
    public void testParseConst() {
        String comment = "/** @const */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isConstant());
    }

    @Test
    public void testParseExport() {
        String comment = "/** @export */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isExport());
    }

    @Test
    public void testParseExterns() {
        String comment = "/** @externs */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isExterns());
    }

    @Test
    public void testParseJavaDispatch() {
        String comment = "/** @javadispatch */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isJavaDispatch());
    }

    @Test
    public void testParseHidden() {
        String comment = "/** @hidden */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isHidden());
    }

    @Test
    public void testParseNoAlias() {
        String comment = "/** @noalias */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isNoAlias());
    }

    @Test
    public void testParseNoShadow() {
        String comment = "/** @noshadow */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isNoShadow());
    }

    @Test
    public void testParseNoCompile() {
        String comment = "/** @nocompile */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isNoCompile());
    }

    @Test
    public void testParseNoTypeCheck() {
        String comment = "/** @notypecheck */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isNoTypeCheck());
    }

    @Test
    public void testParseNoSideEffects() {
        String comment = "/** @nosideeffects */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isNoSideEffects());
    }

    @Test
    public void testParsePreserveTry() {
        String comment = "/** @preservetry */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isPreserveTry());
    }

    @Test
    public void testParseImplicitCast() {
        String comment = "/** @implicitcast */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isImplicitCast());
    }

    @Test
    public void testParseInheritDoc() {
        String comment = "/** @inheritDoc */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.isOverride());
    }

    @Test
    public void testParseParamWithOptionalBrackets() {
        String comment = "/** @param {string=} name */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasParameter("name"));
        JSTypeExpression type = info.getParameterType("name");
        assertNotNull(type);
    }

    @Test
    public void testParseParamWithBracketedName() {
        String comment = "/** @param {string} [name] */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertTrue(info.hasParameter("name"));
        JSTypeExpression type = info.getParameterType("name");
        assertNotNull(type);
    }

    @Test
    public void testParseReturnWithDescription() {
        String comment = "/** @return {number} The result count. */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("The result count.", info.getReturnDescription());
    }

    @Test
    public void testParseBlockDescription() {
        String comment = "/** This is a block description. @param {string} name */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertTrue(parser.hasParsedJSDocInfo());
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
        assertEquals("This is a block description.", info.getBlockDescription());
    }

    @Test
    public void testParseWarnsOnUnknownAnnotation() {
        String comment = "/** @unknown */";
        JsDocTokenStream stream = new JsDocTokenStream(comment);
        Comment commentNode = new Comment(comment, 1, 1, Comment.JSDOC);
        JsDocInfoParser parser = new JsDocInfoParser(stream, commentNode, SOURCE_NAME, config, errorReporter);
        assertTrue(parser.parse());
        assertFalse(parser.hasParsedJSDocInfo());
    }

    @Test
    public void testParseTypeStringWithNull() {
        Node result = JsDocInfoParser.parseTypeString("null");
        assertNotNull(result);
        assertTrue(result.isString());
        assertEquals("null", result.getString());
    }

    @Test
    public void testParseTypeStringWithUndefined() {
        Node result = JsDocInfoParser.parseTypeString("undefined");
        assertNotNull(result);
        assertTrue(result.isString());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testParseTypeStringWithStar() {
        Node result = JsDocInfoParser.parseTypeString("*");
        assertNotNull(result);
        assertEquals(Token.STAR, result.getType());
    }

    @Test
    public void testParseTypeStringWithSimpleName() {
        Node result = JsDocInfoParser.parseTypeString("string");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testParseTypeStringWithUnionType() {
        Node result = JsDocInfoParser.parseTypeString("(number|string)");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testParseTypeStringWithArrayType() {
        Node result = JsDocInfoParser.parseTypeString("Array.<number>");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("Array", result.getString());
        assertTrue(result.hasChildren());
    }

    @Test
    public void testParseTypeStringWithFunctionType() {
        Node result = JsDocInfoParser.parseTypeString("function():void");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals(Token.VOID, result.getLastChild().getType());
    }

    @Test
    public void testParseTypeStringWithRecordType() {
        Node result = JsDocInfoParser.parseTypeString("{x: number}");
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
    }

    @Test
    public void testParseTypeStringWithNullable() {
        Node result = JsDocInfoParser.parseTypeString("?number");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringWithNonNullable() {
        Node result = JsDocInfoParser.parseTypeString("!Object");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertEquals(1, result.getChildCount());
    }
}