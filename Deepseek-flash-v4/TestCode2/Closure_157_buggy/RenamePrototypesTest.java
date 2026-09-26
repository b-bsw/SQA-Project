package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RenamePrototypesTest {

  private Compiler compiler;
  private RenamePrototypes renamingPass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // Ensure the compiler is at a valid state for renaming
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
  }

  // ------------------------------------------------------------------
  // Test process with default scenario: no renaming needed
  // ------------------------------------------------------------------
  @Test
  public void testProcessNoRenaming() {
    // Create empty externs and root
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    // No properties should be renamed
    VariableMap map = renamingPass.getPropertyMap();
    assertNotNull(map);
    assertTrue(map.getOriginalVariableToNewNameMap().isEmpty());
    // LifeCycleStage should have been updated
    assertEquals(AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED,
                 compiler.getLifeCycleStage());
  }

  // ------------------------------------------------------------------
  // Test that a property ending with underscore gets renamed (private heuristic)
  // ------------------------------------------------------------------
  @Test
  public void testRenamePrivateByEndingUnderscore() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Build: Foo.prototype.myProp_ = function() {};
    // GETPROP of prototype, then GETPROP of myProp_
    Node fooGetProp = new Node(Token.GETPROP);
    fooGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    fooGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node myPropGetProp = new Node(Token.GETPROP);
    myPropGetProp.addChildToBack(fooGetProp);
    myPropGetProp.addChildToBack(Node.newString(Token.STRING, "myProp_"));

    // Actually we need to simulate the assignment: Foo.prototype.myProp_ = ...
    // For ProcessProperties, it will see this as a GETPROP with dest "myProp_"
    // and will call markPrototypePropertyCandidate.
    // But to trigger processPrototypeParent, we need to have the parent be a GETPROP as well.
    // The structure: (GETPROP (GETPROP Foo prototype) myProp_) is enough for
    // ProcessProperties.visit to see outer GETPROP, its first child is another GETPROP (prototype),
    // second child is STRING "myProp_". Then it will check if s.equals("prototype")? No, s is "myProp_".
    // Actually the logic: for GETPROP, it gets dest = n.getFirstChild().getNext() which is the
    // second child. If dest.getType() == STRING, then it gets string s. If s.equals("prototype"),
    // it calls processPrototypeParent(parent, input). Here parent is the outer GETPROP.
    // So we need a GETPROP whose second child is "prototype". That will trigger processPrototypeParent.
    // Let's build that instead.

    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    // Now we need a node that assigns to Foo.prototype.myProp_:
    // One way: assignment with left side being a GETPROP of protoGetProp with "myProp_".
    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, "myProp_"));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));

    root.addChildToBack(assign);

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    // myProp_ should be renamed because it ends with underscore (private)
    String newName = map.lookupNewName("myProp_");
    assertNotNull("Expected myProp_ to be renamed", newName);
    // The new name should not be empty
    assertFalse(newName.isEmpty());
    // Verify the old name is in the map
    assertTrue(map.getOriginalVariableToNewNameMap().containsKey("myProp_"));
  }

  // ------------------------------------------------------------------
  // Test that an exported property (by default convention) is not renamed
  // ------------------------------------------------------------------
  @Test
  public void testExportedPropertyNotRenamed() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Add a property that is considered exported by default coding convention,
    // e.g., "indexOf" is in reservedNames set.
    // We'll add it as a prototype property
    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Array"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, "indexOf"));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));

    root.addChildToBack(assign);

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    assertNull("Exported property should not be renamed", map.lookupNewName("indexOf"));
  }

  // ------------------------------------------------------------------
  // Test that a property starting with underscore (isPrivate) gets renamed
  // ------------------------------------------------------------------
  @Test
  public void testPrivateLeadingUnderscore() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Add "privateProp" with leading underscore
    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, "_private"));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));

    root.addChildToBack(assign);

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    String newName = map.lookupNewName("_private");
    assertNotNull("Leading underscore properties should be renamed", newName);
    assertFalse(newName.isEmpty());
  }

  // ------------------------------------------------------------------
  // Test aggressive renaming: renames a lowercase-only property
  // ------------------------------------------------------------------
  @Test
  public void testAggressiveRenamingRenamesLowercaseProperty() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // A property with only lowercase letters: "getdata"
    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, "getdata"));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));

    root.addChildToBack(assign);

    // Use aggressive renaming = true
    renamingPass = new RenamePrototypes(compiler, true, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    String newName = map.lookupNewName("getdata");
    assertNotNull("With aggressive renaming, lowercase property should be renamed", newName);
  }

  // ------------------------------------------------------------------
  // Test that reservedNames from externs are respected
  // ------------------------------------------------------------------
  @Test
  public void testExternedPropertyAddedToReservedNames() {
    Node externs = new Node(Token.SCRIPT);
    // Add a getprop with property "myExtern" to externs
    Node getprop = new Node(Token.GETPROP);
    getprop.addChildToBack(Node.newString(Token.NAME, "foo"));
    getprop.addChildToBack(Node.newString(Token.STRING, "myExtern"));
    externs.addChildToBack(getprop);

    Node root = new Node(Token.SCRIPT);
    // Now add a prototype property with same name
    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, "myExtern"));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));

    root.addChildToBack(assign);

    renamingPass = new RenamePrototypes(compiler, true, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    // myExtern is in externs, so it should not be renamed
    assertNull("Externed property should not be renamed", map.lookupNewName("myExtern"));
  }

  // ------------------------------------------------------------------
  // Test that reuse of previous rename map works
  // ------------------------------------------------------------------
  @Test
  public void testReusePreviousRenameMap() {
    // Build a previous map
    Map<String, String> prevMap = new HashMap<>();
    prevMap.put("oldProp", "a");
    prevMap.put("otherProp", "b");
    VariableMap prevUsedMap = new VariableMap(prevMap);

    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Add two prototype properties matching previous map
    Node assign1 = buildPrototypeAssign("OldProp"); // Note: case-sensitive
    Node assign2 = buildPrototypeAssign("OtherProp");
    root.addChildToBack(assign1);
    root.addChildToBack(assign2);

    // Add a third property not in previous map
    Node assign3 = buildPrototypeAssign("newProp_");
    root.addChildToBack(assign3);

    renamingPass = new RenamePrototypes(compiler, true, null, prevUsedMap);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();

    // "oldProp" should be reused as "a" if not reserved
    assertEquals("a", map.lookupNewName("oldProp"));
    assertEquals("b", map.lookupNewName("otherProp"));
    // "newProp_" should get a new name (not null)
    assertNotNull(map.lookupNewName("newProp_"));
  }

  // Helper to build a prototype assignment
  private Node buildPrototypeAssign(String propName) {
    Node protoGetProp = new Node(Token.GETPROP);
    protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
    protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.GETPROP);
    left.addChildToBack(protoGetProp);
    left.addChildToBack(Node.newString(Token.STRING, propName));
    assign.addChildToBack(left);
    assign.addChildToBack(new Node(Token.FUNCTION, "dummy"));
    return assign;
  }

  // ------------------------------------------------------------------
  // Test that process throws when stage is not NORMALIZED
  // ------------------------------------------------------------------
  @Test(expected = Exception.class)
  public void testProcessFailsAtWrongStage() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);
    // Should throw Preconditions.checkState exception
  }

  // ------------------------------------------------------------------
  // Test object literal property not renamed under non-aggressive mode
  // ------------------------------------------------------------------
  @Test
  public void testObjLitPropertyNotRenamedNonAggressive() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Create an object literal: { myProp: function(){} }
    Node objLit = new Node(Token.OBJECTLIT);
    // Property name and value as flat children
    Node propName = Node.newString(Token.STRING, "myProp");
    Node propValue = new Node(Token.FUNCTION, "dummy");
    objLit.addChildToBack(propName);
    objLit.addChildToBack(propValue);

    // Put it inside a VAR or assign? ProcessProperties looks at OBJLIT nodes directly.
    // So we add objLit as a child of root.
    root.addChildToBack(objLit);

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    // In non-aggressive mode, objlit property 'myProp' should not be renamed (isLowercase and no underscore)
    assertNull("Object literal property should not be renamed in non-aggressive mode", 
               map.lookupNewName("myProp"));
  }

  // ------------------------------------------------------------------
  // Test that getPropertyMap returns only renamed properties
  // ------------------------------------------------------------------
  @Test
  public void testGetPropertyMapReturnsOnlyRenamed() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Add two properties: one renameable and one not
    root.addChildToBack(buildPrototypeAssign("renameMe_"));
    root.addChildToBack(buildPrototypeAssign("dontRename")); // all lowercase, not private/exported

    renamingPass = new RenamePrototypes(compiler, false, null, null);
    renamingPass.process(externs, root);

    VariableMap map = renamingPass.getPropertyMap();
    assertTrue(map.getOriginalVariableToNewNameMap().containsKey("renameMe_"));
    assertFalse(map.getOriginalVariableToNewNameMap().containsKey("dontRename"));
  }
}