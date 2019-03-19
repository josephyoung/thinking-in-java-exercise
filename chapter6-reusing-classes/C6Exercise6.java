/**
 * C6exercise6:
 * (1)Using Chess.java, prove the statements in the previous paragraph.
 */
class Game {
  Game(int i) {
    System.out.println("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    super(i);
    System.out.println("BoardGame constructor");
  }
}

class Chess extends BoardGame {
  Chess() {

    System.out.println("Chess constructor");
    super(11);    
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
}

public class C6Exercise6 {
  public static void main(String[] args) {
    new Chess();
  }
}
// Output:
//  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
// Implicit super constructor BoardGame() is undefined. Must explicitly invoke another constructor
// Constructor call must be the first statement in a constructor
