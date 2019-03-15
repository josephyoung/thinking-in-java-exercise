/**
 * C3Exercise1:
 * (1)Modify the Exercise 1 so that the program exits by using the break keyword
 * at value 99. Try using return instead.
 */
public class C3Exercise7 {

  static void print1To100Break99() {
    for (int i = 1; i < 101; i++) {
      if(i == 99) {
        break;
      } else {
        System.out.println(i);
      }
    }
  }

  static void print1To100Return99() {
    for (int i = 1; i < 100; i++) {
      if(i == 99) {
        return;
      } else {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    print1To100Break99();
    print1To100Return99();
  }
}
