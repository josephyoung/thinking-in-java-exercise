package c5exercise8;

public class ConnectionManager {

  private static final int MAX = 5;
  private static int count = 0;
  private static Connection[] pool = new Connection[MAX];
  
  public static Connection getConnection() {
    if(count < MAX) {
      pool[count] = new Connection();
      return pool[count++];
    } else {
      return null;
    }
  }
}
