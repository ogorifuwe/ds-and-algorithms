public abstract class Card {

    private boolean available = true;

    /* number or face that's on card - a number 2 through 10,
     * 1 -> Ace,
     * 11 -> Jack, 
     * 12 -> Queen, 
     * 13 -> King
     */
    protected int faceValue;
    protected Suit suit;

    public Card(int c, Suit s) {
        faceValue = c;
        suit = s;
    }

    public abstract int value();

    public Suit suit() { return suit; }

    /* return whether or not a card is available to give out
     * to someone */
    public boolean isAvailable() { return available; }

    public void markUnavailable() {
        available = false;
    }

    public void markAvailable() {
        available = true;
    }

    public void print() {
        String[] faceValues = {"A", "2", "3", "4", "5",
            "6", "7", "8", "9", "10", "J", "Q", "K"};
        System.out.print(faceValues[faceValue-1]);
        switch (suit) {
            case Club:
                System.out.print("c");
                break;
            case Diamond:
                System.out.print("d");
                break;
            case Heart:
                System.out.print("h");
                break;
            case Spade:
                System.out.print("s");
                break;
        }
        System.out.print(" ");
    }




}
