//: polymorphism/shape/Circle.java
package chapter7_polymorphism.shape;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }
  @Override
  public void display() { print("Circle display"); }
} ///:~
