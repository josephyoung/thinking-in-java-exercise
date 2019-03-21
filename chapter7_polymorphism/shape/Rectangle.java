package chapter7_polymorphism.shape;

/**
 * rectangle
 */
public class Rectangle extends Shape{

  @Override
  public void draw() {
    print(this.getClass().getSimpleName() + ".draw()");
  }
  @Override
  public void erase() {
    print(this.getClass().getSimpleName() + ".erase()");
  }
  @Override
  public void display() {
    print(this.getClass().getSimpleName() + " display");
  }
}
