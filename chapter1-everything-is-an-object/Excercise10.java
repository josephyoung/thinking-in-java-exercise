/**
 * Excercise10
 */
public class Excercise10 {

  public static void main(String[] args) {
    if (args.length >= 3) {
      for (int i = 0; i < 3; i++) {
        System.out.println("The " + (i + 1) + "th param is " + args[i] + ".");
      }
    } else {
      System.out.println("3 params are needed for this program.");
    }
  }
}
