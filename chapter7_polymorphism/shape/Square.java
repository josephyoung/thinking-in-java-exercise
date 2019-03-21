//: polymorphism/shape/Square.java
package chapter7_polymorphism.shape;

public class Square extends Shape {
  @Override
  public void draw() { print("Square.draw()"); }
  @Override
  public void erase() { print("Square.erase()"); }
  @Override
  public void display() {
    print("Square display");
  }
} ///:~
