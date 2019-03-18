/**
 * C4Exercise10:
 * (2)Create a class with a finalize() method that prints a message. In main(),
 * create an object of your class. Explain the behavior of your program.
 */
public class C4Exercise10 {

  String status;

  C4Exercise10() {
    status = "open";
    System.out.println("Work is " + status);
  }

  void doWork() {
    status = "progress";
    System.out.println("work in " + status);
  }

  void closeWork() {
    status = "closed";
    System.out.println("Work is " + status);
  }

  protected void finalize(){
    if(!status.equals("closed")) {
      System.out.println("Error: work has not been closed properly.");
    }
  }

  public static void main(String[] args) {
    C4Exercise11 work =  new C4Exercise11();
    work.doWork();
    work.closeWork();
    new C4Exercise11().doWork();
  }
}
