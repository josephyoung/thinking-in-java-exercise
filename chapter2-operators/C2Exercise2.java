/**
 * C2-Exercise2:
 * (1)Create a class containing a float and use it to demonstrate aliasing.
 */
public class C2Exercise2 {

  float f;

  public static void main(String[] args) {
    C2Exercise2 f1 = new C2Exercise2();
    f1.f = 1.618f;
    C2Exercise2 f2 = new C2Exercise2();
    f2 = f1;
    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);
    f1.f = 1.1024f;
    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);
    C2Exercise2 f3 = new C2Exercise2();
    f3.f = f1.f;
    System.out.println("f1.f = " + f1.f + ", f3.f = " + f3.f);
    f1.f = 3.14f;
    System.out.println("f1.f = " + f1.f + ", f3.f = " + f3.f);
  }
}
