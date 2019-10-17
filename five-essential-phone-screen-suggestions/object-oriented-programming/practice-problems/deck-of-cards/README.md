Deck of Cards:
--------------
  Design a deck of cards that can be used for different card game
  applications.

  Hints:

  Likely classes: a Deck, a Card, a Hand, a Board, and possibly Rank
  and Suit. 
  
  * drill done on who's responsible for creating new Decks
  * where they get shuffled
  * how you you deal cards
  * do you need a different instance for every card in a casino in Vegas?


  This solution designs the data structures for a generic deck of cards.
  Subclasses the data structures to implement black jack.

  More hints:

  * Note that a "card deck" is very broad. You might want to think about a
    reasonable scope to the problem.

  * How, if at all, will you handle aces?

  Solution
  --------

  First, we need to recognize that a "generic" deck of cards can mean many
  things. Generic could mean a standard deck of card that can play a poker-
  like game, or it could even stretch to Uno or Baseball cards. It is impor-
  tant to ask your interviewer what they mean by generic.

  Let's assume that your interviewer clarifies that the deck is a standard
  52-card set, like you see used in a blackjack or poker game. If so, the
  design might look like this:
   
