/**
 * C6Exercise23:
 * (2)Prove that class loading takes place only once. Prove that loading may be
 * caused by either the creation of the first instance of that class or by the
 * access of a static member.
 */
class Print{
  static int printInit(String s){
    System.out.println(s);
    return 0;
  }
}

class A {
  private static int i = Print.printInit("A initialized.");

  A() {
    System.out.println("constructor A");
  }
  static void a() {
    System.out.println("A.a()");
  }
}

class B {
  private int i = Print.printInit("B initialized.");
  B() {
    System.out.println("constructor B");
  }

}

public class C6Exercise23 {

  public static void main(String[] args) {
    System.out.println("Before class loading");
    A.a();
    B foo2 = new B();
    A foo1 = new A();
  }
}
