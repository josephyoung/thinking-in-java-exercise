/**
 * C5Exercise4:
 * (2)Show that protected methods have package access but are not public.
 */
package c5exercise4;

public class TestMethod1 {
 
  public static void main(String[] args) {
    MethodProtected m = new MethodProtected();
    m.methodProtected();
  }
}
