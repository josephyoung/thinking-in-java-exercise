/**
 * C3Exercise10:
 * (5)A vampire number has an even number of digits and is formed by multiplying
 * a pair of numbers containing half the number of digits of the result. The
 * digits are taken from the original number in any order. Pairs of trailing
 * zeroes are not allowed.
 * Examples include:
 * 1260 = 21 * 60
 * 1827 = 21* 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers.
 * (suggested by Dan Forhan.)
 */
class FourDigitNumber {
  int value;
  boolean isVampire;
  String vampireEquationString;

  FourDigitNumber(int n) {
    if(n <= 9999 && n >= 1000) {
      this.value = n;
    } else {
      this.value = 0;
    }
    this.isVampire = false;
    this.vampireEquationString = "";
  }

  int[] digits() {
    int[] res = {};
    return res;
  }

  int[][] halfDigitNumberPairs(int[] digits) {
    int[][] res = {};
    

    return res;
  }

  boolean testVampire() {
    int[] digits = this.digits();
    if(digits[2] == 0 && digits[3] == 0) {
      return false;
    }
    int[][] halfDigitNumberPairs = this.halfDigitNumberPairs(digits);
    for (int[] pair : halfDigitNumberPairs) {
      if (this.value == pair[0] * pair[1]) {
        this.isVampire = true;
        this.vampireEquationString = this.value + " = " + pair[0] + " * " +
        pair[1];
        break;
      }
    }
    return this.isVampire;
  }

  @Override
  public String toString() {
    return this.vampireEquationString;
  }
}

/**
 * C3Exercise10
 */
public class C3Exercise10 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 1000; i < 10000; i++) {
      FourDigitNumber n = new FourDigitNumber(i);
      if(n.testVampire()) {
        count++;
        System.out.println(n);
      }
    }
    System.out.println("There are " + count +
    " 4-digit vampire numbers in total.");
  }
}
