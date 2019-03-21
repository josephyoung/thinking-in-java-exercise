import java.util.Random;

/**
 * C3Exercise3:
 * (1)Modify Exercise 2 so that your code is surrounded by an "infinite" while
 * loop. It will then run until you interrupt it from the keyboard(typically
 * by pressing Control-C).
 */
public class C3Exercise3 {

  public static void main(String[] args) {
    Random rand = new Random();
    int currInt, nextInt;
    nextInt = rand.nextInt();
    int i = 0;
    while (true) {
      currInt = nextInt;
      nextInt = rand.nextInt();
      i += 1;
      if (currInt < nextInt) {
        System.out.println(i + ". " + currInt + " is less than " +
          nextInt + ".");
      } else if(currInt == nextInt) {
        System.out.println(i + ". " + currInt + " is equal to " +
          nextInt + ".");
      } else {
        System.out.println(i + ". " + currInt + " is greater than " +
          nextInt + ".");
      }
    }
  }
}
