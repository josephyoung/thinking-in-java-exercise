/**
 * C6Exercise7:
 * (1)Modify Exercise 5 so that A and B have constructors with arguments instead
 * of default constructors. Write a constructor for C and perform all
 * initialization within C's constructor.
 */
class A {
  A(String s) {
    System.out.println("A: " + s);
  }
}

class B {
  B(String s) {
    System.out.println("B: " + s);
  }
}

class C extends A {
  C(String s1, String s2, String s3) {
    super(s1);
    System.out.println("C: " + s3);
    System.out.println(new B(s2));
  }
}

public class C6Exercise7 {

  public static void main(String[] args) {
    new C("constructor A", "constructor B", "constructor C");
  }
}
