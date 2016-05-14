public interface MethodsOfInterfaceDeclaration {

  /* ALL of the interface methods are 'public' and 'abstract'. ALL. No matter 'public', 'abstract' specified explicitly or not.  */
  void methodWithoutExplicitModifiers();
  public void methodWithExplicitModifiers();
  abstract void methodWithSomeExplicitModifiers();
  abstract public void methodWithAllExplicitModifiersReordered();
  /*  In fact all preceding methods without explicitly set some modifiers compile into: */
  public abstract void methodWithAllExplicitModifiers();
  
  /* *** Incorrect modifiers for interface members *** */
  /* Each method of interface is implicitly abstract, so it can't be final simultaneously. */
  /* final */ void finalMethodIsIncorrect();
  
  /* Methods can't be either private  or protected, only public.. */ 
  /* private */ void privateMethodIsIncorrect();
  /* protected */ void protectedMethodIsIncorrect();
  
  /* Interface methods can't be static, interface defines only instance methods. */
  /* static */ void staticMethodIsIncorrect();
}
