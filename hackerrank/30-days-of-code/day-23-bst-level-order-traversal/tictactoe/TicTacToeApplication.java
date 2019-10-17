public class TicTacToeApplication {
  
  public static void main(String[] args) {
    /* getting input */
    java.util.Scanner stdIn =
          new java.util.Scanner(System.in);

    /* allows for cont. games */
    boolean doYouWantToPlay = true;
    while (doYouWantToPlay) {
      /* setting up our tokens and AI */
      System.out.println("Welcome to Tic Tac Toe!\n"
          +"Pick a character to play as and one for your opponent\n");
      System.out.println("Enter a character: ");
      char playerToken = stdIn.next().charAt(0);
      System.out.println("Enter a character fir your opponent: ");
      char aiToken = stdIn.next().charAt(0);
      
      TicTacToe game = new TicTacToe(playerToken, aiToken);
      AI ai = new AI();

      /* set up game */
      System.out.println();
      System.out.println("Start game...\n"
          + "Enter a number between 1-9 and your token goes there");
      game.printIndexBoard();
      System.out.println();

      /* game time */
      while (game.gameOver().equals("Not Over")) {
        if (game.currentMarker == game.userMarker) {
          /* User Turn */
          System.out.println("It's your turn! Enter a spot for your token");
          int spot = stdIn.nextInt();
          while(!game.playTurn(spot)) {
            System.out.println("Try again. "+spot + " is invalid.\n"
                +"This spot has already been taken or is out of range");
            spot = stdIn.nextInt();
          }
          System.out.println("You picked "+spot+" !");
        } else {
          /* AI's Turn */
          System.out.println("It's my turn!");
          /* Pick Spot */
          int aiSpot = ai.pickSpot(game);
          game.playTurn(aiSpot);
          System.out.println("I picked"+aiSpot+" !");
        }

        /* print out new board */
        System.out.println();
        game.printBoard();
      }

      System.out.println(game.gameOver());
      System.out.println();
      
      /* set up a new game or not */
      System.out.println("Do you want to play again? Enter y for yes or "
          +"any key for no");
      char response = stdIn.next().charAt(0);
      doYouWantToPlay = (response == 'Y');
      System.out.println();
      System.out.println();

      
    }
  }
}
