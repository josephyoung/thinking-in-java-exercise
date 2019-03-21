/**
 * C6Exercise9:
 * (2)Create a class called Root that contains an instance of each of the
 * classes (that your also create) named Component1, Component2, and Component3.
 * Derive a class Stem from Root that also contains an instance of each
 * "component." All classes should have default constructors that print a
 * message about that class.
 */
class Component1 {
  Component1() {
    System.out.println("class Component1");
  }
}

class Component2 {
  Component2() {
    System.out.println("class Component2");
  }
}

class Component3 {
  Component3() {
    System.out.println("class Component3");
  }
}

class Root {
  Component1 com1 = new Component1();
  Component2 com2 = new Component2();
  Component3 com3 = new Component3();

  Root() {
    System.out.println("class Root");
  }
}

class Stem extends Root {
  Component1 com1 = new Component1();
  Component2 com2 = new Component2();
  Component3 com3 = new Component3();
  
  Stem() {
    System.out.println("class Stem");
  }
}

public class C6Exercise9 {

  public static void main(String[] args) {
    new Stem();
  }  
}
