/**.
 * Restaurant.java
 * ---------------
 * An example implementation of Singleton Pattern
 **/
public class Restaurant {

  // private static ivar of class type
  private static Restaurant _instance = null;

  /**.
   * empty private constructor to prevent external
   * instantiation of this class
   **/
  private Restaurant() {}

  /**.
   * @pre _instance is null
   * @return returns an instance of this class
   **/
  public static Restaurant getInstance() {
    if (_instance == null) {
      _instance = new Restaurant();
    }
    return _instance;
  } 
}
