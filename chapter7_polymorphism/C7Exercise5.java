/**
 * C7Exercise5:
 * (1)Starting from Exercise 1, add a wheels() method in Cycle, which returns
 * the number of wheels. Modify ride() to call wheels() and verify that.
 */

class Cycle {
  void move() {
    System.out.println("Cycle moves.");
  }
  int wheels() {
    return 0;
  }
}

class Unicycle extends Cycle {
  void move() {
    System.out.println("Unicycle moves.");
  }
  int wheels() {
    return 1;
  }
}

class Bicycle extends Cycle {
  void move() {
    System.out.println("Bicycle moves.");
  }
  int wheels() {
    return 2;
  }
}

class Tricycle extends Cycle {
  void move() {
    System.out.println("Tricycle moves.");
  }
  int wheels() {
    return 3;
  }
}

public class C7Exercise5 {

  static void ride(Cycle c) {
    c.move();
    System.out.println(c.wheels());
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
