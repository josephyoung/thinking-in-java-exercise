import c5exercise7.Widget;

/**
 * C5Exercise7:
 * (1)Create the library according to the code fragments describing access and
 * Widget. Create a Widget in a class that is not part of the access package.
 */
public class C5Exercise7 {

  public static void main(String[] args) {
    Widget foo = new Widget("Hello Widget");
    System.out.println(foo.getS());
    foo.setS("Hello again");
    System.out.println(foo.getS());
  }
}
