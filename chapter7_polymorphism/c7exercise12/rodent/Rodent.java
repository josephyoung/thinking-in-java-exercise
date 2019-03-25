package chapter7_polymorphism.c7exercise12.rodent;
/**
 * Rodent
 */
public class Rodent {

  private Description d = new Description("Rodent");

  public Rodent() {
    System.out.println("construct Rodent");
  }

  public String say() {
    return "Rodent says";
  }

  public void bite() {
    System.out.println("Rodent bites");
  }

}
