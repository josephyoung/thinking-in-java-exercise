/**
 * C4Exercise13:
 * (1)Verify the statements in the previous paragraph.
 */
class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup cup1;
  static Cup cup2;
  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups()");
  }
}

public class C4Exercise13 {

  public static void main(String[] args) {
    Cups.cup1.f(99);
    Cups.cup2.f(88);
    Cups cups1 = new Cups();
    Cups cups2 = new Cups();
  }
}
