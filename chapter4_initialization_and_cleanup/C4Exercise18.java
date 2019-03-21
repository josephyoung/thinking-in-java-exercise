/**
 * C4Exercise18:
 * (1)Complete the previous exercise by creating objects to attach to the array
 * of references.
 */
public class C4Exercise18 {

  C4Exercise18(String s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    C4Exercise18[] objC4Exercise18s = {
      new C4Exercise18("first"),
      new C4Exercise18("second"),
      new C4Exercise18("third"),
    };
  }
}
