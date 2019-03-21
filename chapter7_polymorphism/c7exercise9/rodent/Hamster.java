package chapter7_polymorphism.c7exercise9.rodent;

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
