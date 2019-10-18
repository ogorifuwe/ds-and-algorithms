class WithoutDoubles {

  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
   if (!noDoubles) {
     return die1 + die2;
   } else {
      if (die1 == die2 && die1 == 6) return die2 + 1;
      if (die1 == die2) return die1 + die2 + 1;
      else return die1 + die2;
   }
  }
  
}
