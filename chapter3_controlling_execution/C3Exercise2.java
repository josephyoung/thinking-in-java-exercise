import java.util.Random;

/**
 * C3Exercise2:
 * (2)Write a program that generates 25 random int values. For each value,
 * use an if-else statement to classify it as greater than, less than, or
 * equal to a second randomly generated value.
 */
public class C3Exercise2 {

  public static void main(String[] args) {
    Random rand = new Random();
    int currInt, nextInt;
    nextInt = rand.nextInt();
    for (int i = 0; i < 25; i++) {
      currInt = nextInt;
      nextInt = rand.nextInt();
      if (currInt < nextInt) {
        System.out.println((i + 1) + ". " + currInt + " is less than " +
          nextInt + ".");
      } else if(currInt == nextInt) {
        System.out.println((i + 1) + ". " + currInt + " is equal to " +
          nextInt + ".");
      } else {
        System.out.println((i + 1) + ". " + currInt + " is greater than " +
          nextInt + ".");
      }
    }
  }
}
