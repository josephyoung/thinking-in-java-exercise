/**
 * Excercise3
 */
public class Excercise3 {
  public static void main(String[] args) {
    class ATypeName {
      @Override
      public String toString() {
        return getClass().getName();
      }
    }  
    ATypeName a = new ATypeName();
    System.out.println(a);
  }
}
