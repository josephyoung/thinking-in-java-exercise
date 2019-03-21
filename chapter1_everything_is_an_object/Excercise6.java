/**
 * Excercise6
 */
public class Excercise6 {

  int storage(String s) {
    return s.length() * 2;
  }

  public static void main(String[] args) {
    Excercise6 ex = new Excercise6();
    int s = ex.storage("String");
    System.out.println(s);
  }
}
