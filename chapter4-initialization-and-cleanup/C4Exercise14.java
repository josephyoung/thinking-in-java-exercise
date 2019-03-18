/**
 * C4Exercise14:
 * (1)Create a class with a static String field that is initialized at the point
 * of definition, and another one that is initialized by the static block. Add a
 * static method that prints both fields and demonstrates that they are both
 * initialized before they are used.
 */
public class C4Exercise14 {

  static String s1 = "initialized at definition";
  static String s2;
  static {
    s2 = "initialized by static block";
  }

  static void p() {
    System.out.println(s1);
    System.out.println(s2);
  }
  public static void main(String[] args) {
    p();
  }
}
