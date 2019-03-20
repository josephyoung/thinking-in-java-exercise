/**
 * C6Exercise17:
 * (1)Modify Exercise 16 so that Frog overrides the method definitions from the
 * base class (provides new definitions using the same method signatures). Note
 * what happens in main().
 */
class Amphibian {
  public String say() {
    return "Grrrrr";
  }

  public static void cry(Amphibian amph) {
    System.out.println("crying " + amph.say());
  }

  public static void howl(Amphibian amph) {
    System.out.println("howling " + amph.say());
  }
}

class Frog extends Amphibian {
  @Override
  public String say() {
    return "croak";
  }
}

class C6Exercise17 {
  public static void main(String[] args) {
    Frog frog = new Frog();
    Amphibian.cry(frog);
    Amphibian.howl(frog);
  }
}
