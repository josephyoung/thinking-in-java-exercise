package chapter7_polymorphism.c7exercise12.rodent;

/**
 * Hamster
 */
public class Hamster extends Rodent {

  private Description d = new Description("Hamster");

  public Hamster() {
    System.out.println("construct Hamster");
  }
  
  @Override
  public String say() {
    return "Hamster says";
  }

  @Override
  public void bite() {
    System.out.println("Hamster bites");
  }
}
