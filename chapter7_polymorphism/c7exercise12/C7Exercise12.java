/**
 * C7Exercise12:
 * (3)Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes. Now add member objects to both the base
 * and derive classes and show the order in which their initialization occurs
 * during construction.
 */
import chapter7_polymorphism.c7exercise12.rodent.*;

class C7Exercise12 {
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
