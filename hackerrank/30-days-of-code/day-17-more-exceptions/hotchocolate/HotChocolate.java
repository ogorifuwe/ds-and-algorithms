package hotchocolate;
import java.util.concurrent.TimeUnit;

class HotChocolate {

  public static final double tooCold = 160;
  public static final double tooHot = 185;

  public static void drinkHotChocolate(double cocoaTemp)  
              throws TooHotException, TooColdException {
    if (cocoaTemp >= tooHot) {
      throw new TooHotException();
    } else if (cocoaTemp <= tooCold) {
      throw new TooColdException();
    }
  }

  public static void main(String[] args) 
      throws TooColdException, TooHotException, InterruptedException {
    double currentCocoaTemp = 200;
    boolean wrongTemp = true;
    
    while (wrongTemp) {
      try {
        drinkHotChocolate(currentCocoaTemp);
        System.out.println("That cocoa was good!!!");
        wrongTemp = false;
      } catch(TooColdException e) {
          System.out.println("That's too cold, gotta heat it up!!!");
          currentCocoaTemp += 5;
      } catch(TooHotException e) {
          System.out.println("That's too hot, gotta let it sit for a while!!!");
          currentCocoaTemp -= 5;
      } 
      TimeUnit.SECONDS.sleep(2);
    }
    
    System.out.println("We made it to the end!");
  }
}
