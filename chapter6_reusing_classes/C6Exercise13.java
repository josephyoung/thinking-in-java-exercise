/**
 * C6Exercise13:
 * (2)Create a class with a method that is overloaded threee times. Inherit a
 * new class, add a new overloading of the method, and show that all four
 * methods are available in the derived class.
 */
class OverloadedThree {
  void ot(int i) {
    System.out.println(i);
  }

  void ot(boolean bool) {
    System.out.println(bool);
  }

  void ot(String s) {
    System.out.println(s);
  }
}

class NewFour extends OverloadedThree{
  void ot(double d) {
    System.out.println(d);
  }
}

public class C6Exercise13 {

  public static void main(String[] args) {
    NewFour test = new NewFour();
    test.ot(1);
    test.ot(true);
    test.ot("hello");
    test.ot(1.0);
  }  
}
