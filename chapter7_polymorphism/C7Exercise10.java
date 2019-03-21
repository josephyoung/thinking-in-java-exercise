/**
 * C7Exercise10:
 * (3)Create a base class with two methods. In the first method, call the second
 * method. Inherit a class and override the second method. Create an object of
 * the derived class, upcast it to the base type, and call the first method.
 * Explain what happens.
 */
class Base {
  public void first() {
    second();
  }

  public void second() {
    System.out.println("base class");
  }
}

class Derived extends Base{
  @Override
  public void second() {
    System.out.println("derived class");
  }
}


public class C7Exercise10 {

  public static void Upcast(Base base) {
    base.first();
  }
  public static void main(String[] args) {
    Derived derived = new Derived();
    Upcast(derived);
  }
}
