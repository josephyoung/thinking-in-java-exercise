/**
 * C6Exercise19:
 * (2)Create a class with a blank final reference to an object. Perform the
 * initialization of the blank final inside all constructors. Demonstrate the
 * guarantee that the final must be initialized before use, and that it cannot
 * be changed one initialized.
 */
public class C6Exercise19 {

  private final FinalTest obj;
  
  public C6Exercise19() {
    obj = new FinalTest();
  }

  public C6Exercise19(FinalTest obj) {
    this.obj = obj;
  }

  public void showReferenceAddress() {
    System.out.println(obj);
  }

  public static void main(String[] args) {
    C6Exercise19 foo = new C6Exercise19();
    foo.showReferenceAddress();
    // foo.obj = new C6Exercise19(); //compilation Error
  }
}

class FinalTest{}
