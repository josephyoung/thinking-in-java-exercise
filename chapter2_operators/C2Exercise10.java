/**
 * C2Exercise10:
 * (3)Write a program with two constant values, one with alternating binary
 * ones and zeroes, with a zero in the least-significant digit, and the
 * second, also alternating, with a one in the least-significant digit(hint:
 * It's easiest to use hexadecimal constants for this). Take these two values
 * and combine them in all possible ways using the bitwise operators, and
 * display the results using Integer.toBinaryString().
 */
public class C2Exercise10 {

  public static void main(String[] args) {
    int const1 = 0xaaaa;
    int const2 = 0x5555;
    System.out.println(Integer.toBinaryString(const1));
    System.out.println(Integer.toBinaryString(const2));
    System.out.println(Integer.toBinaryString(~const1));
    System.out.println(Integer.toBinaryString(~const2));
    System.out.println(Integer.toBinaryString(const1 & const2));
    System.out.println(Integer.toBinaryString(const1 | const2));
    System.out.println(Integer.toBinaryString(const1 ^ const2));
    
  }
}
