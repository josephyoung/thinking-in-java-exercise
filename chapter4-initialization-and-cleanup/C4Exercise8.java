/**
 * C4Exercise8:
 * (1)Create a class with two methods. Within the first method, call the second
 * method twice: the first time without using this, and the second time using
 * this - just to see it working; you should not use this form in practice.
 */
public class C4Exercise8 {

  void first() {
    second();
    this.second();
  }

  void second() {
    System.out.println("Method calls.");
  }

  public static void main(String[] args) {
    C4Exercise8 foo = new C4Exercise8();
    foo.first();
  }
}
