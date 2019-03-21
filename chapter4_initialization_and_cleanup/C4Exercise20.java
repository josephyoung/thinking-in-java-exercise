/**
 * C4Exercise20:
 * (1)Create a main() that uses varargs instead of the ordinary main() syntax.
 * Print all the elements in the resulting args array. Test it with various
 * numbers of command-line arguments.
 */
public class C4Exercise20 {

  public static void main(String[] args) {
    TestVarargs.main("first");
    TestVarargs.main("first", "second");
    TestVarargs.main("fiddle", "de", "dum");
  }
}

class TestVarargs {
  public static void main(String... args) {
    for (String s : args) {
      System.out.println(s);
    }
  }
}
