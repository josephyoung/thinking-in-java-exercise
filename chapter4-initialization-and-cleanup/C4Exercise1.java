/**
 * C4Exercise1:
 * (1)Create a class containing an uninitialized String reference. Demonstrate
 * that this reference is initialized by Java to null.
 */
public class C4Exercise1 {

  int s;

  public static void main(String[] args) {
    C4Exercise1 foo = new C4Exercise1();

    System.out.println(foo.s);
  }
}
