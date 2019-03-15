/**
 * C2Exercise8:
 * (2)Show that hex and octal notations work with long values. Use
 * Long.toBinaryString() to display the results.
 */
public class C2Exercise8 {

  public static void main(String[] args) {
    long lHex = 0xaf;
    System.out.println("lHex = " + Long.toBinaryString(lHex));
    long lOct = 027;
    System.out.println("lOct = " + Long.toBinaryString(lOct));
  }
}
