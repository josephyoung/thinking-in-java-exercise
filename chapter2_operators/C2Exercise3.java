/**
 * C2Exercise3:
 * (1)Create a class containing a float and use it to demonstrate aliasing
 * during method calls.
 */
class Number {
  float f;
}

public class C2Exercise3 {

  static void f(Number n) {
    n.f = 1.618f;
  }

  public static void main(String[] args) {
    Number n = new Number();
    n.f = 3.14f;
    System.out.println("1: n.f: " + n.f);
    f(n);
    System.out.println("2: n.f: " + n.f);
  }
}
