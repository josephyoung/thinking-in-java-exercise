package chapter8_interfaces.c8exercise1.rodent;

/**
 * Hamster
 */
public class Hamster extends Rodent {

  @Override
  public String say() {
    return "Hamster says";
  }

  @Override
  public void bite() {
    System.out.println("Hamster bites");
  }
}
