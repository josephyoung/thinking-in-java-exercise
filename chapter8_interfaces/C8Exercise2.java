/**
 * C8Exercise2:
 * (1)Create a class as abstract without including any abstract methods and
 * verify that you cannot create any instance of that class.
 */

abstract class AbstractClass {
  void A() {}
  void B() {}
}

public class C8Exercise2 {

  public static void main(String[] args) {
    // try to create an instance of calss AbstractClass
    AbstractClass foo = new AbstractClass(); //compile time error
  }  
}
