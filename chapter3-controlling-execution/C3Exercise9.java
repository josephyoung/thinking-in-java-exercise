/**
 * C3Exercise9:
 * (4)A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, and so on, where each number (from the third on) is the sum of the
 * previous two. Create a method that takes an integer as an argument and
 * display that many Fibonacci numbers starting from the begining, e.g., If you
 * run java Fibonacci 5 (where Fibonacci is the name of the calss) the output
 * will be: 1, 1, 2, 3, 5.
 **/

public class C3Exercise9 {

  static void Fibonacci (int n){
    if(n == 1) {
      System.out.println("1.");
    } else if (n == 2) {
      System.out.println("1, 1.");
    } else if (n >= 3) {
      System.out.print("1, 1");
      int prevPrev = 1, prev = 1;
      for (int i = 2, sen = 0; i < n; i++) {
        if (sen == 1) {
          System.out.println(".");
          System.err.println("The fibonacci sequence required is out of range. "
          + "The sequence stops at number: " + i + ".");
          return;
        } else {
          int cur = prevPrev + prev;
          System.out.print(", " + cur );
          sen = prev > (Integer.MAX_VALUE - cur) ? 1 : 0;
          prevPrev = prev;
          prev = cur;
        }
      }
      System.out.println(".");
      
    } else {
      System.err.println("Length of an array must be a positive integer.");
    }
  }

  public static void main(String[] args) {
    if(args.length == 1) {
      try {
        int len = Integer.parseInt(args[0]);
        Fibonacci(len);
      } catch (NumberFormatException e) {
        System.err.println("Usage: C3Exercise9 integer");
      }
    } else {
      System.err.println("Usage: C3Exercise9 integer");
    }
  }
}
