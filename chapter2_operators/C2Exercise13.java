/**
 * C2Exercise13:
 * (1)Write a method that displays char values in binary form. Demonstrate it
 * using several different characters.
 */
public class C2Exercise13 {

  static String ch2BinString(char ch) {
    return Integer.toBinaryString(ch);
  }

  public static void main(String[] args) {
    System.out.println(ch2BinString('a'));
    System.out.println(ch2BinString('A'));
    System.out.println(ch2BinString('&'));
    System.out.println(ch2BinString('|'));
    System.out.println(ch2BinString('\n'));
    System.out.println(ch2BinString('\b'));
    System.out.println(ch2BinString('\r'));
  }
}
