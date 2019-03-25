/**
 * C7Exercise14:
 * (4)Modify Exercise 12 so that one of the member objects is a shared object
 * with reference counting, and demonstrate that it works properly.
 */
import chapter7_polymorphism.c7exercise14.rodent.*;

class C7Exercise14 {
  public static void main(String[] args) {
    Shared share = new Shared();
    Rodent[] rods = {
      new Mouse(share),
      new Gerbil(share),
      new Hamster(share),
    };
    for (Rodent r : rods) {
      System.out.println(r.say());
      r.bite();
      r.dispose();
    }
  }
}
