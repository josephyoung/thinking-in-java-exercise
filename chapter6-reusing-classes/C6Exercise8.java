/**
 * C6Exercise8:
 * (1)Create a base class with only a non-default constructor, and a derived
 * class with both a default(no-arg) and non-default constructor. In the
 * derived-class constructors, call the base-class constructor.
 */

class BaseClass {
  BaseClass(String s) {
    System.out.println("base: " + s);
  }
}

class DerivedClass extends BaseClass{
  DerivedClass() {
    super("default string");
    System.out.println("derived: default");
  }

  DerivedClass(String s) {
    super(s);
    System.out.println("derived: non-default");
  }
}

public class C6Exercise8 {

  public static void main(String[] args) {
    new DerivedClass();
    new DerivedClass("non-default string");
  }  
}
