class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
}

class Detergent {
  private Cleanser cleanser = new Cleanser();

  public void dilute() {
    cleanser.dilute();
  }
  
  public void apply() {
    cleanser.apply();
  }

  public void scrub() {
    cleanser.append(" Detergent.scrub()");
    cleanser.scrub();    
  }

  public void foam() {
    cleanser.append(" foam()");
  }

  public String toString() {
    return cleanser.toString();
  }
}

public class C6Exercise11 {

  public static void main(String[] args) {
    Detergent detergent = new Detergent();
    detergent.dilute();
    detergent.apply();
    detergent.scrub();
    detergent.foam();
    System.out.println(detergent);
  }  
}
