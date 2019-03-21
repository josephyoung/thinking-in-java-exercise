/**
 * C2Exercise12:
 * (3) Start with a number that is all binary ones. Left shift it, then use
 * the unsigned right-shift operator to right shift through all of its binary
 * positions, each time displaying the result using Integer.toBinaryString().
 */
public class C2Exercise12 {

  public static void main(String[] args) {
    for(int n = 0xffff << 1; n !=0; n = n >>> 1) {
      System.out.println(Integer.toBinaryString(n));
    }
  }
}
