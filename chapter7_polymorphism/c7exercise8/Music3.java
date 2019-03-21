import java.util.Random;

/**
 * c7exercise8:
 * (2) Modify Music3.java so that it randomly creates Instrument objects the way
 * Shapes.java does.
 */
enum Note {
  MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  @Override
  public String toString() { return getClass().getName(); }
  void adjust() { print("Adjusting Instrument"); }
  void print(String s) { System.out.println(s); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  // String what() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  // String what() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  // String what() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  // String what() { return "Woodwind"; }
}

class Harmonica extends Instrument {
  void play(Note n) { print("Harmonica.play() " + n); }
}

class RandomInstrumentGenerator {
  private Random rand = new Random();
  Instrument next() {
    switch(rand.nextInt(6)) {
      default:
      case 0: return new Wind();
      case 1: return new Percussion();
      case 2: return new Stringed();
      case 3: return new Brass();
      case 4: return new Woodwind();
      case 5: return new Harmonica();
    }
  }
}

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  private static RandomInstrumentGenerator gen =
    new RandomInstrumentGenerator();

  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 9; i++) {
      Instrument ins = gen.next();
      tune(ins);
      System.out.println(ins);
    }
  }
} 
