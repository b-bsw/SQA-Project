package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class IRFactoryTest {
    private static final String SOURCE_NAME = "test.js";
    private static final String SOURCE_CODE = "var x = 1;";
    private Config config;
    private ErrorReporter errorReporter;
    private boolean errorOccurred;
    private int errorLine;
    private String errorMessage;

    @Before
    public void setUp() {
        config = new Config(true, false, false, false);
        errorOccurred = false;
        errorLine = 0;
        errorMessage = "";
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
            }

            @Override
            public void error(String message, String sourceName, int line, String sourceLine, int lineOffset) {
                errorOccurred = true;
                errorLine = line;
                errorMessage = message;
            }
        };
    }

    @Test
    public void testTransformTreeWithSimpleScript() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);
        StringLiteral stringLit = new StringLiteral();
        stringLit.setValue("use strict");
        stringLit.setLineno(1);
        root.addChild(stringLit);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformTreeWithMultipleStatements() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ExpressionStatement exprStmt = new ExpressionStatement();
        FunctionCall call = new FunctionCall();
        Name target = new Name();
        target.setIdentifier("foo");
        call.setTarget(target);
        exprStmt.setExpression(call);
        root.addChild(exprStmt);

        ExpressionStatement exprStmt2 = new ExpressionStatement();
        NumberLiteral num = new NumberLiteral();
        num.setNumber(42.0);
        exprStmt2.setExpression(num);
        root.addChild(exprStmt2);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testTransformTreeWithFunctionNode() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        FunctionNode func = new FunctionNode();
        Name name = new Name();
        name.setIdentifier("testFunc");
        func.setFunctionName(name);
        func.setLp(5);

        Block body = new Block();
        ReturnStatement ret = new ReturnStatement();
        NumberLiteral retVal = new NumberLiteral();
        retVal.setNumber(1);
        ret.setReturnValue(retVal);
        body.addChild(ret);
        func.setBody(body);

        root.addChild(func);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
        Node funcNode = result.getFirstChild();
        assertEquals(Token.FUNCTION, funcNode.getType());
        Node funcName = funcNode.getFirstChild();
        assertEquals(Token.NAME, funcName.getType());
        assertEquals("testFunc", funcName.getString());
    }

    @Test
    public void testTransformTreeWithVariableDeclaration() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        VariableDeclaration varDecl = new VariableDeclaration();
        VariableInitializer init = new VariableInitializer();
        Name target = new Name();
        target.setIdentifier("x");
        init.setTarget(target);
        NumberLiteral initVal = new NumberLiteral();
        initVal.setNumber(10);
        init.setInitializer(initVal);
        varDecl.addVariable(init);

        root.addChild(varDecl);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node varNode = result.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
    }

    @Test
    public void testTransformTreeWithIfStatement() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        IfStatement ifStmt = new IfStatement();
        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.jscomp.mozilla.rhino.Token.TRUE);
        ifStmt.setCondition(condition);

        Block thenBlock = new Block();
        ExpressionStatement thenExpr = new ExpressionStatement();
        Name thenName = new Name();
        thenName.setIdentifier("a");
        thenExpr.setExpression(thenName);
        thenBlock.addChild(thenExpr);
        ifStmt.setThenPart(thenBlock);

        Block elseBlock = new Block();
        ExpressionStatement elseExpr = new ExpressionStatement();
        Name elseName = new Name();
        elseName.setIdentifier("b");
        elseExpr.setExpression(elseName);
        elseBlock.addChild(elseExpr);
        ifStmt.setElsePart(elseBlock);

        root.addChild(ifStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node ifNode = result.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(3, ifNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithIfStatementNoElse() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        IfStatement ifStmt = new IfStatement();
        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.jscomp.mozilla.rhino.Token.FALSE);
        ifStmt.setCondition(condition);

        Block thenBlock = new Block();
        ExpressionStatement thenExpr = new ExpressionStatement();
        Name thenName = new Name();
        thenName.setIdentifier("c");
        thenExpr.setExpression(thenName);
        thenBlock.addChild(thenExpr);
        ifStmt.setThenPart(thenBlock);

        root.addChild(ifStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node ifNode = result.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(2, ifNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithBinaryExpression() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ExpressionStatement exprStmt = new ExpressionStatement();
        InfixExpression infix = new InfixExpression();
        infix.setType(com.google.javascript.jscomp.mozilla.rhino.Token.ADD);
        infix.setOperatorPosition(1);

        NumberLiteral left = new NumberLiteral();
        left.setNumber(1);
        infix.setLeft(left);

        NumberLiteral right = new NumberLiteral();
        right.setNumber(2);
        infix.setRight(right);

        exprStmt.setExpression(infix);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node addNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(2, addNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithStringLiteralDirective() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ExpressionStatement exprStmt = new ExpressionStatement();
        StringLiteral directive = new StringLiteral();
        directive.setValue("use strict");
        exprStmt.setExpression(directive);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertNotNull(result.getDirectives());
        assertTrue(result.getDirectives().contains("use strict"));
    }

    @Test
    public void testTransformTreeWithBreakStatement() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        BreakStatement breakStmt = new BreakStatement();
        Label label = new Label();
        label.setName("outer");
        breakStmt.setBreakLabel(label);
        root.addChild(breakStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node breakNode = result.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(1, breakNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithUnlabeledBreak() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        BreakStatement breakStmt = new BreakStatement();
        root.addChild(breakStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node breakNode = result.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(0, breakNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithContinueStatement() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ContinueStatement contStmt = new ContinueStatement();
        Label label = new Label();
        label.setName("loop1");
        contStmt.setLabel(label);
        root.addChild(contStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node contNode = result.getFirstChild();
        assertEquals(Token.CONTINUE, contNode.getType());
        assertEquals(1, contNode.getChildCount());
    }

    @Test
    public void testTransformTreeForLoop() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ForLoop forLoop = new ForLoop();
        VariableDeclaration init = new VariableDeclaration();
        VariableInitializer varInit = new VariableInitializer();
        Name varName = new Name();
        varName.setIdentifier("i");
        varInit.setTarget(varName);
        NumberLiteral initVal = new NumberLiteral();
        initVal.setNumber(0);
        varInit.setInitializer(initVal);
        init.addVariable(varInit);
        forLoop.setInitializer(init);

        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.jscomp.mozilla.rhino.Token.TRUE);
        forLoop.setCondition(condition);

        UnaryExpression increment = new UnaryExpression();
        increment.setType(com.google.javascript.jscomp.mozilla.rhino.Token.INC);
        Name incTarget = new Name();
        incTarget.setIdentifier("i");
        increment.setOperand(incTarget);
        forLoop.setIncrement(increment);

        Block body = new Block();
        forLoop.setBody(body);

        root.addChild(forLoop);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node forNode = result.getFirstChild();
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(4, forNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithWhileLoop() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        WhileLoop whileLoop = new WhileLoop();
        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.jscomp.mozilla.rhino.Token.TRUE);
        whileLoop.setCondition(condition);

        ExpressionStatement bodyExpr = new ExpressionStatement();
        Name bodyName = new Name();
        bodyName.setIdentifier("x");
        bodyExpr.setExpression(bodyName);
        whileLoop.setBody(bodyExpr);

        root.addChild(whileLoop);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node whileNode = result.getFirstChild();
        assertEquals(Token.WHILE, whileNode.getType());
        assertEquals(2, whileNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithDoWhileLoop() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        DoLoop doLoop = new DoLoop();
        Block body = new Block();
        doLoop.setBody(body);
        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.jscomp.mozilla.rhino.Token.FALSE);
        doLoop.setCondition(condition);
        root.addChild(doLoop);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node doNode = result.getFirstChild();
        assertEquals(Token.DO, doNode.getType());
        assertEquals(2, doNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithSwitch() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        SwitchStatement switchStmt = new SwitchStatement();
        Name switchExpr = new Name();
        switchExpr.setIdentifier("x");
        switchStmt.setExpression(switchExpr);

        SwitchCase case1 = new SwitchCase();
        NumberLiteral caseVal = new NumberLiteral();
        caseVal.setNumber(1);
        case1.setExpression(caseVal);
        ExpressionStatement caseBody = new ExpressionStatement();
        Name caseName = new Name();
        caseName.setIdentifier("a");
        caseBody.setExpression(caseName);
        case1.addStatement(caseBody);
        switchStmt.addCase(case1);

        SwitchCase defaultCase = new SwitchCase();
        defaultCase.setIsDefault(true);
        ExpressionStatement defBody = new ExpressionStatement();
        Name defName = new Name();
        defName.setIdentifier("b");
        defBody.setExpression(defName);
        defaultCase.addStatement(defBody);
        switchStmt.addCase(defaultCase);

        root.addChild(switchStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node switchNode = result.getFirstChild();
        assertEquals(Token.SWITCH, switchNode.getType());
        assertEquals(3, switchNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithThrow() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ThrowStatement throwStmt = new ThrowStatement();
        Name errorName = new Name();
        errorName.setIdentifier("Error");
        throwStmt.setExpression(errorName);
        root.addChild(throwStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node throwNode = result.getFirstChild();
        assertEquals(Token.THROW, throwNode.getType());
    }

    @Test
    public void testTransformTreeWithTryCatchFinally() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        TryStatement tryStmt = new TryStatement();
        Block tryBlock = new Block();
        tryStmt.setTryBlock(tryBlock);

        CatchClause catchClause = new CatchClause();
        Name catchVar = new Name();
        catchVar.setIdentifier("e");
        catchClause.setVarName(catchVar);
        Block catchBody = new Block();
        catchClause.setBody(catchBody);
        tryStmt.addCatchClause(catchClause);

        Block finallyBlock = new Block();
        tryStmt.setFinallyBlock(finallyBlock);

        root.addChild(tryStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node tryNode = result.getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(3, tryNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithReturnValue() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ReturnStatement retStmt = new ReturnStatement();
        NumberLiteral retVal = new NumberLiteral();
        retVal.setNumber(42);
        retStmt.setReturnValue(retVal);
        root.addChild(retStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node retNode = result.getFirstChild();
        assertEquals(Token.RETURN, retNode.getType());
        assertEquals(1, retNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithEmptyReturn() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ReturnStatement retStmt = new ReturnStatement();
        root.addChild(retStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node retNode = result.getFirstChild();
        assertEquals(Token.RETURN, retNode.getType());
        assertEquals(0, retNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithNullSourceName() {
        AstRoot root = new AstRoot();
        root.setSourceName(null);
        root.setLineno(1);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformTreeWithObjectLiteral() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        Name propName = new Name();
        propName.setIdentifier("key");
        prop.setLeft(propName);
        NumberLiteral propVal = new NumberLiteral();
        propVal.setNumber(1);
        prop.setRight(propVal);
        objLit.addElement(prop);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node objNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.OBJECTLIT, objNode.getType());
        assertEquals(1, objNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithArrayLiteral() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ArrayLiteral arrLit = new ArrayLiteral();
        NumberLiteral elem1 = new NumberLiteral();
        elem1.setNumber(1);
        arrLit.addElement(elem1);
        NumberLiteral elem2 = new NumberLiteral();
        elem2.setNumber(2);
        arrLit.addElement(elem2);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(arrLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node arrNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.ARRAYLIT, arrNode.getType());
        assertEquals(2, arrNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithAssignment() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        Assignment assign = new Assignment();
        assign.setType(com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN);
        assign.setOperatorPosition(1);
        Name left = new Name();
        left.setIdentifier("x");
        assign.setLeft(left);
        NumberLiteral right = new NumberLiteral();
        right.setNumber(5);
        assign.setRight(right);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(assign);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node assignNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
    }

    @Test
    public void testTransformTreeWithNewExpression() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        NewExpression newExpr = new NewExpression();
        Name target = new Name();
        target.setIdentifier("Object");
        newExpr.setTarget(target);
        newExpr.setLp(0);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(newExpr);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node callNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.CALL, callNode.getType());
    }

    @Test
    public void testTransformTreeWithRegExpLiteral() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("test");
        regexp.setFlags("g");

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(regexp);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node regexpNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(2, regexpNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithRegExpLiteralNoFlags() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("test");

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(regexp);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node regexpNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(1, regexpNode.getChildCount());
    }

    @Test
    public void testTransformTreeWithPropertyGet() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        PropertyGet propGet = new PropertyGet();
        Name target = new Name();
        target.setIdentifier("obj");
        propGet.setTarget(target);
        Name property = new Name();
        property.setIdentifier("prop");
        propGet.setProperty(property);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(propGet);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node getpropNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.GETPROP, getpropNode.getType());
    }

    @Test
    public void testTransformTreeWithElementGet() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ElementGet elemGet = new ElementGet();
        Name target = new Name();
        target.setIdentifier("arr");
        elemGet.setTarget(target);
        NumberLiteral index = new NumberLiteral();
        index.setNumber(0);
        elemGet.setElement(index);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(elemGet);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node getelemNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.GETELEM, getelemNode.getType());
    }

    @Test
    public void testTransformTreeWithComment() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        Comment comment = new Comment();
        comment.setCommentType(com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.JSDOC);
        comment.setValue("/** @type {number} */");
        comment.setLineno(0);
        comment.setAbsolutePosition(0);
        root.addComment(comment);

        ExpressionStatement exprStmt = new ExpressionStatement();
        NumberLiteral num = new NumberLiteral();
        num.setNumber(1);
        exprStmt.setExpression(num);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithUnaryNegation() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        UnaryExpression unary = new UnaryExpression();
        unary.setType(com.google.javascript.jscomp.mozilla.rhino.Token.NEG);
        NumberLiteral operand = new NumberLiteral();
        operand.setNumber(5);
        unary.setOperand(operand);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(unary);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        Node unaryNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.NUMBER, unaryNode.getType());
        assertEquals(-5.0, unaryNode.getDouble(), 0.001);
    }

    @Test
    public void testTransformTreeWithDestructuringArray() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ArrayLiteral arrLit = new ArrayLiteral();
        arrLit.setDestructuring(true);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(arrLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertTrue(errorOccurred);
        assertTrue(errorMessage.contains("destructuring assignment forbidden"));
    }

    @Test
    public void testTransformTreeWithDestructuringObject() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        objLit.setDestructuring(true);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertTrue(errorOccurred);
        assertTrue(errorMessage.contains("destructuring assignment forbidden"));
    }

    @Test
    public void testTransformTreeWithGetterInObject() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        prop.setGetter(true);
        Name propName = new Name();
        propName.setIdentifier("getter");
        prop.setLeft(propName);
        Name propBody = new Name();
        propBody.setIdentifier("x");
        prop.setRight(propBody);
        objLit.addElement(prop);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertTrue(errorOccurred);
        assertTrue(errorMessage.contains("getters are not supported in Internet Explorer"));
    }

    @Test
    public void testTransformTreeWithSetterInObject() {
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        prop.setSetter(true);
        Name propName = new Name();
        propName.setIdentifier("setter");
        prop.setLeft(propName);
        Name propBody = new Name();
        propBody.setIdentifier("x");
        prop.setRight(propBody);
        objLit.addElement(prop);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, config, errorReporter);
        assertNotNull(result);
        assertTrue(errorOccurred);
        assertTrue(errorMessage.contains("setters are not supported in Internet Explorer"));
    }

    @Test
    public void testTransformTreeWithGetterInES5Mode() {
        Config es5Config = new Config(true, false, false, true);
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        prop.setGetter(true);
        Name propName = new Name();
        propName.setIdentifier("getter");
        prop.setLeft(propName);
        Name propBody = new Name();
        propBody.setIdentifier("x");
        prop.setRight(propBody);
        objLit.addElement(prop);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, es5Config, errorReporter);
        assertNotNull(result);
        Node objNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.OBJECTLIT, objNode.getType());
        Node keyNode = objNode.getFirstChild();
        assertEquals(Token.GET, keyNode.getType());
    }

    @Test
    public void testTransformTreeWithSetterInES5Mode() {
        Config es5Config = new Config(true, false, false, true);
        AstRoot root = new AstRoot();
        root.setSourceName(SOURCE_NAME);

        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        prop.setSetter(true);
        Name propName = new Name();
        propName.setIdentifier("setter");
        prop.setLeft(propName);
        Name propBody = new Name();
        propBody.setIdentifier("x");
        prop.setRight(propBody);
        objLit.addElement(prop);

        ExpressionStatement exprStmt = new ExpressionStatement();
        exprStmt.setExpression(objLit);
        root.addChild(exprStmt);

        Node result = IRFactory.transformTree(root, SOURCE_CODE, es5Config, errorReporter);
        assertNotNull(result);
        Node objNode = result.getFirstChild().getFirstChild();
        assertEquals(Token.OBJECTLIT, objNode.getType());
        Node keyNode = objNode.getFirstChild();
        assertEquals(Token.SET, keyNode.getType());
    }
}