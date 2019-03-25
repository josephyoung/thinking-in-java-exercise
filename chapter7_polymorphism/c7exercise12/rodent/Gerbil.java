package chapter7_polymorphism.c7exercise12.rodent;

/**
 * Gerbil
 */
public class Gerbil extends Rodent{

  private Description d = new Description("Gerbil");

  public Gerbil() {
    System.out.println("construct Gerbil");
  }

  @Override
  public String say() {
    return "Gerbil say";
  }

  @Override
  public void bite() {
    System.out.println("Gerbil bites");
  }
}
