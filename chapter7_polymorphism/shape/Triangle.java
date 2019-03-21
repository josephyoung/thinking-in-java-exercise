//: polymorphism/shape/Triangle.java
package chapter7_polymorphism.shape;

public class Triangle extends Shape {
  @Override
  public void draw() { print("Triangle.draw()"); }
  @Override
  public void erase() { print("Triangle.erase()"); }
  @Override
  public void display() {
    print("Triangle display");
  }
} ///:~
