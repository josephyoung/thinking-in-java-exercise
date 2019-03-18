/**
 * C4Exercise6:
 * (1)Modify the previous exercise so that two of the overloaded methods have
 * two arguments (of two different types), but in reversed order relative to
 * each other. Verify that this works.
 */
class Dog {

  void bark() {
    System.out.println("Barking!");
  }

  void bark(int i, double d) {
    System.out.println("Howling!");
  }

  void bark(double d, int i) {
    System.out.println("Shouting!");
  }

  void bark(String s) {
    System.out.println("Crying!");
  }
}

public class C4Exercise6 {

  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.bark();
    dog.bark(1, 1.0);
    dog.bark(1.0, 1);
    dog.bark("1");
  }
}
