/**
 * C2Exercise14:
 * (3) Write a method that takes two String arguments and uses all the boolean
 * comparisions to compare the two Strings and print the results. For the ==
 * and !=, also perform the equals() test. In main(), call your method with
 * some different String objects.
 */
public class C2Exercise14 {

  static void showStrComp (String a, String b) {
    System.out.println(a == b ? a + " == " + b + ".": a + " != " + b + ".");
    System.out.println(a != b ? a + " != " + b + ".": a + " == " + b + ".");
    System.out.println(a.equals(b) ? a + " equals " + b : a +
      " does not equal " + b + ".");
  }

  public static void main(String[] args) {
    showStrComp("yes", "yes");
    showStrComp("Lorem ipsum dolor sit amet", "Lorem, ipsum dolor sit amet");
    String s1 = new String("abc");
    String s2 = new String("abc");
    showStrComp("abc", s1);
    showStrComp(s1, s2);
  }
}
