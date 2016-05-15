import some_package.ParentClass;

public class App extends ParentClass {
  public static void main(String[] args) {
    /* 
     * We can't access protected method. 
     * Even if we're inside child class 
     * and trying to access protected method
     * on instance of parent class.
     */
    ParentClass parentClass = new ParentClass();
	/* System.out.println(parentClass.sayHello()); */

    /*
     * But we can successfully access protected method
     * from child class through inheritance.
     */
    App app = new App();
    System.out.println(app.sayHello());
    /* And, certainly, it's possible in this way: */
    System.out.println(app.accessParentProtectedMethod());
  }

  public String accessParentProtectedMethod() {
    return sayHello();
  }
}
