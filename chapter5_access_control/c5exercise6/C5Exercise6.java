/**
 * C5Exercise6:
 * (1)Create a class with protected data. Create a second class in the same file
 * with a method that manipulates the protected data in the first class.
 */
class DataProtected {
  protected String s;

  DataProtected(String s) {
    this.s = s;
  }

  String getS() {
    return s;
  }
}

public class C5Exercise6 {
  public static void main(String[] args) {
    DataProtected foo = new DataProtected("data protected");
    System.out.println(foo.getS());
    foo.s += ", now is manipulated by another class method.";
    System.out.println(foo.getS());
  }
}
