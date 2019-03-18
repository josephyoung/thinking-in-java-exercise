/**
 * C4Exercise5:
 * (2)Create a class called Dog with an overloaded bark() method. This method
 * should be overloaded based on various primitive data types, and print
 * different types of barking, howling, etc., depending on which overloaded
 * version is called. Write a main() that calls all the different versions.
 */
class Dog {

  void bark() {
    System.out.println("Barking!");
  }

  void bark(int i) {
    System.out.println("Howling!");
  }

  void bark(double d) {
    System.out.println("Shouting!");
  }

  void bark(String s) {
    System.out.println("Crying!");
  }
}

public class C4Exercise5 {

  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.bark();
    dog.bark(1);
    dog.bark(1.0);
    dog.bark("1");
  }
}
