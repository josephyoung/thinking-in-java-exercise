/**
 * C4Exercise12:
 * (4)Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up.
 * Write a finalize() that verifies this termination condition. In main(), test
 * the possible scenarios that can occur when your Tank is used.
 */
class Tank {
  boolean fillStatus = false;

  void fill() {
    fillStatus = true;
  }

  void empty() {
    fillStatus = false;
  }

  @Override
  protected void finalize() {
    if(fillStatus) {
      System.out.println("Tank should be emptyied.");
    }
  }
}

public class C4Exercise12 {

  public static void main(String[] args) {
    Tank foo = new Tank();
    foo.fill();
    foo.empty();
    new Tank().fill();
    System.gc();
  }  
}
