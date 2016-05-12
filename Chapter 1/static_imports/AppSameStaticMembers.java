import static same_static_members.A.*;
import static same_static_members.B.*;

/* We need to  specify explicitly the import of member that is contained in two classes  */
import static same_static_members.A.SOME_CONST;

public class AppSameStaticMembers {
  public static void main(String[] args) {
    System.out.println(SOME_CONST);
  }
}