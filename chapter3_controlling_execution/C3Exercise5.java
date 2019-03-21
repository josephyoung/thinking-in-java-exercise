/**
 * C3Exercise5:
 * (4)Repeat Exercise 10 from the previous chapter, using the ternary operator
 * and a bitwise test to diaplay the ones and zeroes, instead of
 * Integer.toBinaryString()
 */
public class C3Exercise5 {

  static String toBinaryString(int i) {
    if(i != 0) {
      String res = "";
      for(; i != 0; i >>>= 1) {
        res = (i & 1) == 1 ? "1" + res : "0" + res;
      }
      return res;
    } else {
      return "0";
    }
  }

  public static void main(String[] args) {
    int const1 = 0xaaaa;
    int const2 = 0x5555;
    System.out.println(toBinaryString(const1));
    System.out.println(toBinaryString(const2));
    System.out.println(toBinaryString(~const1));
    System.out.println(toBinaryString(~const2));
    System.out.println(toBinaryString(const1 & const2));
    System.out.println(toBinaryString(const1 | const2));
    System.out.println(toBinaryString(const1 ^ const2));
  }
}
