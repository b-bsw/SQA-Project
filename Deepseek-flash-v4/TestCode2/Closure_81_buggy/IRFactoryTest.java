package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;

import org.junit.Before;
import org.junit.Test;

public class IRFactoryTest {

    private Config config;
    private ErrorReporter errorReporter;
    private StringBuilder errorLog;

    @Before
    public void setUp() {
        config = new Config();
        config.acceptConstKeyword = true;
        config.acceptES5 = true;
        errorLog = new StringBuilder();
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String s, String s1, int i, String s2, int i1) {
                errorLog.append("WARNING: ").append(s).append("\n");
            }

            @Override
            public void error(String s, String s1, int i, String s2, int i1) {
                errorLog.append("ERROR: ").append(s).append("\n");
            }
        };
    }

    @Test
    public void testTransformTreeSimple() {
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        Name name = new Name();
        name.setIdentifier("x");
        root.addChild(new ExpressionStatement(name));

        Node result = IRFactory.transformTree(root, "x", config, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
        assertTrue(result.hasChildren());
        Node exprStmt = result.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStmt.getType());
        Node nameNode = exprStmt.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
    }

    @Test
    public void testTransformArrayLiteralNoSkips() {
        ArrayLiteral literal = new ArrayLiteral();
        NumberLiteral num1 = new NumberLiteral();
        num1.setNumber(1.0);
        NumberLiteral num2 = new NumberLiteral();
        num2.setNumber(2.0);
        literal.addElement(num1);
        literal.addElement(num2);
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(literal));

        Node result = IRFactory.transformTree(root, "[1,2]", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node arrLit = exprStmt.getFirstChild();
        assertEquals(Token.ARRAYLIT, arrLit.getType());
        assertTrue(arrLit.hasChildren());
        assertEquals(2, arrLit.getChildCount());
    }

    @Test
    public void testTransformArrayLiteralWithSkip() {
        ArrayLiteral literal = new ArrayLiteral();
        NumberLiteral num1 = new NumberLiteral();
        num1.setNumber(1.0);
        literal.addElement(num1);
        com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression empty = new com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression();
        literal.addElement(empty);
        NumberLiteral num2 = new NumberLiteral();
        num2.setNumber(3.0);
        literal.addElement(num2);
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(literal));

        Node result = IRFactory.transformTree(root, "[1,,3]", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node arrLit = exprStmt.getFirstChild();
        assertEquals(Token.ARRAYLIT, arrLit.getType());
        assertEquals(3, arrLit.getChildCount());
        int[] skipIndexes = (int[]) arrLit.getProp(Node.SKIP_INDEXES_PROP);
        assertNotNull(skipIndexes);
        assertEquals(1, skipIndexes[0]);
    }

    @Test
    public void testTransformNumberLiteral() {
        NumberLiteral literal = new NumberLiteral();
        literal.setNumber(42.5);
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(literal));

        Node result = IRFactory.transformTree(root, "42.5", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node numNode = exprStmt.getFirstChild();
        assertEquals(Token.NUMBER, numNode.getType());
        assertEquals(42.5, numNode.getDouble(), 0.001);
    }

    @Test
    public void testTransformStringLiteral() {
        StringLiteral literal = new StringLiteral();
        literal.setValue("hello");
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(literal));

        Node result = IRFactory.transformTree(root, "\"hello\"", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node strNode = exprStmt.getFirstChild();
        assertEquals(Token.STRING, strNode.getType());
        assertEquals("hello", strNode.getString());
    }

    @Test
    public void testTransformKeywordLiteralThis() {
        KeywordLiteral literal = new KeywordLiteral();
        literal.setType(com.google.javascript.jscomp.mozilla.rhino.Token.THIS);
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(literal));

        Node result = IRFactory.transformTree(root, "this", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node thisNode = exprStmt.getFirstChild();
        assertEquals(Token.THIS, thisNode.getType());
    }

    @Test
    public void testTransformFunctionNode() {
        FunctionNode func = new FunctionNode();
        Name funcName = new Name();
        funcName.setIdentifier("myFunc");
        func.setFunctionName(funcName);
        func.setLp(0);
        func.setAbsolutePosition(0);
        Name param = new Name();
        param.setIdentifier("param1");
        func.addParam(param);
        Block body = new Block();
        ReturnStatement ret = new ReturnStatement();
        NumberLiteral retVal = new NumberLiteral();
        retVal.setNumber(1.0);
        ret.setReturnValue(retVal);
        body.addChild(ret);
        func.setBody(body);
        func.setAbsolutePosition(0);
        func.setLineno(1);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(func);

        Node result = IRFactory.transformTree(root, "function myFunc(param1){return 1;}", config, errorReporter);
        assertNotNull(result);
        Node funcNode = result.getFirstChild();
        assertEquals(Token.FUNCTION, funcNode.getType());
        Node funcNameNode = funcNode.getFirstChild();
        assertEquals(Token.NAME, funcNameNode.getType());
        assertEquals("myFunc", funcNameNode.getString());
        Node lpNode = funcNameNode.getNext();
        assertEquals(Token.LP, lpNode.getType());
        assertTrue(lpNode.hasChildren());
        Node paramNode = lpNode.getFirstChild();
        assertEquals(Token.NAME, paramNode.getType());
        assertEquals("param1", paramNode.getString());
        Node bodyNode = lpNode.getNext();
        assertEquals(Token.BLOCK, bodyNode.getType());
        Node retNode = bodyNode.getFirstChild();
        assertEquals(Token.RETURN, retNode.getType());
    }

    @Test
    public void testTransformIfStatement() {
        IfStatement ifStmt = new IfStatement();
        Name cond = new Name();
        cond.setIdentifier("a");
        ifStmt.setCondition(cond);
        Block thenBlock = new Block();
        Name thenExpr = new Name();
        thenExpr.setIdentifier("b");
        thenBlock.addChild(new ExpressionStatement(thenExpr));
        ifStmt.setThenPart(thenBlock);
        Block elseBlock = new Block();
        Name elseExpr = new Name();
        elseExpr.setIdentifier("c");
        elseBlock.addChild(new ExpressionStatement(elseExpr));
        ifStmt.setElsePart(elseBlock);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(ifStmt);

        Node result = IRFactory.transformTree(root, "if(a){b;}else{c;}", config, errorReporter);
        assertNotNull(result);
        Node ifNode = result.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertTrue(ifNode.hasChildren());
        assertEquals(Token.NAME, ifNode.getFirstChild().getType());
        assertEquals("a", ifNode.getFirstChild().getString());
    }

    @Test
    public void testTransformIfWithoutElse() {
        IfStatement ifStmt = new IfStatement();
        Name cond = new Name();
        cond.setIdentifier("a");
        ifStmt.setCondition(cond);
        Block thenBlock = new Block();
        Name thenExpr = new Name();
        thenExpr.setIdentifier("b");
        thenBlock.addChild(new ExpressionStatement(thenExpr));
        ifStmt.setThenPart(thenBlock);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(ifStmt);

        Node result = IRFactory.transformTree(root, "if(a){b;}", config, errorReporter);
        assertNotNull(result);
        Node ifNode = result.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(2, ifNode.getChildCount());
    }

    @Test
    public void testTransformWhileLoop() {
        WhileLoop whileLoop = new WhileLoop();
        Name cond = new Name();
        cond.setIdentifier("a");
        whileLoop.setCondition(cond);
        Block body = new Block();
        Name bodyExpr = new Name();
        bodyExpr.setIdentifier("b");
        body.addChild(new ExpressionStatement(bodyExpr));
        whileLoop.setBody(body);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(whileLoop);

        Node result = IRFactory.transformTree(root, "while(a){b;}", config, errorReporter);
        assertNotNull(result);
        Node whileNode = result.getFirstChild();
        assertEquals(Token.WHILE, whileNode.getType());
        assertEquals(2, whileNode.getChildCount());
    }

    @Test
    public void testTransformForLoop() {
        ForLoop forLoop = new ForLoop();
        Name init = new Name();
        init.setIdentifier("i");
        forLoop.setInitializer(init);
        Name cond = new Name();
        cond.setIdentifier("i<10");
        forLoop.setCondition(cond);
        Name incr = new Name();
        incr.setIdentifier("i++");
        forLoop.setIncrement(incr);
        Block body = new Block();
        Name bodyExpr = new Name();
        bodyExpr.setIdentifier("x");
        body.addChild(new ExpressionStatement(bodyExpr));
        forLoop.setBody(body);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(forLoop);

        Node result = IRFactory.transformTree(root, "for(i;i<10;i++){x;}", config, errorReporter);
        assertNotNull(result);
        Node forNode = result.getFirstChild();
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(4, forNode.getChildCount());
    }

    @Test
    public void testTransformReturnStatementWithValue() {
        ReturnStatement ret = new ReturnStatement();
        NumberLiteral retVal = new NumberLiteral();
        retVal.setNumber(1.0);
        ret.setReturnValue(retVal);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(ret);

        Node result = IRFactory.transformTree(root, "return 1;", config, errorReporter);
        assertNotNull(result);
        Node retNode = result.getFirstChild();
        assertEquals(Token.RETURN, retNode.getType());
        assertTrue(retNode.hasChildren());
        assertEquals(Token.NUMBER, retNode.getFirstChild().getType());
    }

    @Test
    public void testTransformReturnStatementWithoutValue() {
        ReturnStatement ret = new ReturnStatement();

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(ret);

        Node result = IRFactory.transformTree(root, "return;", config, errorReporter);
        assertNotNull(result);
        Node retNode = result.getFirstChild();
        assertEquals(Token.RETURN, retNode.getType());
        assertTrue(!retNode.hasChildren());
    }

    @Test
    public void testTransformThrowStatement() {
        ThrowStatement throwStmt = new ThrowStatement();
        Name throwExpr = new Name();
        throwExpr.setIdentifier("e");
        throwStmt.setExpression(throwExpr);
        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(throwStmt);

        Node result = IRFactory.transformTree(root, "throw e;", config, errorReporter);
        assertNotNull(result);
        Node throwNode = result.getFirstChild();
        assertEquals(Token.THROW, throwNode.getType());
        assertTrue(throwNode.hasChildren());
    }

    @Test
    public void testTransformTryCatchFinally() {
        TryStatement tryStmt = new TryStatement();
        Block tryBlock = new Block();
        Name tryExpr = new Name();
        tryExpr.setIdentifier("x");
        tryBlock.addChild(new ExpressionStatement(tryExpr));
        tryStmt.setTryBlock(tryBlock);
        CatchClause catchClause = new CatchClause();
        Name catchVar = new Name();
        catchVar.setIdentifier("e");
        catchClause.setVarName(catchVar);
        Block catchBody = new Block();
        Name catchExpr = new Name();
        catchExpr.setIdentifier("y");
        catchBody.addChild(new ExpressionStatement(catchExpr));
        catchClause.setBody(catchBody);
        tryStmt.addCatchClause(catchClause);
        Block finallyBlock = new Block();
        Name finallyExpr = new Name();
        finallyExpr.setIdentifier("z");
        finallyBlock.addChild(new ExpressionStatement(finallyExpr));
        tryStmt.setFinallyBlock(finallyBlock);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(tryStmt);

        Node result = IRFactory.transformTree(root, "try{x;}catch(e){y;}finally{z;}", config, errorReporter);
        assertNotNull(result);
        Node tryNode = result.getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(3, tryNode.getChildCount());
    }

    @Test
    public void testTransformSwitchStatement() {
        SwitchStatement switchStmt = new SwitchStatement();
        Name switchExpr = new Name();
        switchExpr.setIdentifier("a");
        switchStmt.setExpression(switchExpr);
        SwitchCase case1 = new SwitchCase();
        NumberLiteral caseVal = new NumberLiteral();
        caseVal.setNumber(1.0);
        case1.setExpression(caseVal);
        Block caseBlock = new Block();
        Name caseExpr = new Name();
        caseExpr.setIdentifier("x");
        caseBlock.addChild(new ExpressionStatement(caseExpr));
        case1.setStatements(caseBlock);
        switchStmt.addCase(case1);
        SwitchCase defaultCase = new SwitchCase();
        defaultCase.setDefault(true);
        Block defaultBlock = new Block();
        Name defaultExpr = new Name();
        defaultExpr.setIdentifier("y");
        defaultBlock.addChild(new ExpressionStatement(defaultExpr));
        defaultCase.setStatements(defaultBlock);
        switchStmt.addCase(defaultCase);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(switchStmt);

        Node result = IRFactory.transformTree(root, "switch(a){case1:x;default:y;}", config, errorReporter);
        assertNotNull(result);
        Node switchNode = result.getFirstChild();
        assertEquals(Token.SWITCH, switchNode.getType());
        assertEquals(3, switchNode.getChildCount());
    }

    @Test
    public void testTransformInfixExpression() {
        InfixExpression infix = new InfixExpression();
        infix.setType(com.google.javascript.jscomp.mozilla.rhino.Token.ADD);
        Name left = new Name();
        left.setIdentifier("a");
        infix.setLeft(left);
        Name right = new Name();
        right.setIdentifier("b");
        infix.setRight(right);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(infix));

        Node result = IRFactory.transformTree(root, "a+b", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node addNode = exprStmt.getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(2, addNode.getChildCount());
    }

    @Test
    public void testTransformUnaryExpressionNegateNumber() {
        UnaryExpression unary = new UnaryExpression();
        unary.setType(com.google.javascript.jscomp.mozilla.rhino.Token.NEG);
        NumberLiteral operand = new NumberLiteral();
        operand.setNumber(5.0);
        unary.setOperand(operand);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(unary));

        Node result = IRFactory.transformTree(root, "-5", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node numNode = exprStmt.getFirstChild();
        assertEquals(Token.NUMBER, numNode.getType());
        assertEquals(-5.0, numNode.getDouble(), 0.001);
    }

    @Test
    public void testTransformUnaryExpressionNotNumber() {
        UnaryExpression unary = new UnaryExpression();
        unary.setType(com.google.javascript.jscomp.mozilla.rhino.Token.NOT);
        Name operand = new Name();
        operand.setIdentifier("a");
        unary.setOperand(operand);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(unary));

        Node result = IRFactory.transformTree(root, "!a", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node notNode = exprStmt.getFirstChild();
        assertEquals(Token.NOT, notNode.getType());
    }

    @Test
    public void testTransformVariableDeclaration() {
        VariableDeclaration varDecl = new VariableDeclaration();
        varDecl.setType(com.google.javascript.jscomp.mozilla.rhino.Token.VAR);
        VariableInitializer init = new VariableInitializer();
        Name target = new Name();
        target.setIdentifier("x");
        init.setTarget(target);
        NumberLiteral initVal = new NumberLiteral();
        initVal.setNumber(1.0);
        init.setInitializer(initVal);
        varDecl.addVariable(init);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(varDecl);

        Node result = IRFactory.transformTree(root, "var x=1;", config, errorReporter);
        assertNotNull(result);
        Node varNode = result.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        assertTrue(varNode.hasChildren());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
        assertTrue(nameNode.hasChildren());
        assertEquals(Token.NUMBER, nameNode.getFirstChild().getType());
    }

    @Test
    public void testTransformVariableInitNoInit() {
        VariableDeclaration varDecl = new VariableDeclaration();
        varDecl.setType(com.google.javascript.jscomp.mozilla.rhino.Token.VAR);
        VariableInitializer init = new VariableInitializer();
        Name target = new Name();
        target.setIdentifier("x");
        init.setTarget(target);
        varDecl.addVariable(init);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(varDecl);

        Node result = IRFactory.transformTree(root, "var x;", config, errorReporter);
        assertNotNull(result);
        Node varNode = result.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
        assertTrue(!nameNode.hasChildren());
    }

    @Test
    public void testTransformObjectLiteral() {
        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        Name propName = new Name();
        propName.setIdentifier("key");
        prop.setLeft(propName);
        NumberLiteral propValue = new NumberLiteral();
        propValue.setNumber(1.0);
        prop.setRight(propValue);
        objLit.addElement(prop);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(objLit));

        Node result = IRFactory.transformTree(root, "({key:1})", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node objNode = exprStmt.getFirstChild();
        assertEquals(Token.OBJECTLIT, objNode.getType());
        assertTrue(objNode.hasChildren());
    }

    @Test
    public void testTransformParenthesizedExpression() {
        ParenthesizedExpression paren = new ParenthesizedExpression();
        NumberLiteral inner = new NumberLiteral();
        inner.setNumber(1.0);
        paren.setExpression(inner);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(paren));

        Node result = IRFactory.transformTree(root, "(1)", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node numNode = exprStmt.getFirstChild();
        assertEquals(Token.NUMBER, numNode.getType());
        assertEquals(true, numNode.getProp(Node.PARENTHESIZED_PROP));
    }

    @Test
    public void testTransformRegExpLiteral() {
        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("abc");
        regexp.setFlags("g");

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(regexp));

        Node result = IRFactory.transformTree(root, "/abc/g", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node regexpNode = exprStmt.getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertTrue(regexpNode.hasChildren());
        assertEquals(Token.STRING, regexpNode.getFirstChild().getType());
        assertEquals("abc", regexpNode.getFirstChild().getString());
        Node flagsNode = regexpNode.getLastChild();
        assertEquals(Token.STRING, flagsNode.getType());
        assertEquals("g", flagsNode.getString());
    }

    @Test
    public void testTransformRegExpNoFlags() {
        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("abc");
        regexp.setFlags("");

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(regexp));

        Node result = IRFactory.transformTree(root, "/abc/", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node regexpNode = exprStmt.getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(1, regexpNode.getChildCount());
    }

    @Test
    public void testTransformPropertyGet() {
        PropertyGet get = new PropertyGet();
        Name target = new Name();
        target.setIdentifier("obj");
        get.setTarget(target);
        Name property = new Name();
        property.setIdentifier("prop");
        get.setProperty(property);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(get));

        Node result = IRFactory.transformTree(root, "obj.prop", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node getPropNode = exprStmt.getFirstChild();
        assertEquals(Token.GETPROP, getPropNode.getType());
        assertEquals(2, getPropNode.getChildCount());
    }

    @Test
    public void testTransformElementGet() {
        ElementGet get = new ElementGet();
        Name target = new Name();
        target.setIdentifier("arr");
        get.setTarget(target);
        NumberLiteral index = new NumberLiteral();
        index.setNumber(0.0);
        get.setElement(index);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(get));

        Node result = IRFactory.transformTree(root, "arr[0]", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node getElemNode = exprStmt.getFirstChild();
        assertEquals(Token.GETELEM, getElemNode.getType());
        assertEquals(2, getElemNode.getChildCount());
    }

    @Test
    public void testTransformFunctionCall() {
        FunctionCall call = new FunctionCall();
        Name target = new Name();
        target.setIdentifier("foo");
        call.setTarget(target);
        NumberLiteral arg1 = new NumberLiteral();
        arg1.setNumber(1.0);
        call.addArgument(arg1);
        NumberLiteral arg2 = new NumberLiteral();
        arg2.setNumber(2.0);
        call.addArgument(arg2);
        call.setAbsolutePosition(0);
        call.setLp(0);
        call.setLineno(1);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(call));

        Node result = IRFactory.transformTree(root, "foo(1,2)", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node callNode = exprStmt.getFirstChild();
        assertEquals(Token.CALL, callNode.getType());
        assertEquals(3, callNode.getChildCount());
    }

    @Test
    public void testTransformNewExpression() {
        NewExpression newexpr = new NewExpression();
        Name target = new Name();
        target.setIdentifier("Foo");
        newexpr.setTarget(target);
        newexpr.setAbsolutePosition(0);
        newexpr.setLp(0);
        newexpr.setLineno(1);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(newexpr));

        Node result = IRFactory.transformTree(root, "new Foo()", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node newExprNode = exprStmt.getFirstChild();
        assertEquals(Token.NEW, newExprNode.getType());
        assertEquals(1, newExprNode.getChildCount());
    }

    @Test
    public void testTransformConditionalExpression() {
        ConditionalExpression condExpr = new ConditionalExpression();
        Name test = new Name();
        test.setIdentifier("a");
        condExpr.setTestExpression(test);
        Name trueExpr = new Name();
        trueExpr.setIdentifier("b");
        condExpr.setTrueExpression(trueExpr);
        Name falseExpr = new Name();
        falseExpr.setIdentifier("c");
        condExpr.setFalseExpression(falseExpr);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(condExpr));

        Node result = IRFactory.transformTree(root, "a?b:c", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node hookNode = exprStmt.getFirstChild();
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals(3, hookNode.getChildCount());
    }

    @Test
    public void testTransformBreakStatementWithLabel() {
        BreakStatement breakStmt = new BreakStatement();
        Label label = new Label();
        label.setName("myLabel");
        breakStmt.setBreakLabel(label);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(breakStmt);

        Node result = IRFactory.transformTree(root, "break myLabel;", config, errorReporter);
        assertNotNull(result);
        Node breakNode = result.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertTrue(breakNode.hasChildren());
        assertEquals(Token.LABEL_NAME, breakNode.getFirstChild().getType());
    }

    @Test
    public void testTransformBreakStatementWithoutLabel() {
        BreakStatement breakStmt = new BreakStatement();

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(breakStmt);

        Node result = IRFactory.transformTree(root, "break;", config, errorReporter);
        assertNotNull(result);
        Node breakNode = result.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertTrue(!breakNode.hasChildren());
    }

    @Test
    public void testTransformContinueStatementWithLabel() {
        ContinueStatement contStmt = new ContinueStatement();
        Label label = new Label();
        label.setName("myLabel");
        contStmt.setLabel(label);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(contStmt);

        Node result = IRFactory.transformTree(root, "continue myLabel;", config, errorReporter);
        assertNotNull(result);
        Node continueNode = result.getFirstChild();
        assertEquals(Token.CONTINUE, continueNode.getType());
        assertTrue(continueNode.hasChildren());
        assertEquals(Token.LABEL_NAME, continueNode.getFirstChild().getType());
    }

    @Test
    public void testTransformContinueStatementWithoutLabel() {
        ContinueStatement contStmt = new ContinueStatement();

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(contStmt);

        Node result = IRFactory.transformTree(root, "continue;", config, errorReporter);
        assertNotNull(result);
        Node continueNode = result.getFirstChild();
        assertEquals(Token.CONTINUE, continueNode.getType());
        assertTrue(!continueNode.hasChildren());
    }

    @Test
    public void testTransformDoLoop() {
        DoLoop doLoop = new DoLoop();
        Block body = new Block();
        Name bodyExpr = new Name();
        bodyExpr.setIdentifier("x");
        body.addChild(new ExpressionStatement(bodyExpr));
        doLoop.setBody(body);
        Name condition = new Name();
        condition.setIdentifier("a");
        doLoop.setCondition(condition);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(doLoop);

        Node result = IRFactory.transformTree(root, "do{x;}while(a);", config, errorReporter);
        assertNotNull(result);
        Node doNode = result.getFirstChild();
        assertEquals(Token.DO, doNode.getType());
        assertEquals(2, doNode.getChildCount());
    }

    @Test
    public void testTransformForInLoop() {
        ForInLoop forIn = new ForInLoop();
        Name iterator = new Name();
        iterator.setIdentifier("x");
        forIn.setIterator(iterator);
        Name obj = new Name();
        obj.setIdentifier("obj");
        forIn.setIteratedObject(obj);
        Block body = new Block();
        Name bodyExpr = new Name();
        bodyExpr.setIdentifier("y");
        body.addChild(new ExpressionStatement(bodyExpr));
        forIn.setBody(body);

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(forIn);

        Node result = IRFactory.transformTree(root, "for(x in obj){y;}", config, errorReporter);
        assertNotNull(result);
        Node forInNode = result.getFirstChild();
        assertEquals(Token.FOR, forInNode.getType());
        assertEquals(3, forInNode.getChildCount());
    }

    @Test
    public void testTransformLabeledStatement() {
        LabeledStatement labeled = new LabeledStatement();
        Label label1 = new Label();
        label1.setName("label1");
        label1.setLineno(1);
        label1.setAbsolutePosition(0);
        labeled.addLabel(label1);
        Label label2 = new Label();
        label2.setName("label2");
        label2.setLineno(1);
        label2.setAbsolutePosition(8);
        labeled.addLabel(label2);
        Name stmt = new Name();
        stmt.setIdentifier("x");
        labeled.setStatement(new ExpressionStatement(stmt));

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(labeled);

        Node result = IRFactory.transformTree(root, "label1:label2:x;", config, errorReporter);
        assertNotNull(result);
        Node labelNode = result.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
    }

    @Test
    public void testTransformScope() {
        Scope scope = new Scope();
        Name innerName = new Name();
        innerName.setIdentifier("x");
        scope.addChild(new ExpressionStatement(innerName));

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(scope);

        Node result = IRFactory.transformTree(root, "x;", config, errorReporter);
        assertNotNull(result);
        Node scopeNode = result.getFirstChild();
        assertEquals(Token.SCRIPT, scopeNode.getType());
        assertTrue(scopeNode.hasChildren());
    }

    @Test
    public void testTransformBlock() {
        Block block = new Block();
        Name innerExpr = new Name();
        innerExpr.setIdentifier("x");
        block.addChild(new ExpressionStatement(innerExpr));

        Name name = new Name();
        name.setIdentifier("x");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(block);

        Node result = IRFactory.transformTree(root, "{x;}", config, errorReporter);
        assertNotNull(result);
        Node blockNode = result.getFirstChild();
        assertEquals(Token.BLOCK, blockNode.getType());
        assertTrue(blockNode.hasChildren());
    }

    @Test
    public void testTransformStringLiteralInName() {
        Name nameNode = new Name();
        nameNode.setIdentifier("str");
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.addChild(new ExpressionStatement(nameNode));

        Node result = IRFactory.transformTree(root, "str", config, errorReporter);
        assertNotNull(result);
        Node exprStmt = result.getFirstChild();
        Node strNode = exprStmt.getFirstChild();
        assertEquals(Token.NAME, strNode.getType());
        assertEquals("str", strNode.getString());
    }
}