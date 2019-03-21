/**
 * C4Exercise11:
 * (4)Modify the previous exercise so that your finalize() will always be called.
 */
public class C4Exercise11 {

  String status;

  C4Exercise11() {
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
    System.gc();
  }
}
