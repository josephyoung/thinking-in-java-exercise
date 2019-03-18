/**
 * C4Exercise22:
 * (2)Write a switch statement for the enum in the previous example. For each
 * case, output a description of that particular currency.
 */
public class C4Exercise22 {

  enum Currency {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
  }

  public static void main(String[] args) {
    for (Currency m : Currency.values()) {
      switch (m) {
        case ONE:
          System.out.println("1 dollar");
          break;
        case FIVE:
          System.out.println("5 dollars");
          break;
        case TEN:
          System.out.println("10 dollars");
          break;
        case TWENTY:
          System.out.println("20 dollars");
          break;
        case FIFTY:
          System.out.println("50 dollars");
          break;
        case HUNDRED:
          System.out.println("100 dollars");
          break;
        default:
          break;
      }
    }
  }
}
