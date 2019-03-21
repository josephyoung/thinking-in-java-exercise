/**
 * C2Exercise11:
 * (3)Starts with a number that has a binary one in the most significant
 * position(hint: Use a hexadecimal constant). Using the signed right-shift
 * operator, right shift it all the way through all of its binary positions,
 * each time displaying the result using Integer.toBinaryString().
 */
public class C2Exercise11 {

  public static void main(String[] args) {
    for(int n = 0x8000; n != 0; n = n >> 1) {
      System.out.println(Integer.toBinaryString(n) + " = " + n);
    }
  }
}
