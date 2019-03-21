/**
 * C4Exercise17:
 * (2)Create a class with a constructor that takes a String argument. During
 * construction, print the argument. Create an array of object references to
 * this class, but don't actually create objects to assign into the array.
 * When you run the program, notice whether the initialization messages from the
 * constructor calls are printed.
 */
public class C4Exercise17 {

  C4Exercise17(String s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    C4Exercise17[] objC4Exercise17s;
  }
}
