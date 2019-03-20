import java.util.Random;

/**
 * C6Exercise18:
 * (2)Create a class with a static final field and a final field and demonstrate
 * the difference between the two.
 */

/**
 * C6Exercise18
 */
public class C6Exercise18 {

  private static final int I_1 = 24678;
  private final int I_2 = (new Random()).nextInt();

  public static void main(String[] args) {
    System.out.println(I_1);
    C6Exercise18 foo = new C6Exercise18();
    System.out.println(foo.I_2);
  }
}
