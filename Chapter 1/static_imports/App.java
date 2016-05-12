import static somepack.Foo.*;

/* All static members can be imported, not only final (fields)  */
public class App {
  public static void main(String[] args) {
    System.out.println(notFinalConst);
  }
}