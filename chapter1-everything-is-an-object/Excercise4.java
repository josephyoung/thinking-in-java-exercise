/**
 * Excercise4
 */
public class Excercise4 {

  public static void main(String[] args) {
    class DataOnly {
    
      int i;
      double d;
      boolean b;
      DataOnly(int ii, double dd, boolean bb) {
        i = ii;
        d = dd;
        b = bb;
      }
    }

    DataOnly data = new DataOnly(22, 33.0, true);
    System.out.println(data.i);
    System.out.println(data.d);
    System.out.println(data.b);
  }
}
