/**
 * C5Exercise8:
 * (4)Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The
 * client programmer must not be able to explictily create Connection objects,
 * but can only get them via a static method in CounectionManager. When the
 * ConnectionManager runs out of objects, it returns a null reference. Test the
 * classes in main().
 */
import c5exercise8.*;

public class C5Exercise8 {

  public static void main(String[] args) {
    for (int i = 0; i < 7; i++) {
      c5exercise8.Connection conn = 
      c5exercise8.ConnectionManager.getConnection();
      System.out.println(conn);
    }
  }
}
