/**
 * (3) Write a program that simulates coin-flipping. 
 */
import java.util.Random;
import java.util.Scanner;

class Coin {

  Random rand;

  Coin (int seed) {
    this.rand = new Random(seed);
  }
  
  boolean coinFlipping() {
    return this.rand.nextBoolean();
  }
}

/**
 * C2Exercise7
 */
public class C2Exercise7 {

  public static void main(String[] args) {
    Coin coin = new Coin(36);
    String s = "y";
    Scanner sc = new Scanner(System.in);
    while(s.equals("y") || s.equals("Y")){
      System.out.println("Flipping the coin...");
      System.out.println(coin.coinFlipping() ? "Head" : "Tail");
      System.out.print("Again?(Y/N): ");
      s = sc.next();
    }
    sc.close();
  }
}
