/** C3Exercise6:
 * (2)Modify the two test() methods in the previous two programs so that they
 * take two extra arguments, begin and end, and so that testval is tested to
 * see if it is within the range beween (and including) begin and end.
 **/ 

class IfElse {
  static boolean test(int testval, int begin, int end) {
    if(testval >= begin && testval <= end) {
      return true;
    } else {
      return false;
    }
  }
}

public class C3Exercise6 {

  public static void main(String[] args) {
    System.out.println(IfElse.test(10, 1, 100));
    System.out.println(IfElse.test(10, 1, 10));
    System.out.println(IfElse.test(100, 1, 99));
  }
}
