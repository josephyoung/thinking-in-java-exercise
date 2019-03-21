/**
 * C7Exercise1:
 * (2)Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride()
 * method.
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
}

class Bicycle extends Cycle {
  void move() {
    System.out.println("Bicycle moves.");
  }
}

class Tricycle extends Cycle {
  void move() {
    System.out.println("Tricycle moves.");
  }
}

public class C7Exercise1 {

  static void ride(Cycle c) {
    c.move();
  }
  
  public static void main(String[] args) {
    Unicycle unicycle = new Unicycle();
    Bicycle bicycle = new Bicycle();
    Tricycle tricycle = new Tricycle();
    ride(unicycle);
    ride(bicycle);
    ride(tricycle);
  }
}
