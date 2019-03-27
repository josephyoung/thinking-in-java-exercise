package chapter8_interfaces.c8exercise1.rodent;

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
