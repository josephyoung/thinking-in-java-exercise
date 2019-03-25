package chapter7_polymorphism.c7exercise14.rodent;

public class Shared {
  private int refcount = 0;
  private static long counter = 0;
  private final long id = counter++;

  public Shared() {
    System.out.println("creating " + this);
  }

  public void addRef() {
    refcount++;
  }

  protected void dispose() {
    if(refcount == 1) {
      System.out.println("diposing " + this);
      refcount--;
    } else {
      refcount--;
    }
  }

  @Override
  public String toString() {
    return "Shared " + id;
  }
}
