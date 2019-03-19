/**
 * C6Exercise3:
 * (2)Prove the previous sentence.
 */
class Art {
  Art() {
    System.out.println("Art constructor");
  }
}

class Drawing extends Art {
  Drawing() {
    System.out.println("Drawing constructor");
  }
}

class Cartoon extends Drawing{}

public class C6Exercise3 {

  public static void main(String[] args) {
    new Cartoon();
  }
}
