/**
 * C6Exercise16:
 * (2)Create a class called Amphibian. From this, inherit a class called Frog.
 * Put appropriate methods in the base class. In main(), create a Frog and
 * upcast it to Amphibian and demonstrate that all the methods still work.
 */

class Amphibian {
  private String name;

  public String getName() {
    return name;
  }

  public static void eat(Amphibian amph) {
    System.out.println(amph.getName() + " eats.");
  }

  public static void walk(Amphibian amph) {
    System.out.println(amph.getName() + " walks.");
  }
}

class Frog extends Amphibian {
  private String name = "a frog";
  
  @Override
  public String getName() {
    return name;  
  }

  public void say() {
    System.out.println(getName() + " says.");
  }
}

public class C6Exercise16 {

  public static void main(String[] args) {
    Frog frog = new Frog();
    Amphibian.eat(frog);
    Amphibian.walk(frog);
  }
}
