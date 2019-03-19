/**
 * C6Exercise1:
 * (2)Create a simple class. Inside a second class, define a reference to an
 * object of the first class. Use lazy initialization to instantiate this object.
 */
class Simple {}

class Second {
  Simple simple;

  String doSimple() {
    simple = new Simple();
    return "lazy initialization a simple class: " + simple;
  }
}

public class C6Exercise1 {

  public static void main(String[] args) {
    Second foo = new Second();
    System.out.println(foo.simple);
    System.out.println(foo.doSimple());
  }
}
