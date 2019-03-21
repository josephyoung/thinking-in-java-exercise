package chapter7_polymorphism.c7exercise9.rodent;

/**
 * Mouse
 */
public class Mouse extends Rodent {

  @Override
  public String say() {
    return "Mouse says";
  }

  @Override
  public void bite() {
    System.out.println("Mouse bites");
  }
}
