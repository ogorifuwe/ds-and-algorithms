/**.
 * File: Suit.java
 * ---------------
 * An enum class, representing the design of a suit of 52 deck standard
 * card.
 */
package deck_of_cards;

public enum Suit {

  Club (0),
  Diamond (1),
  Heart (2),
  Spade (3);

  // ivar of value, denotes the value of the card
  private int value;

  /**. private constructor with a parameter of value */
  private Suit(int value) {
    this.value = value;
  }

  /**. encapsulates access to value of card using getter */
  public int getValue() { return value; }

  /**. @return returns the appropriate card corresponding
   * to value parsed
   **/
  public static Suit getSuitFromValue(int value) {
    switch (value) {
      case 0:
        return Suit.club;
      case 1:
        return Suit.Diamond;
      case 2:
        return Suit.Heart;
      case 3:
        return Suit.Spade;
      default:
        return null;
    }
    /* converted if else statement to switch-case statement, bcoz it is
     * cleaner code convention */

    /*if (value == 0) {
      return Suit.Club;
    } else if (value == 1) {
      return Suit.Diamond;
    } else if (value == 2) {
      return Suit.Heart;
    } else if (value == 3) {
      return Suit.Spade;
    }
    System.out.println("ERROR: Invalid input\n"
        + "Enter a value in the order 0 --> 3, for; Club, Diamond, "
        + "Heart, Spade");
    return null;
  }*/
}
