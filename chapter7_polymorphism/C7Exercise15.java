/**
 * C7Exercise15:
 * (2)Add a RectangularGlyph to PolyConstructors.java and demonstrate the
 * problem described in this section.
 */

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
  public void print(String s) {
    System.out.println(s);
  }
}

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}

class RectangularGlyph extends Glyph {
  private int longside = 2;
  private int shortside = 1;

  RectangularGlyph(int l, int s) {
    longside = l;
    shortside = s;
    print("RectangularGlyph.RectangularGlyph() , longside = " + longside +
    ", shortside = " + shortside);
  }

  void draw() {
    print("RectangularGlyph.draw(), longside = " + longside +
    ", shortside = " + shortside);
  }
}

public class C7Exercise15 {
  public static void main(String[] args) {
    new RoundGlyph(5);
    new RectangularGlyph(100, 60);
  }
}
