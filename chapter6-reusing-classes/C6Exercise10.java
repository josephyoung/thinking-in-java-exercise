/**
 * C6Exercise10:
 * (1)Modify the previous exercise so that each class only has non-default
 * constructors.
 */
class Component1 {
  Component1(int i) {
    System.out.println("class Component1");
  }
}

class Component2 {
  Component2(int i) {
    System.out.println("class Component2");
  }
}

class Component3 {
  Component3(int i) {
    System.out.println("class Component3");
  }
}

class Root {
  Component1 com1 = new Component1(1);
  Component2 com2 = new Component2(2);
  Component3 com3 = new Component3(3);

  Root(int i) {
    System.out.println("class Root");
  }
}

class Stem extends Root {
  Component1 com1 = new Component1(1);
  Component2 com2 = new Component2(2);
  Component3 com3 = new Component3(3);
  
  Stem(int i) {
    super(i);
    System.out.println("class Stem");
  }
}

public class C6Exercise10 {

  public static void main(String[] args) {
    new Stem(1);
  }  
}
