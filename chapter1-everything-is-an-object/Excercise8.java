import javax.print.event.PrintJobListener;

/**
 * Excercise8
 */
class Test {
  static String s = "Hello World";
}

public class Excercise8 {

  public static void main(String[] args) {
    Test test1 = new Test();
    Test test2 = new Test();
    Test test3 = new Test();
    Test test4 = new Test();
    Test test5 = new Test();
    System.out.println("test1.s is \"" +  test1.s + "\"");
    System.out.println("test2.s is \"" +  test2.s + "\"");
    System.out.println("test3.s is \"" +  test3.s + "\"");
    System.out.println("test4.s is \"" +  test4.s + "\"");
    System.out.println("test5.s is \"" +  test5.s + "\"");    
    System.out.println("Now change test1.s to \"Hello test1\"");
    System.out.println("...");
    test1.s = "Hello test1";
    System.out.println("test1.s is \"" +  test1.s + "\"");
    System.out.println("test2.s is \"" +  test2.s + "\"");
    System.out.println("test3.s is \"" +  test3.s + "\"");
    System.out.println("test4.s is \"" +  test4.s + "\"");
    System.out.println("test5.s is \"" +  test5.s + "\"");
    System.out.println("Now change test2.s to \"Hello test2\"");
    System.out.println("...");
    test2.s = "Hello test2";
    System.out.println("test1.s is \"" +  test1.s + "\"");
    System.out.println("test2.s is \"" +  test2.s + "\"");
    System.out.println("test3.s is \"" +  test3.s + "\"");
    System.out.println("test4.s is \"" +  test4.s + "\"");
    System.out.println("test5.s is \"" +  test5.s + "\"");
  }
}
