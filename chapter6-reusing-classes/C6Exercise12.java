/**
 * C6Exercise12:
 * (3)Add a proper hierachy of dispose() methods to all the classes in Exercise 9.
 */
class Component1 {
  Component1() {
    System.out.println("class Component1");
  }
  void dispose() {
    System.out.println("Component1 dispose");
  }
}

class Component2 {
  Component2() {
    System.out.println("class Component2");
  }
  void dispose() {
    System.out.println("Component2 dispose");
  }
}

class Component3 {
  Component3() {
    System.out.println("class Component3");
  }
  void dispose() {
    System.out.println("Component3 dispose");
  }
}

class Root {
  Component1 com1 = new Component1();
  Component2 com2 = new Component2();
  Component3 com3 = new Component3();

  Root() {
    System.out.println("class Root");
  }
  void dispose() {
    com1.dispose();
    com2.dispose();
    com3.dispose();
    System.out.println("Root dispose");
  }
}

class Stem extends Root {
  Stem() {
    System.out.println("class Stem");
  }

  void dispose() {
    super.dispose();
    System.out.println("Stem dispose");
  }
}

public class C6Exercise12 {

  public static void main(String[] args) {
    Stem stem = new Stem();
    try{
    } finally {
      stem.dispose();
    }
  }
}
