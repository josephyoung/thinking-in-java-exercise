/**
 * Excercise11
 */
public class Excercise11 {

  public static void main(String[] args) {
    class AllTheColorsOfTheRainbow {
    
      int anIntegerRepresentingColors;
      void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
      }
    }
    AllTheColorsOfTheRainbow foo = new AllTheColorsOfTheRainbow();
    foo.changeTheHueOfTheColor(255);
    System.out.println(String.valueOf(foo.anIntegerRepresentingColors));
  }
}
