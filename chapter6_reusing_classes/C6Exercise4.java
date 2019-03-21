/**
 * C6Exercise4:
 * (2)Prove that the base-class constructors are (a) always called and (b)
 * called before derived-class constructors.
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
