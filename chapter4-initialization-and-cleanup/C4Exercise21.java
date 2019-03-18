/**
 * C4Exercise21:
 * (1)Create an enum of the least-valuable six types of paper currency. Loop
 * through the values() and print each value and its ordinal().
 */
public class C4Exercise21 {

  enum Currency {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
  }

  public static void main(String[] args) {
    for (Currency m : Currency.values()) {
      System.out.println("The ordinal of " + m + " is " + m.ordinal() + ".");
    }
  }
}
