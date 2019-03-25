/**
 * C7Exercise17:
 * (2)Using the Cycle hierachy from Exercise 1, add a balance() method to
 * Unicycle and Bicycle, but not to Tricycle. Create instances of all three
 * types and upcast them to an array of Cycle. Try to call balance() on each
 * element of the array and observe the results. Downcast and call balance() and
 * observe what happens.
 */

class Cycle {
  void move() {
    System.out.println("Cycle moves.");
  }
}

class Unicycle extends Cycle {
  void move() {
    System.out.println("Unicycle moves.");
  }

  void balance() {
    System.out.println("Unicycle balance.");
  }
}

class Bicycle extends Cycle {
  void move() {
    System.out.println("Bicycle moves.");
  }

  void balance() {
    System.out.println("Bicycle balance.");
  }
}

class Tricycle extends Cycle {
  void move() {
    System.out.println("Tricycle moves.");
  }
}

public class C7Exercise17 {

  static void ride(Cycle c) {
    c.move();
  }
  
  public static void main(String[] args) {
    Cycle[] c = {
      new Unicycle(),
      new Bicycle(),
      new Tricycle(),
    };
    // for (Cycle item : c) {
    //   item.balance();
    // }
    ((Unicycle)c[0]).balance();
    ((Bicycle)c[1]).balance();
    // ((Tricycle)c[2]).balance();
  }
}
