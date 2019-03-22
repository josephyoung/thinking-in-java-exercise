/**
 * c7exercise6:
 * (1)Change Music3.java so that what() becomes the root Object method
 * toString(). Try printing the Instrument objects using System.out.println()
 * (without any casting).
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

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }
  public static void printAll(Instrument[] e) {
    for (Instrument i : e) {
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };
    tuneAll(orchestra);
    printAll(orchestra);
  }
}