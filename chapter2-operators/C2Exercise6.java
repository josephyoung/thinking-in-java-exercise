import C2Exercise5.Dog;

/**
 * C2Exercise6:
 * (3)Following Exercise 5, create a new Dog reference and assign it to sopt's
 * object. Test for comparison using == and equals() for all references.
 */
public class C2Exercise6 {

  public static void main(String[] args) {
    Dog dogSpot = new Dog("spot", "Ruff!");
    Dog dogNew = new Dog("", "");
    dogNew = dogSpot;
    System.out.println(dogNew);
    System.out.println(dogNew.name == dogSpot.name);
    System.out.println(dogNew.say == dogSpot.say);
    System.out.println(dogNew.equals(dogSpot));
  }
}
