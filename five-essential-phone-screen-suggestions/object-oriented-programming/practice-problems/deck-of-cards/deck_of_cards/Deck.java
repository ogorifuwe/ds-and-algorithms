/**.
 * File: Deck.java
 * A class representing a deck of cards. Extends the Card class as a
 * type for modelling our cards.
 **/
package deck_of_cards;
import java.util.ArrayList;

public class Deck<T extends Card> {

  private ArrayList<T> cards; // all the cards dealt or not
  private int dealtIndex;

  /**. an empty constructor **/
  public Deck() {}

  public void setDeckOfCards(ArrayList<T> deckOfCards) {
    this.cards = deckOfCards;
  }

  public void shuffle() {
    for (int i = 0; i < cards.size(); ++i) {
      int j = randomIntInRange(i, cards.size() - i - 1);
      T card1 = cards.get(i);
      T card2 = cards.get(j);
      card.set(i, card2);
      card.set(j, card1);
    }
  }

  public int randomIntInRange(int min, int max) {
    return randomInt(max - 1 - min) + min; 
  }

  public int randomInt(int n) {
    return (int) Math.random() * n;
  }

  public int remainingCards() {
    return cards.size() - dealtIndex;
  }

  public T[] dealHand(int number) {
    if (remainingCards() < number) {
      return null;
    }

    T[] hand = (T[]) new Card[numbers];
    int count = 0;
    while (count < number) {
      T card = dealCard();
      if (card != null) {
        hand[count] = card;
        count++;
      }
    }

    return hand;
  }

  public T dealCard() {
    if (remainingCards() == 0) {
      return null;
    }
    T card = cards.get(dealtIndex);
    card.markUnavailable;
    dealtIndex++;
    
    return card;
  }

  public void print() {
    for (Card card: cards) {
      card.print();
    }
  }
}
