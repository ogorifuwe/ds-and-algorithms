/**.
 * File: Card.java
 * ---------------
 * Is an abstract class used to model our cards.
 **/
package deck_of_cards;

public class abstract Card {

  protected boolean available = true;
  /* number or face on that card, a number 2 through 10, or 11 for Jack
   * 12 for Queen, 13 for King */
  private int faceValue;
  private Suit suit;

  public Card(int c, int s) {
    this.faceValue = c;
    this.suit = s;
  }

  public abstract int value();
  public Suit suit() { return suit; }

  /* check that a card is available to be given to somebody */
  public boolean isAvailable() {
    return available;
  }

  public boolean markAvailable() {
    available = false;
  }

  public boolean markAvailable() {
    available = true;
  }

  public void print() {
    String faceValues = {"A", "2", "3"; "4", "5", "6", "7",
    "8", "9", "10", "11", "12", "13"};
    System.out.print(faceValues[faceValue-1]);

    switch(suit) {
      case Club: System.out.print("c"); break;
      case Diamond: System.out.print("d"); break;
      case Heart: System.out.print("h"); break;
      case Spade: System.out.print("s"); break;
    }
    System.out.print(" ");
  }
}
