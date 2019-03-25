package chapter7_polymorphism.c7exercise14.rodent;
/**
 * Rodent
 */
public class Rodent {

  private Description d = new Description("Rodent");
  private Shared share;
  private static long counter = 0;
  private final long id = counter++;

  public Rodent(Shared share) {
    System.out.println("construct Rodent");
    this.share = share;
    this.share.addRef();
  }

  public String say() {
    return "Rodent says";
  }

  public void bite() {
    System.out.println("Rodent bites");
  }

  public void dispose() {
    System.out.println("disposing " + getClass().getSimpleName() + " " + id);
    share.dispose();
  }
}
