/** 
 * (2)Create a class called Dog containing two Strings: name and says. In main(),
 * create two dog objects with names "spot" (who says, "Ruff!") and "scruffy" 
 * (who says, "Wurf!"). Then display their names and what they say.
 **/

class Dog {
  String name;
  String say;
  Dog (String name, String say) {
    this.name = name;
    this.say = say;
  }
  @Override
  public String toString() {
    return "Dog " + this.name + " says \"" + this.say + "\".";
  }
}

/**
 * C2Exercise5
 */
public class C2Exercise5 {

  public static void main(String[] args) {
    Dog dogSpot = new Dog("spot", "Ruff!");
    Dog dogScruffy = new Dog("scruffy", "Wurf!");
    System.out.println(dogSpot);
    System.out.println(dogScruffy);
  }
}
