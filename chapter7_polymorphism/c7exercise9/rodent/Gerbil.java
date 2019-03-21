package chapter7_polymorphism.c7exercise9.rodent;

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
