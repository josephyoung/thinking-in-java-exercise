/**
 * C6Exercise24:
 * (2)In Beetle.java, inherit a specific type of beetle from class Beetle,
 * following the same format as the existing classes. Trace and explain the ouput.
 */

class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    System.out.println("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 = printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    System.out.println(s);
    return 47;
  }
}

class Beetle extends Insect {
  private int k = printInit("Beetel.k initialized");
  Beetle() {
    System.out.println("k = " + k);
    System.out.println("j = " + j);
  }
  private static int x2 = printInit("static Beetle.x2 initialized");
}

class C6Exercise24 extends Beetle {
  private int l = printInit("C6Exercise24.l initialized");
  C6Exercise24() {
    System.out.println("l = " + l);
    System.out.println("j = " + j);
  }
  private static int x3 = printInit("static C6Exercise24.x3 initialized");

  public static void main(String[] args) {
    System.out.println("C6Exercise24 constructor");
    C6Exercise24 foo = new C6Exercise24();
  }
}
