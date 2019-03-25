package chapter7_polymorphism.c7exercise14.rodent;

/**
 * Mouse
 */
public class Mouse extends Rodent {

  private Description d = new Description("Mouse");

  public Mouse(Shared share) {
    super(share);
    System.out.println("construct Mouse");
  }
  
  @Override
  public String say() {
    return "Mouse says";
  }

  @Override
  public void bite() {
    System.out.println("Mouse bites");
  }
}
