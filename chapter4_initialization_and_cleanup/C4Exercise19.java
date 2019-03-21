/**
 * C4Exercise19:
 * (2)Write a method that takes a vararg String array. Verify that your can pass
 * either a comma-separated list of Strings or a String[] into this method.
 */
public class C4Exercise19 {

  static void varargString(String... args) {
    for (String s : args) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    C4Exercise19.varargString("first", "second", "third");
    String[] strings = {
      "1st",
      "2nd",
      "3rd",
    };
    C4Exercise19.varargString(strings);
  }
}
