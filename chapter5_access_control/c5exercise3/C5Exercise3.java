/**
 * C5Exercise3:
 * (2)Create two packages: debug and debugoff, containing an identical class
 * with a debug() method. The first version diplays its String argument to the
 * console, the second does nothing. Use a static import line to import the
 * class into a test program, and demonstrate the conditional compilation effect.
 */
import static c5exercise3.debug.Debug.*;
// import static c5exercise3.debugoff.Debug.*;

public class C5Exercise3 {

  public static void main(String[] args) {
    debug("debug output!");
  }  
}
