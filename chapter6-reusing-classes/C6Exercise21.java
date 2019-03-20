/**
 * C6Exercise21:
 * (1)Create a class with a final method. Inherit from that class and attempt
 * to overwrite that method.
 */

class ClassFinalMethod {
  public final void show() {
    System.out.println("class with a final method");
  }
}

public class C6Exercise21 extends ClassFinalMethod{
  @Override
  public final void show(){
    System.out.println("overwrite show method");
  }
  public static void main(String[] args) {
    C6Exercise21 foo = new C6Exercise21();
    foo.show();
  }
}
