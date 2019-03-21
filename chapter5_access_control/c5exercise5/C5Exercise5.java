/**
 * C5Exercise5:
 * (2)Create a class with public, private, protected, and package-access fields
 * and method members. Create an object of this class and see what kind of
 * compiler messages your get when you try to access all the class members. Be
 * aware that classses in the same directory are part of the "defualt" package.
 */
public class C5Exercise5 {

  public static void main(String[] args) {
    ContainClass foo = new ContainClass();
    System.out.println(foo.s); // public access
    // System.out.println(foo.i);    // private access, can not compile
    System.out.println(foo.d);  // protected access
    System.out.println(foo.ch); // package access
    System.out.println(foo.getS()); // public access
    // System.out.println(foo.getI());  // private access, can not compile
    System.out.println(foo.getD()); // protected access
    System.out.println(foo.getCh()); // package access
  }
}
