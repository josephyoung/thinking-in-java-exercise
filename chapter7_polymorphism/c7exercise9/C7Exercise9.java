/**
 * C7Exercise9:
 * (3)Create an inheritance hierachy of Rodent: Mouse, Gerbil, Hamster, etc. In
 * the base class, provide methods that are common to all Rodents, and override
 * these in the derived classes to perform different behaviors depending on the
 * specific type of Rodent. Create an array of Rodent, fill it with differnt
 * specific types of Rodents, and call your base-class methods to see what
 * happens.
 */
import chapter7_polymorphism.c7exercise9.rodent.*;

class C7Exercise9 {
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
