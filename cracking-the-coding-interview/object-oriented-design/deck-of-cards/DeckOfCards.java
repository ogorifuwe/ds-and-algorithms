import java.util.ArrayList;

public class DeckOfCards {
    
    public static void main(String[] args) {
        int numHands = 5;

        BlackJackGameAutomator automator =
            new BlackJackGameAutomator(numHands);
        automator.initializeDeck();
        boolean success = automator.dealInitial();
        if (!success) {
            System.out.print("Error. Out of cards.\n");
        } else {
            System.out.print("--Initial--");
            automator.printHandsAndScore();
            ArrayList<Integer> blackjacks =
                automator.getBlackJacks();
            if (blackjacks.size() > 0) {
                System.out.print("Blackjack at ");
                for (int i : blackjacks) {
                    System.out.print(i + ", ");
                }
                System.out.print(""+"\n");
            } else {
                success = automator.playAllHands();
                if (!success) {
                    System.out.print("Error. Out of cards.\n");
                } else {
                    System.out.print("\n-- Completed Game --\n");
                    automator.printHandsAndScore();
                    ArrayList<Integer> winners = automator.getWinners();
                    if (winners.size() > 0) {
                        System.out.print("Winners: ");
                        for (int i : winners) {
                            System.out.print(i + ", ");
                        }
                        System.out.print(""+"\n");
                    } else {
                        System.out.print("Draw. All players have busted.\n");
                    } 
                }
            }
        }
    }
}
