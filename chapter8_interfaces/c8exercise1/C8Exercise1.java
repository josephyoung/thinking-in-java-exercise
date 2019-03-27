/**
 * C8Exercise1:
 * (1)Modify Exercise 9 in the previous chapter so that Rodent is an abstract
 * class. Make the methods of Rodent abstract whenever possible.
 */
import chapter8_interfaces.c8exercise1.rodent.*;

class C8Exercise1 {
  public static void main(String[] args) {
    Rodent[] rods = {
      new Mouse(),
      new Gerbil(),
      new Hamster(),
    };
    for (Rodent r : rods) {
      System.out.println(r.say());
      r.bite();
    }
  }
}
