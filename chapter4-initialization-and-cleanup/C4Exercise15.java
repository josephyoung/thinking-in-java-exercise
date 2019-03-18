/**
 * C4Exercise15:
 * (1)Create a class with a String that is initialized using instance
 * initialization.
 */
public class C4Exercise15 {

  String s;
  {
    s = "instance initialization";
  }
  public static void main(String[] args) {
    C4Exercise15 foo = new C4Exercise15();
    System.out.println(foo.s);
  }
}
