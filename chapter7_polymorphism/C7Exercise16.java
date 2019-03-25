/**
 * C7Exercise16:
 * (3)Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 */
class Starship {
  private AlertStatus as = new AlertStatus(0);
  
  public void changeState(int i) {
    as = new AlertStatus(i);
  }

  public void showState() {
    System.out.println(as);
  }
}

class AlertStatus {
  private int i;
  
  AlertStatus(int i) {
    if(i < 3 && i >= 0){
      this.i = i;
    } else {
      this.i = -1;
    }
  }

  @Override
  public String toString() {
    switch (i) {
      case 0:
        return "normal";
      case 1:
        return "warning";
      case 2:
        return "danger";
      default:
        return "wrong alert indicator";
    }
  }
}

public class C7Exercise16 {

  public static void main(String[] args) {
    Starship starship = new Starship();
    starship.showState();
    starship.changeState(1);
    starship.showState();
    starship.changeState(2);
    starship.showState();
  }  
}
