package chapter8_interfaces.c8exercise1.rodent;

/**
 * Gerbil
 */
public class Gerbil extends Rodent{

  @Override
  public String say() {
    return "Gerbil say";
  }

  @Override
  public void bite() {
    System.out.println("Gerbil bites");
  }
}
