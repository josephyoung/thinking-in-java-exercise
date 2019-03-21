/**
 * C2Exercise4:
 * (2)Write a program that calculates velocity using a constant distance and a
 * constant time.
 */
public class C2Exercise4 {

  public static double velocity(double s, double t) {
    if(s > 0 && t > 0 ) {
      return s / t;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    double s = 2019;
    double t = 10;
    System.out.println("The velocity is " + velocity(s, t) + " m/s.");
  }
}
