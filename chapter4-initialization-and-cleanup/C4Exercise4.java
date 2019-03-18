/**
 * C4Exercise4:
 * (1)Add an overloaded constructor to the previous exercise that takes a String
 * argument and prints it along with your message.
 */
public class C4Exercise4 {

  C4Exercise4() {
    System.out.println("The default constructor is called.");
  }

  C4Exercise4(String s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    C4Exercise4 obj1 = new C4Exercise4();
    C4Exercise4 obj2 = new C4Exercise4("The constructor with a String parameter.");
  }
}
