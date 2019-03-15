/**
 * C3Exercise4:
 * (3)Write a program that uses two nested for loops and the modulus operator(%)
 * to detect and print prime numbers(integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1).
 */
public class C3Exercise4 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i < Integer.MAX_VALUE; i++) {
      if(i == 1 || i == 2) {
        System.out.print(i + "\t");
        count++;
      } else {
        boolean isPrime = true;
        for (int j = 2; j < i; j++) {
          if(i % j == 0) {
            isPrime = false;
            break;
          }
        }
        if(isPrime) {
          System.out.print(i + "\t");
          count++;
          if(count == 10) {
            System.out.println();
            count = 0;
          }
        }
      }
    }
  }
}
