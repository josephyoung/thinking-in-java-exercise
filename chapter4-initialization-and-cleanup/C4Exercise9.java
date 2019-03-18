/**
 * C4Exercise9:
 * (1)Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one.
 */
public class C4Exercise9 {

  C4Exercise9() {
    System.out.println("The first constructor calls.");
  }

  C4Exercise9(String s) {
    this();
    System.out.println(s);
  }

  public static void main(String[] args) {
    C4Exercise9 foo = new C4Exercise9("The second constructor calls.");
  }
}
