/**
 * C3Exercise8:
 * (2)Create a switch statement that prints a message for each case, and put the
 * switch inside a for loop that tries each case. Put a break after each case
 * and test it, then remove the breaks and see what happens.
 */
public class C3Exercise8 {

  static void testWithBreak() {
    for (int i = 0; i < 5; i++) {
      switch (i) {
        case 0:
          System.out.println("i = " + i);
          break;

        case 1:
          System.out.println("i = " + i);
          break;

        case 2:
          System.out.println("i = " + i);
          break;

        case 3:
          System.out.println("i = " + i);
          break;

        default:
          System.out.println("I am the default statement.");
          break;
      }
    }
  }

  static void testWithoutBreak() {
    for (int i = 0; i < 5; i++) {
      switch (i) {
        case 0:
          System.out.println("i = " + i);

        case 1:
          System.out.println("i = " + i);

        case 2:
          System.out.println("i = " + i);

        case 3:
          System.out.println("i = " + i);

        default:
          System.out.println("I am the default statement.");
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("Test with break:");
    testWithBreak();
    System.out.println("****************************************************");
    System.out.println("Test without break:");
    testWithoutBreak();
  }
}
