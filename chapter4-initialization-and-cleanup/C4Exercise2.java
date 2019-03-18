/**
 * C4Exercise2:
 * (2)Create a class with a String field that is initialized at the point of
 * definition, and another one that is initialized by the constructor. What is
 * the difference between the two approaches?
 */
public class C4Exercise2 {

  String s1 = "String s1 is initialized at the point of definition.";
  String s2;

  C4Exercise2() {
    System.out.println(s1);
    System.out.println("String s2 is initialized at point of definition by" +
    " Java with the value " + s2 + ".");
    s2 = "String s2 is initialized by the constructor after definition.";
  }

  public static void main(String[] args) {
    C4Exercise2 foo = new C4Exercise2();

    System.out.println(foo.s2);
  }
}
